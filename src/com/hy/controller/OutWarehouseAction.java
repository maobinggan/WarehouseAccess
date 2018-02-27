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
		System.out.println("������OutWarehouseAction.java");
		ActionContext ac=ActionContext.getContext();
		//
		Map<String, Object> paramMap=ac.getParameters();
		Map<String,Object> requestMap=(Map<String, Object>) ac.get("request");
		Map<String, Object> sessionMap=ac.getSession();
		//
		String[] cangku=(String[]) paramMap.get("cangku");
		String[] cailiao=(String[]) paramMap.get("cailiao");
		String[] number=(String[]) paramMap.get("number");
		//����(д�����¼)
		System.out.println("��ʼ����");
		System.out.println("��ѯ�Ƿ��л��ɳ�");
		if(DaoLmpl.checkOut(cangku[0], cailiao[0])) {
			DaoLmpl.out(cangku[0], cailiao[0], number[0]);
		}else {
			System.out.println("�޻��ɳ��⣬false");
			return "failure";
		}
		//ȡ�����¼(�����)
		System.out.println("��ʼȡ�����¼");
		List<ChukujiluBean> chukujilu= DaoLmpl.getChukujilu();
		sessionMap.put("chukujilu", chukujilu);	
		//ȡ����(����)
		System.out.println("��ʼȡ����(�����)");
		List<KucunBean> kucun=DaoLmpl.getKucun();
		sessionMap.put("kucun", kucun);	
		//ȡ���������(�����)
		System.out.println("��ʼȡ���ϱ�(�����)");
		List<CailiaoBean> cailiaobiao=DaoLmpl.getCailiao();
		sessionMap.put("cailiaobiao", cailiaobiao);
		
		
		return "success";
	}
}
