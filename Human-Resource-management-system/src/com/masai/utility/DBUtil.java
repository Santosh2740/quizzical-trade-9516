package com.masai.utility;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;

//public class DBUtil {
//
//	public static void main(String[] args) {
//		
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//		} catch (ClassNotFoundException e) {
//			
//			e.printStackTrace();
//			System.out.println("Could not load the driver");
//		}
//		
//		String url = "jdbc:mysql://localhost:3306/hrms";
//		
//		try {
//			Connection conn = DriverManager.getConnection(url, "root", "root");
//			
//			if(conn!=null) {
//				System.out.println("connected");
//			}
//			else
//				System.out.println("not connected");
//		} catch (SQLException e) {
//			
//			e.printStackTrace();
//		}
//	}
//
//	public static Connection provideConnection() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//}

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
public static Connection provideConnection() {
		
		Connection conn =null;
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"
					+ "");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		String url ="jdbc:mysql://localhost:3306/hrms";
		
		 try {
			conn= DriverManager.getConnection(url,"root","root");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return conn;
	}
//}
}
//
//  
//}
