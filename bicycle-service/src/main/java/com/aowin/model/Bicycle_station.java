package com.aowin.model;

public class Bicycle_station {
	private Integer station_id;
	private String station_code;//车点编号
	private String station_name;//车点名称
	private Double longitude;//车点经度
	private Double latitude;//车点纬度
	private Double bicycle_pile_num;//车点车桩数量
	private Integer bicycle_num;//车辆数量
	private String address;//
	private String person_in_charge;//负责人
	private String build_time;//新建日期
	private String run_time;//
	private Integer user_id;//操作人
	private String create_time;//创建时间
	private String remark;//
	public Integer getStation_id() {
		return station_id;
	}
	public void setStation_id(Integer station_id) {
		this.station_id = station_id;
	}
	public String getStation_code() {
		return station_code;
	}
	public void setStation_code(String station_code) {
		this.station_code = station_code;
	}
	public String getStation_name() {
		return station_name;
	}
	public void setStation_name(String station_name) {
		this.station_name = station_name;
	}
	public Double getLongitude() {
		return longitude;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	public Double getLatitude() {
		return latitude;
	}
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	public Double getBicycle_pile_num() {
		return bicycle_pile_num;
	}
	public void setBicycle_pile_num(Double bicycle_pile_num) {
		this.bicycle_pile_num = bicycle_pile_num;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPerson_in_charge() {
		return person_in_charge;
	}
	public void setPerson_in_charge(String person_in_charge) {
		this.person_in_charge = person_in_charge;
	}
	public String getBuild_time() {
		return build_time;
	}
	public void setBuild_time(String build_time) {
		this.build_time = build_time;
	}
	public String getRun_time() {
		return run_time;
	}
	public void setRun_time(String run_time) {
		this.run_time = run_time;
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
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Integer getBicycle_num() {
		return bicycle_num;
	}
	public void setBicycle_num(Integer bicycle_num) {
		this.bicycle_num = bicycle_num;
	}
	
	
	
	
}
