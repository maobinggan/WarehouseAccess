package com.hy.bean;

public class YuangongBean {
	private String yuangongID;
	private String yuangongname;
	private String bumenname;
	private String phone;
	public String getYuangongID() {
		return yuangongID;
	}
	public void setYuangongID(String yuangongID) {
		this.yuangongID = yuangongID;
	}
	public String getYuangongname() {
		return yuangongname;
	}
	public void setYuangongname(String yuangongname) {
		this.yuangongname = yuangongname;
	}
	public String getBumenname() {
		return bumenname;
	}
	public void setBumenname(String bumenname) {
		this.bumenname = bumenname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public YuangongBean(String yuangongID, String yuangongname, String bumenname, String phone) {
		super();
		this.yuangongID = yuangongID;
		this.yuangongname = yuangongname;
		this.bumenname = bumenname;
		this.phone = phone;
	}
}
