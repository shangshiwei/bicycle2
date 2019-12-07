package com.aowin.service;

import java.util.List;

import com.aowin.model.Bicycle_info;
import com.aowin.model.Bicycle_pile;
import com.aowin.model.Bicycle_station;
import com.aowin.model.Syuser;
import com.github.pagehelper.PageInfo;

public interface InstationSerivce {
	/**
	 * 分页查询 Bicycle_info
	 * @param pageNum
	 * @return
	 */
	public PageInfo<Bicycle_info> selectPage(int pageNum);
	/**
	 * 分页查询车点信息
	 * @param pageNum
	 * @return
	 */
	public PageInfo<Bicycle_station> select(int pageNum);
	/**
	 * 查询状态为2（无车）的车桩
	 * @param bicycle_station
	 * @return
	 */
	public List<Bicycle_pile> select(Bicycle_station bicycle_station);
	/**
	 * 新车入桩操作
	 * @param bicycle_info
	 * @param user
	 * @return
	 */
	public void bicycleToPile(Bicycle_info[] bicycle_infos,Syuser user);
}
