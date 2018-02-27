package com.hy.controller;

import java.util.List;
import java.util.Map;

import com.hy.bean.CailiaoBean;
import com.hy.bean.ChukujiluBean;
import com.hy.bean.KucunBean;
import com.hy.bean.RukujiluBean;
import com.hy.dao.DaoLmpl;
import com.opensymphony.xwork2.ActionContext;

public class OutWarehouseAction {
	public OutWarehouseAction() {
		// TODO Auto-generated constructor stub
	}
	public String outing() {
		System.out.println("这里是OutWarehouseAction.java");
		ActionContext ac=ActionContext.getContext();
		//
		Map<String, Object> paramMap=ac.getParameters();
		Map<String,Object> requestMap=(Map<String, Object>) ac.get("request");
		Map<String, Object> sessionMap=ac.getSession();
		//
		String[] cangku=(String[]) paramMap.get("cangku");
		String[] cailiao=(String[]) paramMap.get("cailiao");
		String[] number=(String[]) paramMap.get("number");
		//出库(写出库记录)
		System.out.println("开始出库");
		System.out.println("查询是否有货可出");
		if(DaoLmpl.checkOut(cangku[0], cailiao[0])) {
			DaoLmpl.out(cangku[0], cailiao[0], number[0]);
		}else {
			System.out.println("无货可出库，false");
			return "failure";
		}
		//取出库记录(出库后)
		System.out.println("开始取出库记录");
		List<ChukujiluBean> chukujilu= DaoLmpl.getChukujilu();
		sessionMap.put("chukujilu", chukujilu);	
		//取库存表(入库后)
		System.out.println("开始取库存表(出库后)");
		List<KucunBean> kucun=DaoLmpl.getKucun();
		sessionMap.put("kucun", kucun);	
		//取材料详情表(出库后)
		System.out.println("开始取材料表(出库后)");
		List<CailiaoBean> cailiaobiao=DaoLmpl.getCailiao();
		sessionMap.put("cailiaobiao", cailiaobiao);
		
		
		return "success";
	}
}
