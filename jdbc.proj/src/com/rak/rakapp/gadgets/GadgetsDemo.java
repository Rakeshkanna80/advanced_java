package com.rak.rakapp.gadgets;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

public class GadgetsDemo {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/jee";
		String user = "root";
		String password = "xworkz";
		Connection con = null;
		Statement stmt = null;
		Savepoint sp = null;

		int i;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, user, password);
			con.setAutoCommit(false);
			stmt = con.createStatement();
			sp = con.setSavepoint();
			i = stmt.executeUpdate("insert into gadget values(1,'mobile','electronics','a50',20000.00)");
			i = stmt.executeUpdate("insert into gadget values(2,'mobile','electronics','a50', 20000.00)");

			i = stmt.executeUpdate("insert into gadget values(3,'mobile','electronics','a50'20000.00)");

			sp = con.setSavepoint();
			i = stmt.executeUpdate("update gadget set price=25000 where id=3");
			i = stmt.executeUpdate("delete from gadget_table where name='mobile'");
			System.out.println(i);
			//con.commit();
		} catch (ClassNotFoundException | SQLException e) {

			try {
				if (con != null) {

					con.rollback(sp);
					con.commit();
				}
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();

		}

		finally {
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
