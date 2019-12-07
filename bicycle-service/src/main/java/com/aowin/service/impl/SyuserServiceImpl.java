package com.aowin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aowin.constants.PageConfig;
import com.aowin.dao.SyPermissionMapper;
import com.aowin.dao.SyuserMapper;
import com.aowin.model.Syuser;
import com.aowin.service.SyuserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class SyuserServiceImpl implements SyuserService{
	
	@Autowired
	private SyuserMapper syuserMapper;
	@Autowired
	private SyPermissionMapper syPermissionMapper;

	@Override
	public Syuser login(Syuser syuser) {
		Syuser user = syuserMapper.login(syuser);
		user.setPhases(syPermissionMapper.selectURL(user.getRoleId()));
		return user;
	}

	@Override
	public int insert(Syuser syuser) {
		return syuserMapper.insert(syuser);
	}
	@Override
	@Transactional
	public PageInfo<Syuser> select(int pageNum,Syuser syuser){
		PageHelper.startPage(pageNum, PageConfig.PAGE_SIZE);
		List<Syuser> user = syuserMapper.select(syuser);
		return new PageInfo<Syuser>(user);
	}
	@Override
	public int delete(int userId) {
		return syuserMapper.delete(userId);
	}

	@Override
	public int update(Syuser syuser) {
		return syuserMapper.update(syuser);
	}

}
