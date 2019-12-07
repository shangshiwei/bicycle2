package com.aowin.model;

import javax.validation.constraints.NotNull;

public class Bicycle_catagory {
	@NotNull
	private Integer catagory_id;
	@NotNull
	private String catagory_name;//类型名称
	private String frame_type;
	private String tire_type;
	private double weight;
	private double height;
	private double length;
	private String ring_type;
	private String basket;
	private String backseat;
	private String bicycle_seat;
	private String handbrake;
	private String remark;
	@NotNull
	private Integer user_id;//操作人
	@NotNull
	private String operator_time;//操作日期
	
	public Integer getCatagory_id() {
		return catagory_id;
	}
	public void setCatagory_id(Integer catagory_id) {
		this.catagory_id = catagory_id;
	}
	public String getCatagory_name() {
		return catagory_name;
	}
	public void setCatagory_name(String catagory_name) {
		this.catagory_name = catagory_name;
	}
	public String getFrame_type() {
		return frame_type;
	}
	public void setFrame_type(String frame_type) {
		this.frame_type = frame_type;
	}
	public String getTire_type() {
		return tire_type;
	}
	public void setTire_type(String tire_type) {
		this.tire_type = tire_type;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public String getRing_type() {
		return ring_type;
	}
	public void setRing_type(String ring_type) {
		this.ring_type = ring_type;
	}
	public String getBasket() {
		return basket;
	}
	public void setBasket(String basket) {
		this.basket = basket;
	}
	public String getBackseat() {
		return backseat;
	}
	public void setBackseat(String backseat) {
		this.backseat = backseat;
	}
	public String getBicycle_seat() {
		return bicycle_seat;
	}
	public void setBicycle_seat(String bicycle_seat) {
		this.bicycle_seat = bicycle_seat;
	}
	public String getHandbrake() {
		return handbrake;
	}
	public void setHandbrake(String handbrake) {
		this.handbrake = handbrake;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
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
	
}
