package com.rak.rakapp.Helicopter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Helicopter {
	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		try {
			// fully qualified class name
			Class.forName("com.mysql.cj.jdbc.Driver");
			// establishing the connection with database server
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jee?user=root&password=xworkz");
			// creating a statement
			stmt = con.createStatement();
			// executing a statement/SQL queries
			stmt.execute("insert into HELICOPTER_INFO values(1,'apache','500kmph')");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			// closing the costly resources
		} finally {
			if (con != null & stmt != null) {
				try {
					con.close();
					stmt.close();
				} catch (SQLException e) {
					// TODO: handle exception
				}
			}
			
		}
	}

}
