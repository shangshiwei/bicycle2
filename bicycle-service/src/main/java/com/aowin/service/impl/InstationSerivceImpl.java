package com.aowin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aowin.constants.PageConfig;
import com.aowin.dao.Bicycle_dealMapper;
import com.aowin.dao.Bicycle_deployMapper;
import com.aowin.dao.Bicycle_infoMapper;
import com.aowin.dao.Bicycle_pileMapper;
import com.aowin.dao.Bicycle_stationMapper;
import com.aowin.exception.MyException;
import com.aowin.model.Bicycle_deal;
import com.aowin.model.Bicycle_deploy;
import com.aowin.model.Bicycle_info;
import com.aowin.model.Bicycle_pile;
import com.aowin.model.Bicycle_station;
import com.aowin.model.Syuser;
import com.aowin.service.InstationSerivce;
import com.aowin.util.DateUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
@Service
public class InstationSerivceImpl implements InstationSerivce {
	@Autowired
	private Bicycle_infoMapper Bicycle_infoMapper;
	@Autowired
	private Bicycle_stationMapper bicycle_stationMapper;
	@Autowired
	private Bicycle_pileMapper bicycle_pileMapper;
	@Autowired
	private Bicycle_deployMapper bicycle_deployMapper;
	@Autowired
	private Bicycle_dealMapper bicycle_dealMapper;
	
	@Override
	public PageInfo<Bicycle_info> selectPage( int pageNum) {
		
		PageHelper.startPage(pageNum, PageConfig.PAGE_SIZE);
		List<Bicycle_info> bicycle_info = Bicycle_infoMapper.selectPage();

		return new PageInfo<Bicycle_info>(bicycle_info);
	}

	@Override
	public PageInfo<Bicycle_station> select(int pageNum) {
		
		PageHelper.startPage(pageNum, PageConfig.PAGE_SIZE);
		List<Bicycle_station> bicycle_station = bicycle_stationMapper.select();

		return new PageInfo<Bicycle_station>(bicycle_station);
	}

	@Override
	public List<Bicycle_pile> select(Bicycle_station bicycle_station) {
		return bicycle_pileMapper.select(bicycle_station);
	}

	@Override
	@Transactional
	public void bicycleToPile(Bicycle_info[] bicycle_infos,Syuser user) {
		for(Bicycle_info bicycle_info:bicycle_infos) {
			//1.被选中的车辆的状态改为3（入桩） 添加其所在车桩id
			int n1 = Bicycle_infoMapper.update(bicycle_info);
			if (n1 == 0) {
				throw new MyException("系统错误！");
			}
			//2.将调入车桩状态改为1（有车），写入所存车辆id
			int n2 = bicycle_pileMapper.update(bicycle_info);
			if (n2 == 0) {
				throw new MyException("系统错误！");
			}
			//3.增加车辆调配明细记录
			Bicycle_deploy bicycle_deploy = new Bicycle_deploy();
			bicycle_deploy.setBicycle_id(bicycle_info.getBicycle_id());//添加车辆id
			bicycle_deploy.setTo_pile_id(bicycle_info.getPile_id());//添加调入车桩id
			bicycle_deploy.setTo_time(DateUtil.currentTime());//调入时间
			bicycle_deploy.setTo_reason("购入调入");//调入原因填写（1：购入调入）
			
			int n3 = bicycle_deployMapper.insert(bicycle_deploy);
			if (n3 == 0) {
				throw new MyException("系统错误！");
			}
			//4.增加车辆业务流水
			Bicycle_deal bicycle_deal = new Bicycle_deal();
			bicycle_deal.setCreate_time(DateUtil.currentTime());//发生时间
			bicycle_deal.setDeal_name("普通调入");//业务名称填写(普通调入)
			bicycle_deal.setRecord_id(bicycle_deploy.getDeploy_id());//关联的业务记录id填写车辆调配明细id
			bicycle_deal.setBicycle_id(bicycle_info.getBicycle_id());
			bicycle_deal.setPile_id(bicycle_info.getPile_id());
			bicycle_deal.setUser_id(user.getUserId());
			bicycle_dealMapper.insert2(bicycle_deal);
		}
	}

	
	
	
}
