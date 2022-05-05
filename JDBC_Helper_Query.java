package com.bl.addressbook.sql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Helper_Query {
	Connection con;
	
	public void showContactQuery() {
	try {
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("Select * from addressbook");

		while (rs.next()) {
			
			System.out.println(rs.getDouble(1));
			
		}} catch (SQLException e) {
			e.printStackTrace();
		}
}

}
