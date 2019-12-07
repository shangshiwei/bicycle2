package com.aowin.service;

import java.util.List;

import com.aowin.model.Bicycle_catagory;
import com.aowin.model.Bicycle_detail;
import com.aowin.model.Bicycle_info;
import com.aowin.model.Bicycle_order;
import com.aowin.model.Syuser;
import com.aowin.model.Vender;
import com.github.pagehelper.PageInfo;

public interface BuyService {
	/**
	 * 分页查询   无模糊查询条件
	 * @return
	 */
	public PageInfo<Bicycle_order> select (int pageNum);
	/**
	 * 新增主单
	 * @param bicycle_order
	 * @return
	 */
	public int insert(Bicycle_order bicycle_order,Syuser user,Bicycle_info bicycle_info);
	/**
	 * 查询供应商名称
	 * @return
	 */
	public List<Vender> select2();
	/**
	 * 分页查询   无模糊查询条件
	 * @return
	 */
	public PageInfo<Bicycle_detail> select (int pageNum,Bicycle_order bicycle_order);
	/**
	 * 查询车辆类型
	 * @return
	 */
	public List<Bicycle_catagory> select();
}
