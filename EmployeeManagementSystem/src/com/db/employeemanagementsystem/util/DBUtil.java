package com.db.employeemanagementsystem.util;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class DBUtil {
	public final static String USER_NAME = "root";
	public final static String PASSWORD = "";
	public final static String DRIVER_NAME = "com.mysql.jdbc.Driver";
	public final static String URL = "jdbc:mysql://localhost:3306/sample";
	public static Connection getConnection() {
		Connection connection = null;
		try {
			// load the driver class
			Class.forName(DRIVER_NAME);
			// get the connection from get connection method of driver manager class
			connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			return connection;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}
	
	public static void closeConnection(Connection connection) {
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
