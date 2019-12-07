package com.aowin.dao;

import com.aowin.model.Bicycle_deal;

public interface Bicycle_dealMapper {
	/**
	 * 新增（新车购入）
	 * @param bicycle_deal
	 * @return
	 */
	public int insert(Bicycle_deal bicycle_deal);
	/**
	 * 新增(新车入桩)
	 * @param bicycle_deal
	 * @return
	 */
	public int insert2(Bicycle_deal bicycle_deal);
}
