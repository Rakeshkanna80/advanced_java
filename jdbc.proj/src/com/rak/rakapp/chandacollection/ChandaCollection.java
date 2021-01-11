package com.rak.rakapp.chandacollection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ChandaCollection {
	public static void main(String[] args) { 
		Connection con=null;
		Statement stmt=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jee?user=root&password=xworkz");
			stmt=con.createStatement();
			stmt.execute("insert into chanda_collection_table values(1,'rakesh',100.00,8197181791)");
		} catch (ClassNotFoundException |SQLException e) {
			
			e.printStackTrace();
		}
		finally {
			if(con!=null&&stmt!=null) {
				try {
					con.close();
					stmt.close();
				} catch (SQLException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
			
		}
	}

}
 	