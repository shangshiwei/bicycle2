package com.aowin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aowin.constants.PageConfig;
import com.aowin.dao.SyPermissionMapper;
import com.aowin.dao.SyroleMapper;
import com.aowin.exception.MyException;
import com.aowin.model.SyPermission;
import com.aowin.model.Syrole;
import com.aowin.service.SyroleService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class SyroleServiceImpl implements SyroleService{
	@Autowired
	private SyroleMapper syroleMapper;
	@Autowired
	private SyPermissionMapper syPermissionMapper;
	
	@Transactional
	public PageInfo<Syrole> select(int pageNum,Syrole syrole){
		PageHelper.startPage(pageNum, PageConfig.PAGE_SIZE);
		List<Syrole> syroles = syroleMapper.select(syrole);
		
		if (syroles.size() == 0) {
			throw new MyException("系统错误！");
		}
		
		for(Syrole sy:syroles) {
			sy.setPhaseIds(syPermissionMapper.selectByroleId2(sy.getRole_id()));
			sy.setPhases(syPermissionMapper.selectByroleId(sy.getRole_id()));
		}
		return new PageInfo<Syrole>(syroles);
	}
	@Transactional
	public int insert(Integer[] phaseIds,Syrole syrole) {
		
		int n = syroleMapper.insert(syrole);
		if (n == 0) {
			throw new MyException("系统错误！");
		}
		for(Integer in:phaseIds) {
			SyPermission syPermission = new SyPermission();
			syPermission.setRoleId(syrole.getRole_id());
			syPermission.setPhaseId(in);
			syPermissionMapper.insert(syPermission);
		}
		return n;
			
		
	}
	@Transactional
	public int update(Integer[] phaseIds,Syrole syrole) {
		
		int n1 = syroleMapper.update(syrole);
		if (n1 == 0) {
			throw new MyException("系统错误！");
		}
		int n2 = syPermissionMapper.delete(syrole.getRole_id());
		if (n2 == 0) {
			throw new MyException("系统错误！");
		}
		for(Integer in:phaseIds) {
			SyPermission syPermission = new SyPermission();
			syPermission.setRoleId(syrole.getRole_id());
			syPermission.setPhaseId(in);
			syPermissionMapper.insert(syPermission);
		}
		return n2;
	}
	@Transactional
	public int delete(int role_id) {
		int n = syPermissionMapper.delete(role_id);
		if (n == 0) {
			throw new MyException("系统错误！");
		}
		syroleMapper.delete(role_id);
		return n;
	}
	
	public Syrole selectById(int role_id){
		
		return syroleMapper.selectById(role_id);
	}
	@Override
	public List<Syrole> select2(Syrole syrole) {
		return syroleMapper.select(syrole);
	}
}
