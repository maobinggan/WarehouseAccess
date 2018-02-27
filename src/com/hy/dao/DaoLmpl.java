package com.hy.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.hy.bean.BumenBean;
import com.hy.bean.CailiaoBean;
import com.hy.bean.ChukujiluBean;
import com.hy.bean.KucunBean;
import com.hy.bean.RukujiluBean;
import com.hy.bean.YuangongBean;
import com.hy.util.SqlServerUtil;

public class DaoLmpl {
	public static void main(String[] args) {
		//System.out.println(checklogin("11", "11"));
		//load("一号仓库", "水果", "京东", "30", "50", "2018-01-23", "王小明");
		getTime();
	}
	//用户登入检查
	public static boolean checklogin(String username,String password) {
		SqlServerUtil su=new SqlServerUtil();
		String sql="exec checklogin '"+username+"','"+password+"'";
		ResultSet rs=su.query(sql);
		try {
			while(rs.next()) {
				System.out.println("登入成功,用户名:"+rs.getString(1)+"密码:"+rs.getString(2));
				return true;
			}
			su.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	//入库(写入库记录)
	public static void load(String cangku, String cailiao, String gonghuodanwei, String purchaseprice, String number, String examiner ) {
		String dot="','";
		String date=getTime();//取当前时间
		String sql="insert _rukujilu(cangku,cailiao,gonghuodanwei,purchaseprice,number,date,examiner) values('"+cangku+dot+cailiao+dot+gonghuodanwei+dot+purchaseprice+"',"+number+",'"+date+dot+examiner+"')";
		SqlServerUtil su=new SqlServerUtil();
		su.exec(sql);
	}
	//取入库记录
	public static List<RukujiluBean> getRukujilu() {
		List<RukujiluBean> result= new ArrayList<RukujiluBean>();
		String sql="select * from _rukujilu order by rukuID desc";
		SqlServerUtil su=new SqlServerUtil();
		ResultSet rs=su.query(sql);
		try {
			while(rs.next()) {
				result.add(new RukujiluBean(rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), String.valueOf(rs.getInt(6)), rs.getString(7), rs.getString(8)));
				//System.out.println(result.get(0).getDate());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
		
	}
	//取出库记录
	public static List<ChukujiluBean> getChukujilu() {
		List<ChukujiluBean> result= new ArrayList<ChukujiluBean>();
		String sql="select * from _chukujilu order by chukuID desc";
		SqlServerUtil su=new SqlServerUtil();
		ResultSet rs=su.query(sql);
		try {
			while(rs.next()) {
				result.add(new ChukujiluBean(rs.getString(2),rs.getString(3), String.valueOf(rs.getInt(4)), rs.getString(5)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
		
	}
	//取库存
	public static List<KucunBean> getKucun() {
		List<KucunBean> result= new ArrayList<KucunBean>();
		String sql="select * from _kucun order by cangku desc";
		SqlServerUtil su=new SqlServerUtil();
		ResultSet rs=su.query(sql);
		try {
			while(rs.next()) {
				result.add(new KucunBean(rs.getString(1), rs.getString(2), String.valueOf(rs.getInt(3)), rs.getString(4)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
		
	}
	//取材料表
	public static List<CailiaoBean> getCailiao() {
		List<CailiaoBean> result= new ArrayList<CailiaoBean>();
		String sql="select * from _cailiao order by cailiaoID desc";
		SqlServerUtil su=new SqlServerUtil();
		ResultSet rs=su.query(sql);
		try {
			while(rs.next()) {
				result.add(new CailiaoBean(String.valueOf(rs.getInt(1)), rs.getString(2), rs.getString(3), rs.getString(4)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
		
	}
	//查询是否有货可以出库
	public static boolean checkOut(String cangku,String cailiao) {
		String date=getTime();
		String sql="select number from _kucun where cangku='"+cangku+"'and cailiao='"+cailiao+"'";
		SqlServerUtil su=new SqlServerUtil();
		ResultSet rs=su.query(sql);
		try {
			while(rs.next()) {
				if(rs.getInt(1)==0) {
					return false;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		su.close();
		return true;
	}
	//出库(写出库记录)
	public static void out(String cangku,String cailiao,String number) {
		String date=getTime();
		String sql="insert _chukujilu(cangku,cailiao,number,date) values('"+cangku+"','"+cailiao+"',"+number+",'"+date+"')";
		SqlServerUtil su=new SqlServerUtil();
		su.exec(sql);
		su.close();
	}
	//取部门表
	public static List<BumenBean> getBumenbiao() {
		List<BumenBean> result=new ArrayList<>();
		String sql="select * from _bumen";
		SqlServerUtil su=new SqlServerUtil();
		ResultSet rs=su.query(sql);
		try {
			while(rs.next()) {
				result.add(new BumenBean(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		su.close();
		return result;
	}
	//取员工表
	public static List<YuangongBean> getYuangongbiao() {
		List<YuangongBean> result=new ArrayList<>();
		String sql="select * from _yuangong";
		SqlServerUtil su=new SqlServerUtil();
		ResultSet rs=su.query(sql);
		try {
			while(rs.next()) {
				result.add(new YuangongBean(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		su.close();
		return result;
	}
	//员工表：删除员工
	public static void deleteYuangong(String yuangongID) {
		
		String sql="delete from _yuangong where yuangongID='"+yuangongID+"'";
		SqlServerUtil su=new SqlServerUtil();
		su.exec(sql);
		su.close();
	}
	//获取当前格式化时间
	public static String getTime() {
		String time=null;
		Date now = new Date(); 
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		time=sdf.format(now);
		return time;
	}
	//插入员工表
	public static boolean insYuangongbiao(String yuangongID,String yuangongname,String bumenname,String phone) {
		String sql="declare @result varchar(50) exec _yuangong_insert ?,?,?,?,@result";
		String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		String PATH = "jdbc:sqlserver://127.0.0.1:1433;databaseName=warehouseAccess";
		ResultSet rs=null;
		Connection conn=null;
		PreparedStatement pre=null;
		try {
			Class.forName(DRIVER);
			conn=DriverManager.getConnection(PATH,"sa","123456");
			pre=conn.prepareStatement(sql);
			pre.setString(1, yuangongID);
			pre.setString(2, yuangongname);
			pre.setString(3, bumenname);
			pre.setString(4, phone);
			pre.execute();//调用存储过程，插入数据
			sql="select AddYuangong_result from _temp";
			pre=conn.prepareStatement(sql);
			rs=pre.executeQuery();//查询临时结果表，查看插入数据是否成功
			rs.next();
			String result=rs.getString(1);
			if(result.equals("添加成功")) {
				return true;
			}else {
				System.out.println("添加员工失败："+result);
			}
			conn.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}
