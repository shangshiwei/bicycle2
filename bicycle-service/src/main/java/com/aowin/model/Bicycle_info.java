package com.aowin.model;

import javax.validation.constraints.NotNull;

public class Bicycle_info {
	@NotNull
	private Integer bicycle_id;//车辆id
	@NotNull
	private String bicycle_code;//车辆编号
	@NotNull
	private Integer status;//车辆状态
	private Integer pile_id;//所在车桩
	private String destory_date;//车辆销毁日期
	private Integer user_id;//操作人id
	private String operator_time;//操作时间
	private Integer card_id;//租车卡id
	private String remark;//备注
	public Integer getBicycle_id() {
		return bicycle_id;
	}
	public void setBicycle_id(Integer bicycle_id) {
		this.bicycle_id = bicycle_id;
	}
	public String getBicycle_code() {
		return bicycle_code;
	}
	public void setBicycle_code(String bicycle_code) {
		this.bicycle_code = bicycle_code;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getPile_id() {
		return pile_id;
	}
	public void setPile_id(Integer pile_id) {
		this.pile_id = pile_id;
	}
	public String getDestory_date() {
		return destory_date;
	}
	public void setDestory_date(String destory_date) {
		this.destory_date = destory_date;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getOperator_time() {
		return operator_time;
	}
	public void setOperator_time(String operator_time) {
		this.operator_time = operator_time;
	}
	public Integer getCard_id() {
		return card_id;
	}
	public void setCard_id(Integer card_id) {
		this.card_id = card_id;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
}
