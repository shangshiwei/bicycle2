package com.aowin.model;

import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class Syuser {
	private Integer userId;
	@NotNull(groups = {A.class})
	private Integer roleId;
	private String role_name;
	@Pattern(regexp = "/^\\w+$/")
	private String loginName;
	@NotEmpty(groups = {A.class})
	private String username;
	@Pattern(regexp = "/^\\w+$/")
	private String password;
	private Integer activeFlag;
	private String zxbj;
	private String officePhone;
	private String mobilePhone;
	private String email;
	private List<String> phases;
	
	public interface  A{}//分组
	public interface  B{}//分组
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
	public String getRole_name() {
		return role_name;
	}
	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getActiveFlag() {
		return activeFlag;
	}
	public void setActiveFlag(Integer activeFlag) {
		this.activeFlag = activeFlag;
	}
	public String getZxbj() {
		return zxbj;
	}
	public void setZxbj(String zxbj) {
		this.zxbj = zxbj;
	}
	public String getOfficePhone() {
		return officePhone;
	}
	public void setOfficePhone(String officePhone) {
		this.officePhone = officePhone;
	}
	public String getMobilePhone() {
		return mobilePhone;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<String> getPhases() {
		return phases;
	}
	public void setPhases(List<String> phases) {
		this.phases = phases;
	}
	
	
	
}
