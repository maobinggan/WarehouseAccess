package com.hy.bean;

public class RukujiluBean {
	private String cangku;
	private String cailiao;
	private String gonghuodanwei;
	private String purchaseprise;
	private String number;
	private String date;
	private String examiner;
	public RukujiluBean(String cangku, String cailiao, String gonghuodanwei, String purchaseprise, String number,
			String date, String examiner) {
		super();
		this.cangku = cangku;
		this.cailiao = cailiao;
		this.gonghuodanwei = gonghuodanwei;
		this.purchaseprise = purchaseprise;
		this.number = number;
		this.date = date;
		this.examiner = examiner;
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
	public String getGonghuodanwei() {
		return gonghuodanwei;
	}
	public void setGonghuodanwei(String gonghuodanwei) {
		this.gonghuodanwei = gonghuodanwei;
	}
	public String getPurchaseprise() {
		return purchaseprise;
	}
	public void setPurchaseprise(String purchaseprise) {
		this.purchaseprise = purchaseprise;
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
	public String getExaminer() {
		return examiner;
	}
	public void setExaminer(String examiner) {
		this.examiner = examiner;
	}
	
	
}
