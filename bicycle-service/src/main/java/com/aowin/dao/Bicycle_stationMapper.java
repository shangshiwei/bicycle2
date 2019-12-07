package com.aowin.dao;

import java.util.List;

import com.aowin.model.Bicycle_station;

public interface Bicycle_stationMapper {
	/**
	 * 分页查询
	 * @return
	 */
	public List<Bicycle_station> select();
}
