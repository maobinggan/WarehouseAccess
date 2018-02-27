package com.hy.controller;

import java.util.Map;

import com.hy.dao.DaoLmpl;
import com.opensymphony.xwork2.ActionContext;

public class AddingYuangong {
	public AddingYuangong() {
		
	}
	public String  addingYuangong() {
		ActionContext ac=ActionContext.getContext();
		Map<String, Object> paramMap=(Map<String, Object>) ac.getParameters();
		//
		String[] yuangongID=(String[]) paramMap.get("yuangongID");
		String[] yuangongname=(String[]) paramMap.get("yuangongname");
		String[] bumenname=(String[]) paramMap.get("bumenname");
		String[] phone=(String[])paramMap.get("phone");
		//
		boolean result=DaoLmpl.insYuangongbiao(yuangongID[0], yuangongname[0], bumenname[0], phone[0]);
		if(result==true) {
			return "success";
		}
		return "failure";
	}
}
