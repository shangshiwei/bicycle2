package com.aowin.controller;


import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aowin.model.Syuser;
import com.aowin.service.SyuserService;
import com.github.pagehelper.PageInfo;

@RestController
public class SyuserController {
	
	private Logger logger = Logger.getLogger(SyuserController.class);
	
	@Autowired
	private SyuserService syuserServiceImpl;
	
	
	@RequestMapping("/login")
	public Syuser login(@Validated({Syuser.B.class}) Syuser syuser,BindingResult br, HttpSession session) {
		//如果验证不合法 直接返回
		if(br.hasErrors()) {
			return null;
		}
		
		Syuser user = syuserServiceImpl.login(syuser);
		if(user != null) {
			if(session.getAttribute("syuser") != null) {
				session.removeAttribute("syuser");
			}
			session.setAttribute("syuser", user);
		}
		return user;
	}
	
	@RequestMapping("/main/syuser/insert")
	public String insert(@Validated({Syuser.A.class}) Syuser syuser,BindingResult br) {
		if(br.hasErrors()) {
			return "fail";
		}
		try {
			
			syuserServiceImpl.insert(syuser);
		}catch (Exception e) {
			e.printStackTrace();
			logger.error("服务端异常", e);
			return "error";
		}
		return "success";
	}
	
	@RequestMapping("/main/syuser/select")
	public PageInfo<Syuser> select(@RequestParam(defaultValue = "1") int pageNum,Syuser syuser){
		return syuserServiceImpl.select(pageNum, syuser);
	}
	
	@RequestMapping("/main/syuser/delete")
	public String delete(@Validated({Syuser.A.class}) Syuser syuser,BindingResult br) {
		if(br.hasErrors()) {
			return "fail";
		}
		
		try {
			
			syuserServiceImpl.delete(syuser.getUserId());
		}catch (Exception e) {
			e.printStackTrace();
			logger.error("服务端异常", e);
			return "error";
		}
		return "success";
		
	}
	
	@RequestMapping("/main/syuser/update")
	public String update(@Validated({Syuser.A.class}) Syuser syuser,BindingResult br) {
		if(br.hasErrors()) {
			return "fail";
		}
		try {
			
			syuserServiceImpl.update(syuser);
		}catch (Exception e) {
			e.printStackTrace();
			logger.error("服务端异常", e);
			return "error";
		}
		return "success";
		
	}

	
}

