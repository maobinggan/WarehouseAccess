package com.hy.bean;

public class KucunBean {
	private String cangku;
	private String cailiao;
	private String number;
	private String date;
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
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public KucunBean(String cangku, String cailiao, String number, String date) {
		super();
		this.cangku = cangku;
		this.cailiao = cailiao;
		this.number = number;
		this.date = date;
	}
}
