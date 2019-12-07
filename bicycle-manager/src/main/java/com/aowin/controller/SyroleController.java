package com.aowin.controller;


import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aowin.model.Syrole;
import com.aowin.service.SyroleService;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/main/role")
public class SyroleController {
private Logger logger = Logger.getLogger(SyroleController.class);
	
	@Autowired
	private SyroleService syroleServiceImpl;
	
	@RequestMapping("/select")
	public PageInfo<Syrole> select(@RequestParam(defaultValue = "1") int pageNum,Syrole syrole){
		return syroleServiceImpl.select(pageNum, syrole);
	}
	@RequestMapping("/select2")//不分页
	public List<Syrole> select2(Syrole syrole){
		return syroleServiceImpl.select2(syrole);
	}
	/**
	 * 数据校验 在需要被校验的对象上 添加@Validated 跟在这个参数后面添加一个BindingResult的对象
	 * 
	 * BindingResult 对象用来保存验证的结果的
	 * @param msPhase
	 * @param br
	 * @return
	 */
	@RequestMapping("/insert")
	public String insert(@RequestParam(value = "phaseId[]") Integer[] phaseId,@Validated Syrole syrole,BindingResult br) {
		if(br.hasErrors()) {
			return "fail";
		}
		try {
			syroleServiceImpl.insert(phaseId,syrole);
		}catch (Exception e) {
			e.printStackTrace();
			logger.error("服务端异常", e);
			return "error";
		}
		return "success";
		
	}
	
	@RequestMapping("/update")
	public String update(@RequestParam(value = "phaseId[]") Integer[] phaseId,@Validated Syrole syrole,BindingResult br) {
		if(br.hasErrors()) {
			return "fail";
		}
		try {
			
			syroleServiceImpl.update(phaseId,syrole);
		}catch (Exception e) {
			e.printStackTrace();
			logger.error("服务端异常", e);
			return "error";
		}
		return "success";
		
	}

	@RequestMapping("/delete")
	public String delete(Integer role_id) {
		if(role_id == null) {
			return "fail";
		}
		try {
			
			syroleServiceImpl.delete(role_id);
		}catch (Exception e) {
			e.printStackTrace();
			logger.error("服务端异常", e);
			return "error";
		}
		return "success";
		
	}
	
}

