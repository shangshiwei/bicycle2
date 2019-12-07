package com.aowin.model;

import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

public class Syrole {
	private Integer role_id;
	@NotEmpty
	//描述 中文汉字 最多50个字符
	@Pattern(regexp = "[\u4e00-\u9fa5]{2,50}")
	private String role_name;
	@NotEmpty
	//描述 中文汉字 最多50个字符
	@Pattern(regexp = "[\u4e00-\u9fa5]{2,50}")
	private String role_describe;
	private List<Integer> phaseIds;
	private List<String> phases;
	
	public Syrole() {
		super();
	}
	

	public Syrole(Integer role_id, String role_name, String role_describe, List<String> phases) {
		super();
		this.role_id = role_id;
		this.role_name = role_name;
		this.role_describe = role_describe;
		this.phases = phases;
	}

	public Integer getRole_id() {
		return role_id;
	}

	public void setRole_id(Integer role_id) {
		this.role_id = role_id;
	}

	public String getRole_name() {
		return role_name;
	}

	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}

	public String getRole_describe() {
		return role_describe;
	}

	public void setRole_describe(String role_describe) {
		this.role_describe = role_describe;
	}


	public List<String> getPhases() {
		return phases;
	}


	public void setPhases(List<String> phases) {
		this.phases = phases;
	}


	public List<Integer> getPhaseIds() {
		return phaseIds;
	}


	public void setPhaseIds(List<Integer> phaseIds) {
		this.phaseIds = phaseIds;
	}
	
}
