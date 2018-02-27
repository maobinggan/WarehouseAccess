package com.hy.controller;

import java.sql.ResultSet;
import java.util.Map;

import com.hy.dao.DaoLmpl;
import com.hy.util.SqlServerUtil;
import com.opensymphony.xwork2.ActionContext;

public class LoginAction {
	public  String login() {
		ActionContext ac=ActionContext.getContext();
		Map<String, Object>paramMap=ac.getParameters();
		//
		String[] username=(String[]) paramMap.get("username");
		String[] password=(String[]) paramMap.get("password");
		//
		if(DaoLmpl.checklogin(username[0], password[0])) {
			return "success";
		}
		return "failure";
	}
	public LoginAction() {
		super();
	}
}
