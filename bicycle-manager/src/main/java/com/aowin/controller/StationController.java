package com.aowin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aowin.model.Bicycle_pile;
import com.aowin.model.Bicycle_station;
import com.aowin.service.StationSerivce;

@RestController
@RequestMapping("/main/station")
public class StationController {
	
	@Autowired
	private StationSerivce stationSerivceImpl;
	//车点查询（不分页）
		@RequestMapping("/selectMap")
		public List<Bicycle_station> selectMap(){
			List<Bicycle_station> map = stationSerivceImpl.selectMap();
			return map;
		}
		//地图查询所有车桩
		@RequestMapping("/selectPileMap")
		public List<Bicycle_pile> selectPileMap(int stationId){
			Bicycle_station bicycle_station = new Bicycle_station();
			bicycle_station.setStation_id(stationId);
			return stationSerivceImpl.selectPileMap(bicycle_station);
			
		}
}
