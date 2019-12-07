package com.aowin.dao;

import java.util.List;

import com.aowin.model.SyPermission;

public interface SyPermissionMapper {
	/**
	 * 查询角色的权限描述
	 * @return
	 */
	public List<String> selectByroleId(Integer role_id);
	/**
	 * 
	 * @param role_id
	 * @return
	 */
	public List<Integer> selectByroleId2(Integer role_id);
	/**
	 * 查询角色的权限url
	 * @param role_id
	 * @return
	 */
	public List<String> selectURL(Integer role_id);

	/**
	 * 
	 * @param syPermission
	 * @return
	 */
	public int insert(SyPermission syPermission);
	/**
	 * 删除角色权限
	 * @param role_id
	 * @return
	 */
	public int delete(int role_id);
}
