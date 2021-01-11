package com.rak.rakapp.gadgets;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Gadgets {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/jee";
		String user = "root";
		String password = "xworkz";
		Connection con = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, user, password);
			con.setAutoCommit(false);
			stmt = con.createStatement();
			int i = stmt.executeUpdate("delete from gadget_table where name='laptop'");
			System.out.println(i);
			con.commit();
		} catch (ClassNotFoundException | SQLException e) {
			try {

				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally {
			if (con != null || stmt != null) {
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
