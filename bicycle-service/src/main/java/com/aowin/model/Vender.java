package com.aowin.model;

import javax.validation.constraints.NotNull;

public class Vender {
	@NotNull
	private Integer vender_id;
	@NotNull
	private String vender_code;//供应商编号
	private String vender_type;//供应商类型
	@NotNull
	private String vender_name;//名称
	private String address;
	private String telphone;
	private String contacts;
	private String product_license;
	private String bussiness_registration_no;
	private double registered_capital;
	private Integer user_id;
	private String create_time;
	private String zxbj;
	private String remark;
	public Integer getVender_id() {
		return vender_id;
	}
	public void setVender_id(Integer vender_id) {
		this.vender_id = vender_id;
	}
	public String getVender_code() {
		return vender_code;
	}
	public void setVender_code(String vender_code) {
		this.vender_code = vender_code;
	}
	public String getVender_type() {
		return vender_type;
	}
	public void setVender_type(String vender_type) {
		this.vender_type = vender_type;
	}
	public String getVender_name() {
		return vender_name;
	}
	public void setVender_name(String vender_name) {
		this.vender_name = vender_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTelphone() {
		return telphone;
	}
	public void setTelphone(String telphone) {
		this.telphone = telphone;
	}
	public String getContacts() {
		return contacts;
	}
	public void setContacts(String contacts) {
		this.contacts = contacts;
	}
	public String getProduct_license() {
		return product_license;
	}
	public void setProduct_license(String product_license) {
		this.product_license = product_license;
	}
	public String getBussiness_registration_no() {
		return bussiness_registration_no;
	}
	public void setBussiness_registration_no(String bussiness_registration_no) {
		this.bussiness_registration_no = bussiness_registration_no;
	}
	public double getRegistered_capital() {
		return registered_capital;
	}
	public void setRegistered_capital(double registered_capital) {
		this.registered_capital = registered_capital;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getCreate_time() {
		return create_time;
	}
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
	public String getZxbj() {
		return zxbj;
	}
	public void setZxbj(String zxbj) {
		this.zxbj = zxbj;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
}
