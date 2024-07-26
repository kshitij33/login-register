package com.company.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	static String URL ="jdbc:mysql://localhost:3306/DB";
	static String USERNAME="root";
	static String PASSWORD="Password@123";
	
	// Load the driver
	static {
	    try {
	        // Load the MySQL JDBC driver
	        Class.forName("com.mysql.cj.jdbc.Driver");
	    } catch (ClassNotFoundException e) {
	        e.printStackTrace();
	    }
	}
	
	public static Connection getConnection() throws SQLException {
	    return DriverManager.getConnection(URL, USERNAME, PASSWORD);
	}

}
