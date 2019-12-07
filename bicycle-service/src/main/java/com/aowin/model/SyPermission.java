package com.aowin.model;

public class SyPermission {
	private Integer permissionID;
	private Integer roleId;
	private Integer phaseId;
	
	public SyPermission() {
		super();
	}

	public SyPermission(Integer permissionID, Integer roleId, Integer phaseId) {
		super();
		this.permissionID = permissionID;
		this.roleId = roleId;
		this.phaseId = phaseId;
	}

	public Integer getPermissionID() {
		return permissionID;
	}

	public void setPermissionID(Integer permissionID) {
		this.permissionID = permissionID;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public Integer getPhaseId() {
		return phaseId;
	}

	public void setPhaseId(Integer phaseId) {
		this.phaseId = phaseId;
	}
	
}
