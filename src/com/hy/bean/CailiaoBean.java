package com.hy.bean;

public class CailiaoBean {
	private String cailiaoID;
	private String cangku;
	private String cailiao;
	private String date;
	public String getCailiaoID() {
		return cailiaoID;
	}
	public void setCailiaoID(String cailiaoID) {
		this.cailiaoID = cailiaoID;
	}
	public String getCangku() {
		return cangku;
	}
	public void setCangku(String cangku) {
		this.cangku = cangku;
	}
	public String getCailiao() {
		return cailiao;
	}
	public void setCailiao(String cailiao) {
		this.cailiao = cailiao;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public CailiaoBean(String cailiaoID, String cangku, String cailiao, String date) {
		super();
		this.cailiaoID = cailiaoID;
		this.cangku = cangku;
		this.cailiao = cailiao;
		this.date = date;
	}
}
