package com.aowin.model;

import javax.validation.constraints.NotNull;

public class Bicycle_deal {
	@NotNull
	private Integer deal_id;//业务ID
	@NotNull
	private String create_time;//发生时间
	private String deal_name;
	@NotNull
	private Integer deal_type;//业务类型
	@NotNull
	private Integer record_id;//关联的业务记录id
	private Integer card_id;//业务卡id
	private Integer is_fee;//是否发生费用
	private Double chg_money;//费用金额
	private Integer fee_type;//费用收支类型
	private Integer bicycle_id;
	private Integer pile_id;
	private Integer user_id;
	
	public Integer getDeal_id() {
		return deal_id;
	}
	public void setDeal_id(Integer deal_id) {
		this.deal_id = deal_id;
	}
	public String getCreate_time() {
		return create_time;
	}
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
	public String getDeal_name() {
		return deal_name;
	}
	public void setDeal_name(String deal_name) {
		this.deal_name = deal_name;
	}
	public Integer getDeal_type() {
		return deal_type;
	}
	public void setDeal_type(Integer deal_type) {
		this.deal_type = deal_type;
	}
	public Integer getRecord_id() {
		return record_id;
	}
	public void setRecord_id(Integer record_id) {
		this.record_id = record_id;
	}
	public Integer getCard_id() {
		return card_id;
	}
	public void setCard_id(Integer card_id) {
		this.card_id = card_id;
	}
	public Integer getIs_fee() {
		return is_fee;
	}
	public void setIs_fee(Integer is_fee) {
		this.is_fee = is_fee;
	}
	
	public Double getChg_money() {
		return chg_money;
	}
	public void setChg_money(Double chg_money) {
		this.chg_money = chg_money;
	}
	public Integer getFee_type() {
		return fee_type;
	}
	public void setFee_type(Integer fee_type) {
		this.fee_type = fee_type;
	}
	public Integer getBicycle_id() {
		return bicycle_id;
	}
	public void setBicycle_id(Integer bicycle_id) {
		this.bicycle_id = bicycle_id;
	}
	public Integer getPile_id() {
		return pile_id;
	}
	public void setPile_id(Integer pile_id) {
		this.pile_id = pile_id;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	
	
}
