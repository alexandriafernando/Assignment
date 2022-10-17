package com.demo.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class info {
	 private String dbUrl= "jdbc:mysql://localhost:3306/userdb";
	 private String dbuname= "root";
	 private String dbpassword= "rootpassword";
	 private String dbDriver= "com.mysql.cj.jdbc.Driver";
		
	 public void loadDriver (String dbDriver) 
	 {
		 try {
			Class.forName(dbDriver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	 public Connection getConnection()
	 {
		 Connection con = null;
		 try {
			con= DriverManager.getConnection(dbUrl, dbuname, dbpassword);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return con;
	 }
	 
	 public String insert (GetterandSetter gns)  {
		 loadDriver(dbDriver);
		 Connection con= getConnection();
		 
		 String result= "Data entered successfully";
		 String sql = "insert into member values(uname, password, first_name, last_name, email,type)VALUES"+" (?,?,?,?,?,?)";
		 PreparedStatement ps;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, gns.getUname());
			 ps.setString(2, gns.getPassword());
			 ps.setString(3, gns.getFirst_name());		 
			 ps.setString(4, gns.getLast_name());
			 ps.setString(5, gns.getEmail());
			 ps.setString(6, gns.getType());
			 
			 System.out.println(ps);
			 ps.executeUpdate();
			 
		} catch (SQLException e) {
			e.printStackTrace();
			result= "Data failed to enter";
		}
		
		 
		 return result;
	 }

}
