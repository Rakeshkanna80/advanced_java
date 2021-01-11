package com.rak.rakapp.Batch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BatchDemo {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		PreparedStatement pstmt1 = null;
		PreparedStatement pstmt2 = null;

		String url = "jdbc:mysql://localhost:3306/jee?user=root&password=xworkz";
		String sql = "insert into army_demo values(?,?,?)";
		String sql1 = "insert into army_demo values(?,?,?)";
		String sql2 = "insert into army_demo values(?,?,?)";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url);
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, 50);
			pstmt.setString(2, "india");
			pstmt.setString(3, "50");
			pstmt.addBatch();
			int[] a = pstmt.executeBatch();

			pstmt1 = con.prepareStatement(sql);
			pstmt1.setInt(1, 20);
			pstmt1.setString(2, "india");
			pstmt1.setString(3, "50");
			pstmt1.addBatch();
			int[] a1 = pstmt.executeBatch();
			System.out.println(a1.length);

			pstmt2 = con.prepareStatement(sql);
			pstmt2.setInt(1, 30);
			pstmt2.setString(2, "india");
			pstmt2.setString(3, "50");
			pstmt2.addBatch();
			int[] a2 = pstmt.executeBatch();
			System.out.println(a2.length);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (con != null || pstmt != null) {
				try {
					con.close();
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
