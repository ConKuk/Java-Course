package core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PersonDBManager {

	private Connection con;

	public PersonDBManager(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/test","test","1234");


		} catch (SQLException e) {
			System.exit(1);
			e.printStackTrace();
		} 

	}

	public void addPerson(Person p){
		try {
			Statement st = con.createStatement();

			st.executeUpdate(" INSERT INTO `person`( `NAME`, `AGE`) VALUES ('" + p.getName() + "' , " + p.getAge() + ")");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public Person getPerson(int pk){
		try {
			Statement st = con.createStatement();
			st.execute("SELECT NAME, AGE FROM person WHERE ID = " + pk);
			ResultSet rs = st.getResultSet();
			if (rs != null && rs.next()){
				return new Person(rs.getString("NAME"),rs.getInt("AGE"));
			} else {
				return null;
			}

		} catch (SQLException e) {

			e.printStackTrace();
			return null;
		} 
	}

	public void removePerson(int pk){

		try {
			Statement st = con.createStatement();
			st.executeUpdate("DELETE FROM person WHERE id = " + pk);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public List<Person> getAllPersons(){
		List<Person> list = new ArrayList<>();

		Statement st;

		try {
			st = con.createStatement();

			st.execute("SELECT * FROM person");
			ResultSet rs = st.getResultSet();
			while((rs!=null) && (rs.next()))
			{
				list.add(new Person(rs.getString("NAME"),rs.getInt("AGE")));
			}
			return list;
		}catch (SQLException e) {
			e.printStackTrace();
			return null;
		}

	}




}
