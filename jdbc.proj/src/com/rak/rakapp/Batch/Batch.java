package com.rak.rakapp.Batch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Batch {
	public static void main(String[] args) {
		String sql = "insert into army_table values(8,'India',10)";
		String sql1 = "insert into army_table values(9,'India',10)";
		String sql2 = "insert into army_table values(10,'India',10)";
		String sql3 = "update army_table set no_of_army=50 where army_id=3";
		Connection con = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jee?user=root&password=xworkz");
			stmt = con.createStatement();
			stmt.addBatch(sql);
			stmt.addBatch(sql1);
			stmt.addBatch(sql3);
			stmt.addBatch(sql2);
			int[] a = stmt.executeBatch();
			System.out.println(a.length);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
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
