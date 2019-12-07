package com.aowin.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aowin.model.Bicycle_catagory;
import com.aowin.model.Bicycle_detail;
import com.aowin.model.Bicycle_info;
import com.aowin.model.Bicycle_order;
import com.aowin.model.Syuser;
import com.aowin.model.Vender;
import com.aowin.service.BuyService;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/main/buy")
public class BuyController {
	
	private Logger logger = Logger.getLogger(BuyController.class);
	
	@Autowired
	private BuyService buyServiceImpl;
	//主单分页查询
	@RequestMapping("/select")
	public PageInfo<Bicycle_order> select(@RequestParam(defaultValue = "1") int pageNum){
		return buyServiceImpl.select(pageNum);
	}
	//遍历供应商
	@RequestMapping("/select2")
	public List<Vender> select2(){
		return buyServiceImpl.select2();
	}
	//明细分页查询
	@RequestMapping("/select3")
	public PageInfo<Bicycle_detail> select3(@RequestParam(defaultValue = "1") int pageNum,Bicycle_order bicycle_order){
		return buyServiceImpl.select(pageNum,bicycle_order);
	}
	//车辆类型查询
	@RequestMapping("/select4")
	public List<Bicycle_catagory> select4(){
		
		return buyServiceImpl.select();
	}
	@RequestMapping("/insert")
	public String insert(@RequestBody @Validated Bicycle_order order,BindingResult br,HttpSession session) {
		if(br.hasErrors()) {
			return "fail";
		}
		try {
			Syuser user = (Syuser)session.getAttribute("syuser");
			
			Bicycle_info bicycle_info = new Bicycle_info();
			bicycle_info.setUser_id(user.getUserId());
			buyServiceImpl.insert(order,user,bicycle_info);
		}catch (Exception e) {
			e.printStackTrace();
			logger.error("服务端异常", e);
			return "error";
		}
		return "success";
		
	}
}
