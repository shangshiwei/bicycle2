package com.aowin.model;

import javax.validation.constraints.NotNull;

public class Bicycle_detail {
	@NotNull
	private Integer detail_id;
	private Integer catagory_id;//类型编号
	private Integer order_id;//单据id
	@NotNull
	private Integer bicycle_id;//车辆id
	@NotNull
	private String create_date;//出厂日期
	@NotNull
	private String batch_no;//批次号
	@NotNull
	private double price;//价格
	private String remark;//备注
	private String bicycle_code;
	private String catagory_name;
	
	
	public String getCatagory_name() {
		return catagory_name;
	}
	public void setCatagory_name(String catagory_name) {
		this.catagory_name = catagory_name;
	}
	public String getBicycle_code() {
		return bicycle_code;
	}
	public void setBicycle_code(String bicycle_code) {
		this.bicycle_code = bicycle_code;
	}
	public Integer getDetail_id() {
		return detail_id;
	}
	public void setDetail_id(Integer detail_id) {
		this.detail_id = detail_id;
	}
	public Integer getCatagory_id() {
		return catagory_id;
	}
	public void setCatagory_id(Integer catagory_id) {
		this.catagory_id = catagory_id;
	}
	public Integer getOrder_id() {
		return order_id;
	}
	public void setOrder_id(Integer order_id) {
		this.order_id = order_id;
	}
	public Integer getBicycle_id() {
		return bicycle_id;
	}
	public void setBicycle_id(Integer bicycle_id) {
		this.bicycle_id = bicycle_id;
	}
	public String getCreate_date() {
		return create_date;
	}
	public void setCreate_date(String create_date) {
		this.create_date = create_date;
	}
	public String getBatch_no() {
		return batch_no;
	}
	public void setBatch_no(String batch_no) {
		this.batch_no = batch_no;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
}
