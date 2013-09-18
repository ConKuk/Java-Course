package core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Logger {

	/////

	private String driverName;
	private static Connection con;
	private static Statement st;


	/////

	public Logger(String driverName){
		this.driverName=driverName;
		String database = "jdbc:mysql://localhost/test";
		String username = "test",password = "1234";
		
		try {
			Class.forName( driverName );
			Connection conn = DriverManager.getConnection(database, username, password);
			st = conn.createStatement();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

	//////

	/**
	 *  
	 * @param l - The log we want to be printed
	 * 
	 */
	public static void log(Log l){
		//System.out.println(l.getData());
		String addRow = "INSERT INTO log_table VALUES (" + l.getData() + ")";
		try {
			st.execute(addRow);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


	public static ArrayList<Log> getLogs(){
		ArrayList<Log> lg = new ArrayList<>();
		
		String retrieveRow = "SELECT * FROM log_table";
		try {
			st.execute(retrieveRow);
			
			ResultSet rs = st.getResultSet();
			
			while ( rs.next()){
				lg.add(new Log( rs.getDate(1).getTime(),
						rs.getInt(2),
						rs.getString(3),
						rs.getFloat(4)));
			}
			return lg;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

}
