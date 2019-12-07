package com.aowin.dao;

import java.util.List;

import com.aowin.model.Bicycle_order;

public interface Bicycle_orderMapper {
	/**
	 * 分页查询   无模糊查询条件
	 * @return
	 */
	public List<Bicycle_order> select ();
	/**
	 * 新增主单
	 * @param bicycle_order
	 * @return
	 */
	public int insert(Bicycle_order bicycle_order);
	
}
