package com.aliware.edas.hsfboot.domain;

public class VersionInfo {
	private int id;
	private String versionName;
	private String lastUpdate;

	public VersionInfo() {
		super();
	}

	public VersionInfo(int id, String versionName, String lastUpdate) {
		this.id = id;
		this.versionName = versionName;
		this.lastUpdate = lastUpdate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getVersionName() {
		return versionName;
	}

	public void setVersionName(String versionName) {
		this.versionName = versionName;
	}

	public String getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(String lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	@Override
	public String toString() {
		return "VersionInfo [id=" + id + ", versionName=" + versionName + ", lastUpdate=" + lastUpdate + "]";
	}
	
	

}
