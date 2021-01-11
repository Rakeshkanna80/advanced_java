package com.entries;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Details {
	public static void main(String[] args) {
		Connection connection = null;
		Statement statement = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?user=root&password=xworkz");
			statement = connection.createStatement();
			statement.execute("insert into details_table values(1,'rakesh','bidar')");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			if (connection != null && statement != null) {
				try {
					connection.close();
					statement.close();
				} catch (SQLException e) {
					// TODO: handle exception
					e.printStackTrace();
				}

			}
		}
	}
}
