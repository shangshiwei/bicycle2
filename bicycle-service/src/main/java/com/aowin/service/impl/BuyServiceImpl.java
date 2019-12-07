package com.aowin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aowin.constants.PageConfig;
import com.aowin.dao.Bicycle_catagoryMapper;
import com.aowin.dao.Bicycle_dealMapper;
import com.aowin.dao.Bicycle_detailMapper;
import com.aowin.dao.Bicycle_infoMapper;
import com.aowin.dao.Bicycle_orderMapper;
import com.aowin.dao.VenderMapper;
import com.aowin.exception.MyException;
import com.aowin.model.Bicycle_catagory;
import com.aowin.model.Bicycle_deal;
import com.aowin.model.Bicycle_detail;
import com.aowin.model.Bicycle_info;
import com.aowin.model.Bicycle_order;
import com.aowin.model.Syuser;
import com.aowin.model.Vender;
import com.aowin.service.BuyService;
import com.aowin.util.DateUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class BuyServiceImpl implements BuyService {
	@Autowired
	private Bicycle_orderMapper bicycle_orderMapper;
	@Autowired
	private Bicycle_detailMapper bicycle_detailMapper;
	@Autowired
	private Bicycle_dealMapper bicycle_dealMapper;
	@Autowired
	private VenderMapper venderMapper;
	@Autowired
	private Bicycle_infoMapper bicycle_infoMapper;
	@Autowired
	private Bicycle_catagoryMapper bicycle_catagoryMapper;

	// 模糊查询
	public PageInfo<Bicycle_order> select(int pageNum) {
		PageHelper.startPage(pageNum, PageConfig.PAGE_SIZE);
		List<Bicycle_order> bicycle_orders = bicycle_orderMapper.select();

		return new PageInfo<Bicycle_order>(bicycle_orders);
	}

	// 新增
	@Transactional
	public int insert(Bicycle_order bicycle_order, Syuser user,Bicycle_info bicycle_info) {
		// 1.新增主单
		bicycle_order.setUser_id(user.getUserId());
		int x = bicycle_orderMapper.insert(bicycle_order);
		if (x == 0) {
			throw new MyException("系统错误！");
		}
		// 2.新增业务流水表
		Bicycle_deal bicycle_deal = new Bicycle_deal();
		bicycle_deal.setUser_id(user.getUserId());
		bicycle_deal.setChg_money(bicycle_order.getBuy_price());
		bicycle_deal.setRecord_id(bicycle_order.getOrder_id());
		bicycle_deal.setUser_id(user.getUserId());
		bicycle_deal.setCreate_time(DateUtil.currentTime());
		bicycle_deal.setDeal_name("车辆购入");
		int y = bicycle_dealMapper.insert(bicycle_deal);
		if (y == 0) {
			throw new MyException("系统错误！");
		}
	
		for(Bicycle_detail d:bicycle_order.getDetails()) {
			// 3.增加车辆状态信息
			// 先查询编号，若有则取最大值加1，若无则等于10000000，然后增加状态信息
			String bicycle_code = bicycle_infoMapper.select();

			if (bicycle_code == null || bicycle_code == " ") {
				bicycle_code = "10000000";
			} else {
				int n = Integer.parseInt(bicycle_code);
				n += 1;
				bicycle_code = String.valueOf(n);
			}
			bicycle_info.setUser_id(user.getUserId());
			bicycle_info.setBicycle_code(bicycle_code);
			bicycle_info.setOperator_time(DateUtil.currentTime());

			int n1 = bicycle_infoMapper.insert(bicycle_info);
			if (n1 == 0) {
				throw new MyException("系统错误！");
			}
			//4.增加车辆明细信息
			d.setOrder_id(bicycle_order.getOrder_id());
			d.setBicycle_id(bicycle_info.getBicycle_id());
			d.setCreate_date(DateUtil.currentTime());
			bicycle_detailMapper.insert(d);
		}
		return 1;
		
		
	}

	@Override
	public List<Vender> select2() {

		return venderMapper.select();
	}
	@Override
	public PageInfo<Bicycle_detail> select(int pageNum,Bicycle_order bicycle_order) {
		PageHelper.startPage(pageNum, PageConfig.PAGE_SIZE);
		List<Bicycle_detail> bicycle_order_details = bicycle_detailMapper.select(bicycle_order);
		
		return new PageInfo<Bicycle_detail>(bicycle_order_details);
	}

	@Override
	public List<Bicycle_catagory> select() {
	
		return bicycle_catagoryMapper.select();
	}
}
