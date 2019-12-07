package com.aowin.dao;

import java.util.List;
import com.aowin.model.Syrole;

public interface SyroleMapper {
	/**
	 * 新增角色
	 * @param syrole
	 * @return
	 */
	public int insert(Syrole syrole);
	
	/**
	 * 修改角色
	 * @param msPhase
	 * @return
	 */
	public int update(Syrole syrole);
	/**
	 * 查询权限
	 * @param syrole
	 * @return
	 */
	public List<Syrole> select(Syrole syrole);
	
	/**
	 * 根据id查询角色
	 * @param role_id
	 * @return
	 */
	public Syrole selectById(int role_id);
	/**
	 * 删除权限
	 * @param role_id
	 * @return
	 */
	public int delete(int role_id);

}
