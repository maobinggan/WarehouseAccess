package com.hy.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SqlServerUtil {
	private static final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static final String PATH = "jdbc:sqlserver://127.0.0.1:1433;databaseName=warehouseAccess";
	private ResultSet rs=null;
	private Connection conn=null;
	private PreparedStatement pre=null;
	public static void main(String[] args) {
		SqlServerUtil ssu=new SqlServerUtil();
		ssu.query("select * from _user");
		//ssu.exec("insert _user(username,password) values('12223','45622')");
		ssu.close();
	}
	//数据库:查
	public ResultSet query(String sql) {
		try {
			Class.forName(DRIVER);
			conn=DriverManager.getConnection(PATH,"sa","123456");
			pre=conn.prepareStatement(sql);
			rs=pre.executeQuery();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}
	//数据库:增删改
	public void exec(String sql) {
		
		try {
			Class.forName(DRIVER);
			conn=DriverManager.getConnection(PATH,"sa","123456");
			pre=conn.prepareStatement(sql);
			pre.execute();
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	//数据库关闭连接
	public void close() {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
