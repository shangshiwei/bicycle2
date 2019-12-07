package com.aowin.service;

import java.util.List;

import com.aowin.model.Bicycle_pile;
import com.aowin.model.Bicycle_station;

public interface StationSerivce {
	/**
	 * 地图查询车点
	 * @return
	 */
	public List<Bicycle_station> selectMap();
	/**
	 * 地图查询车桩
	 * @return
	 */
	public List<Bicycle_pile> selectPileMap(Bicycle_station bicycle_station);
}
