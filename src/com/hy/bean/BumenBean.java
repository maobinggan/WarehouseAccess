package com.hy.bean;

public class BumenBean {
	private String bumenID;
	private String bumenname;
	private String bumenjingli;
	private String phone;
	public String getBumenID() {
		return bumenID;
	}
	public void setBumenID(String bumenID) {
		this.bumenID = bumenID;
	}
	public String getBumenname() {
		return bumenname;
	}
	public void setBumenname(String bumenname) {
		this.bumenname = bumenname;
	}
	public String getBumenjingli() {
		return bumenjingli;
	}
	public void setBumenjingli(String bumenjingli) {
		this.bumenjingli = bumenjingli;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public BumenBean(String bumenID, String bumenname, String bumenjingli, String phone) {
		super();
		this.bumenID = bumenID;
		this.bumenname = bumenname;
		this.bumenjingli = bumenjingli;
		this.phone = phone;
	}
}
