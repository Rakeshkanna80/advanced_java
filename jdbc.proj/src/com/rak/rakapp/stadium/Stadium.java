package com.rak.rakapp.stadium;

import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Stadium {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = "insert into stadium_table values(?,?,?,?,?)";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jee?user=root&password=xworkz");
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, 2);
			pstmt.setString(2, "wankhade stadium");
			pstmt.setString(3, "mumbai");
			pstmt.setString(4, "40000");
			pstmt.setInt(5, 1000);
			int i = pstmt.executeUpdate();
			System.out.println(i);

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			if (pstmt != null || con != null) {
				try {
					con.close();
					pstmt.close();
				} catch (SQLException e) {
					// TODO: handle exception
				}

			}
		}
	}

}
