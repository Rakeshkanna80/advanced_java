package com.rak.rakapp.xworkz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Xworkz {
	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jee?user=root&password=xworkz");
			stmt = con.createStatement();
			stmt.execute("insert into xworkz_table values(2,'sachin',1234567891)");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			if (con != null | stmt != null) {
				try {
					con.close();
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}

			}
		}
	}

}
