package com.sist.dao;

import java.sql.*;
import java.util.ArrayList;

public class DeptDao {
	public ArrayList<String> listDname(){
		ArrayList<String> list = new ArrayList<String>();
		String sql = "select dname from dept";
		
		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@192.168.219.104:1521:XE";
		String user="c##madang";
		String pwd="madang";
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,user,pwd);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				list.add(rs.getString(1));
			}
		}catch(Exception e) {
			System.out.println("���ܹ߻�:"+e.getMessage());
		}finally {
			try {
				if(rs!=null)
					rs.close();
				if(stmt!=null)
					stmt.close();
				if(conn!=null)
					conn.close();
			}catch(Exception ex) {
				
			}
		}
		return list;
	}
}
