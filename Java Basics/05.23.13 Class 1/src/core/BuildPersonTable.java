package core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BuildPersonTable {

	
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Connection con=null;
		try {
			String username = "test",password = "1234";
			con=DriverManager.getConnection("jdbc:mysql://localhost/test",username,password);
			Statement stmt=con.createStatement();
			stmt.executeUpdate("CREATE table person (" +
					"ID INTEGER NOT NULL PRIMARY KEY " +
					","+
					"NAME VARCHAR(30),"+
					"AGE INT)");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
