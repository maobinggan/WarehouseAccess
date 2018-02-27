package com.hy.controller;

import java.util.List;
import java.util.Map;

import com.hy.bean.CailiaoBean;
import com.hy.bean.KucunBean;
import com.hy.bean.RukujiluBean;
import com.hy.dao.DaoLmpl;
import com.opensymphony.xwork2.ActionContext;

public class LoadWarehouseAction {
	public LoadWarehouseAction() {
		// TODO Auto-generated constructor stub
	}
	public String loading() {
		System.out.println("这里是LoadWarehouseAction.java");
		ActionContext ac=ActionContext.getContext();
		//
		Map<String, Object> paramMap=ac.getParameters();
		Map<String,Object> requestMap=(Map<String, Object>) ac.get("request");
		Map<String, Object> sessionMap=ac.getSession();
		//
		String[] cangku=(String[]) paramMap.get("cangku");
		String[] cailiao=(String[]) paramMap.get("cailiao");
		String[] gonghuodanwei=(String[]) paramMap.get("gonghuodanwei");
		String[] purchaseprice=(String[]) paramMap.get("purchaseprice");
		String[] number=(String[]) paramMap.get("number");
		String[] examiner=(String[]) paramMap.get("examiner");
		//入库
		System.out.println("开始入库");
		DaoLmpl.load(cangku[0],cailiao[0],gonghuodanwei[0],purchaseprice[0],number[0],examiner[0]);
		//取入库记录(入库后)
		System.out.println("开始取入库记录");
		List<RukujiluBean> rukujilu= DaoLmpl.getRukujilu();
		sessionMap.put("rukujilu", rukujilu);	
		//取库存表(入库后)
		System.out.println("开始取入库记录(入库后)");
		List<KucunBean> kucun=DaoLmpl.getKucun();
		sessionMap.put("kucun", kucun);	
		//取材料详情表(入库后)
		System.out.println("开始取材料表(入库后)");
		List<CailiaoBean> cailiaobiao=DaoLmpl.getCailiao();
		sessionMap.put("cailiaobiao", cailiaobiao);
		
		
		return "success";
	}
}
