package com.aowin.dao;

import java.util.List;

import com.aowin.model.Syuser;

public interface SyuserMapper {
	/**
	 * 登录
	 * @param syuser
	 * @return
	 */
	public Syuser login(Syuser syuser);
	/**
	 * 增加
	 * @param syuser
	 * @return
	 */
	public int insert(Syuser syuser);
	/**
	 * 分页查询
	 * @param syuser
	 * @return
	 */
	public List<Syuser> select(Syuser syuser);
	/**
	 * 删除
	 * @param userId
	 * @return
	 */
	public int delete(int userId);
	/**
	 * 改
	 * @param userId
	 * @return
	 */
	public int update(Syuser syuser);
}
