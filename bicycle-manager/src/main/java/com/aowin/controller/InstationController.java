package com.aowin.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aowin.model.Bicycle_info;
import com.aowin.model.Bicycle_pile;
import com.aowin.model.Bicycle_station;
import com.aowin.model.Syuser;
import com.aowin.service.InstationSerivce;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/main/instation")
public class InstationController {
	
	private Logger logger = Logger.getLogger(InstationController.class);
	@Autowired
	private InstationSerivce instationSerivceImpl;
	//车辆状态分页查询
	@RequestMapping("select1")
	public PageInfo<Bicycle_info> select(@RequestParam(defaultValue = "1") int pageNum){
		return instationSerivceImpl.selectPage(pageNum);
	}
	//车点信息分页查询
	@RequestMapping("select2")
	public PageInfo<Bicycle_station> select2(@RequestParam(defaultValue = "1") int pageNum){
		return instationSerivceImpl.select(pageNum);
	}
	
	//根据车点查询车桩
	@RequestMapping("select3")
	public List<Bicycle_pile> select(Bicycle_station bicycle_station){
		return instationSerivceImpl.select(bicycle_station);
	}
	//新车入桩操作
	@RequestMapping("bicycleToPile")
	public String bicycleToPile(@RequestBody Bicycle_info[] bicycle_infos,HttpSession session) {
		
		if(bicycle_infos.length == 0) {
			return "fail";
		}
		try {
			Syuser user = (Syuser)session.getAttribute("syuser");
			
			instationSerivceImpl.bicycleToPile(bicycle_infos, user);
		}catch (Exception e) {
			e.printStackTrace();
			logger.error("服务端异常", e);
			return "error";
		}
		return "success";
	}
}
