package com.aowin.model;

import javax.validation.constraints.NotNull;

public class Bicycle_order {
	
	private Integer order_id;
	private String order_code;//单据编号
	private Integer vender_id;//供应商id
	private String vender_name;//供应商名字
	@NotNull
	private String buy_date;//购入日期
	@NotNull
	private Double buy_num;//购入数量
	@NotNull
	private Double buy_price;//购入总金额
	private String person_in_charge;//购入负责人
	private String invoice_no;
	private Integer user_id;//创建人id
	private String operator_time;//创建日期
	private String remark;
	private Bicycle_detail[] details;
	
	
	public Bicycle_detail[] getDetails() {
		return details;
	}
	public void setDetails(Bicycle_detail[] details) {
		this.details = details;
	}
	public Integer getOrder_id() {
		return order_id;
	}
	public void setOrder_id(Integer order_id) {
		this.order_id = order_id;
	}
	public String getOrder_code() {
		return order_code;
	}
	public void setOrder_code(String order_code) {
		this.order_code = order_code;
	}
	public Integer getVender_id() {
		return vender_id;
	}
	public void setVender_id(Integer vender_id) {
		this.vender_id = vender_id;
	}
	public String getVender_name() {
		return vender_name;
	}
	public void setVender_name(String vender_name) {
		this.vender_name = vender_name;
	}
	public String getBuy_date() {
		return buy_date;
	}
	public void setBuy_date(String buy_date) {
		this.buy_date = buy_date;
	}
	public Double getBuy_num() {
		return buy_num;
	}
	public void setBuy_num(Double buy_num) {
		this.buy_num = buy_num;
	}
	public Double getBuy_price() {
		return buy_price;
	}
	public void setBuy_price(Double buy_price) {
		this.buy_price = buy_price;
	}
	public String getPerson_in_charge() {
		return person_in_charge;
	}
	public void setPerson_in_charge(String person_in_charge) {
		this.person_in_charge = person_in_charge;
	}
	public String getInvoice_no() {
		return invoice_no;
	}
	public void setInvoice_no(String invoice_no) {
		this.invoice_no = invoice_no;
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
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
}
