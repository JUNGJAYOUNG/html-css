package com.sist.dao;

import java.sql.*;
import java.util.ArrayList;

import com.sist.vo.GoodsVO;

public class GoodsDAO {
	String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@192.168.219.104:1521:XE";
	String user="c##madang";
	String pwd="madang";
	
	public ArrayList<GoodsVO> listGoods(){
		ArrayList<GoodsVO> list = new ArrayList<GoodsVO>();
		
		String sql = "select * from goods order by no";
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,user,pwd);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				list.add(new GoodsVO(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getString(5)));
			}
	
		}catch(Exception e) {
			System.out.println("예외발생:"+e.getMessage());
		}finally {
			try {
				if(conn!=null)
					conn.close();
				if(stmt!=null)
					stmt.close();
				if(rs!=null)
					rs.close();
			}catch(Exception ex) {
				
			}
		}
		return list;
	}
}
