package com.aowin.dao;

import java.util.List;

import com.aowin.model.Bicycle_info;

public interface Bicycle_infoMapper {
	/**
	 * 查询车辆编号最大值
	 * @return
	 */
	public String select();
	/**
	 * 增加车辆状态信息
	 * @param bicycle_info
	 * @return
	 */
	public int insert(Bicycle_info bicycle_info);
	/**
	 * 分页查询
	 * @return
	 */
	public List<Bicycle_info> selectPage();
	/**
	 * 更改车桩状态
	 * @param bicycle_pile
	 * @return
	 */
	public int update(Bicycle_info bicycle_info);
}
