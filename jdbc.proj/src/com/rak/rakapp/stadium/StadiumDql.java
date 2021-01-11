package com.rak.rakapp.stadium;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StadiumDql {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet r = null;
		
		String sql = "select * from stadium_table where stadium_id=?";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jee?user=root&password=xworkz");
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, 1);
			r=pstmt.executeQuery();
			while(r.next()) {
				System.out.println(r.getInt(1)+" "+r.getString(2));
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} finally {
			if (con != null || pstmt != null ||r!=null) {
				try {
					con.close();
					pstmt.close();
					r.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}

	}

}
