package com.aowin.dao;

import java.util.List;

import com.aowin.model.Bicycle_info;
import com.aowin.model.Bicycle_pile;
import com.aowin.model.Bicycle_station;

public interface Bicycle_pileMapper {
	/**
	 * 查询状态为2（无车）的车桩
	 * @return
	 */
	public List<Bicycle_pile> select(Bicycle_station bicycle_station);
	/**
	 * 查询所有的车桩
	 * @return
	 */
	public List<Bicycle_pile> select2(Bicycle_station bicycle_station);
	/**
	 * 查询有车的车桩数量
	 * @param bicycle_station
	 * @return
	 */
	public Integer select3(Bicycle_station bicycle_station);
	/**
	 * 更改车桩状态
	 * @return
	 */
	public int update(Bicycle_info bicycle_info);
}
