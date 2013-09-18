package core;

import java.util.ArrayList;
import java.util.List;

public class Test {

	
	public static void main(String[] args) {
		List<Person> ppl = new ArrayList<>();

		PersonDBManager pDB = new PersonDBManager();
		
		String[] mNames = {"Bob","Alex","Michael","Drake","John","Oscar","Steve"};
		
		for (int i = 0; i < 20 ;i++){

			int rand = (int)(Math.random()*mNames.length); 
			
			String name = mNames[rand];
			Person p = new Person( name , (int)(Math.random()*51) + 25 );
			ppl.add(p);
			//pDB.addPerson(p);
		}
		
		List<Person> test = new ArrayList<>();
		
		test = pDB.getAllPersons();
		System.out.println(test);
		
		//pDB.removePerson(10);
		System.out.println(pDB.getPerson(11));
		//load all persons from DB
		//remove some persons
		//load all persons again
		//get specific person by pk and print its details

	}

}
