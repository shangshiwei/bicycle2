package com.aowin.dao;

import java.util.List;

import com.aowin.model.Bicycle_detail;
import com.aowin.model.Bicycle_order;

public interface Bicycle_detailMapper {
	/**
	 * 分页查询   无模糊查询条件
	 * @return
	 */
	public List<Bicycle_detail> select (Bicycle_order bicycle_order);
	/**
	 * 新增主单
	 * @param bicycle_order
	 * @return
	 */
	public int insert(Bicycle_detail bicycle_detail);
	/**
	 * 删除
	 * @param bicycle_order_detail
	 * @return
	 */
	public int delete(Bicycle_detail bicycle_detail);
}
