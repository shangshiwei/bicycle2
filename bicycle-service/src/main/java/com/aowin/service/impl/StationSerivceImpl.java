package com.aowin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aowin.dao.Bicycle_pileMapper;
import com.aowin.dao.Bicycle_stationMapper;
import com.aowin.model.Bicycle_pile;
import com.aowin.model.Bicycle_station;
import com.aowin.service.StationSerivce;
@Service
public class StationSerivceImpl implements StationSerivce{
	@Autowired
	private Bicycle_stationMapper bicycle_stationMapper;
	@Autowired
	private Bicycle_pileMapper bicycle_pileMapper;
	@Override
	public List<Bicycle_station> selectMap() {
		List<Bicycle_station> stations = bicycle_stationMapper.select();
		for(Bicycle_station s:stations) {
			s.setBicycle_num(bicycle_pileMapper.select3(s));
		}
		return stations;
	}

	@Override
	public List<Bicycle_pile> selectPileMap(Bicycle_station bicycle_station) {
		return bicycle_pileMapper.select2(bicycle_station);
	}
}
