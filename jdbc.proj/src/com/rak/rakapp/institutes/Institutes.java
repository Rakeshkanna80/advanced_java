package com.rak.rakapp.institutes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Institutes {
	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jee?user=root&password=xworkz");
			stmt=con.createStatement();
			stmt.execute("insert into INSTITUTE_INFO values('jspider','rajajinagar','python')");
		} catch (ClassNotFoundException | SQLException e) {

			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if (con!=null&&stmt!=null) {
				try {
					con.close();
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
	}

}
