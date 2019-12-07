package com.aowin.service;


import java.util.List;

import com.aowin.model.Syrole;
import com.github.pagehelper.PageInfo;

public interface SyroleService {
	/**
	 * 分页查询
	 * @param pageNum
	 * @param syrole
	 * @return
	 */
	public PageInfo<Syrole> select(int pageNum,Syrole syrole);
	/**
	 * 查询不分页
	 * @return
	 */
	public List<Syrole> select2(Syrole syrole);
	/**
	 * 新增角色
	 * @param syrole
	 * @return
	 */
	public int insert(Integer[] phaseIds,Syrole syrole) ;
	/**
	 * 修改角色
	 * @param syrole
	 * @return
	 */
	public int update(Integer[] phaseIds,Syrole syrole) ;
	/**
	 * 删除角色
	 * @param phaseId
	 * @return
	 */
	public int delete(int role_id) ;
	/**
	 * 根据id查询角色
	 * @param phaseId
	 * @return
	 */
	public Syrole selectById(int role_id) ;

}
