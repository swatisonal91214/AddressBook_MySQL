package com.bl.addressbook.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Connection_class {
	/* MySql Connection configuration */
	public static final String JDBC_STR = "jdbc:mysql://localhost:3306/addressbook_system";
	public static final String USERNAME = "root";
	public static final String PASSWORD = "root";
	
	public void connectionDB() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
	
		//connection create
		Connection con = null;
		try {
			con = DriverManager.getConnection
				("jdbc:mysql://localhost:3306/payroll_service","root","root");
			System.out.println("connection established!!!");
		} catch (SQLException e2) {
			System.out.println("Connection not established!!!");
			e2.printStackTrace();
		}
	}
}


