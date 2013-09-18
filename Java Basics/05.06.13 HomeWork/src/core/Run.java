package core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Run  {

	private static List<Person> people;
	
	public static void main(String[] args) {
		
		people = new ArrayList<Person>();
		
		// A string array of names to randomize 10 people
		String[] names = {"Bob","Alex","Michael","Drake","John","Oscar","Steve"};
		
		// Randomizing 10 people to add to the list
		for (int i = 0; i<10;i++){
			
			// rand - used to randomize the persons name
			int rand = (int)(Math.random()*names.length);
			
			people.add(new Person( names[rand], (int)(Math.random()*51) + 20 ));
		}
		

		printList(people);
		
		// Sorting by natural ordering		
		Collections.sort(people);
		
		printList(people);
		
		// Sorting using the age reverse comparator
		Collections.sort(people,new AgeReverseComparator());
		
		printList(people);
		
		// Sorting using a name comparator
		Collections.sort(people,new NameComperator());
		
		printList(people);
		
	}
	
	
	// Created my own method to print the lists so it will print them in a nicer form.
	private static void printList(List<Person> pList){
		
		/*
		 * The following "for" is a for-each loop, it basically goes over the given array/list
		 * for each member of the type specified in the beginning using the reference name you choose to manipulate the member.
		 * (Rather similar to iterators that we learned today)
		 * for ( <type> <reference name> : <target list/array> )
		 */
		
		for (Person p : pList)  {
			System.out.printf("Name: %-7s, Age: %2d ", p.getName(), p.getAge()  ); 
		}
		
		System.out.println();
	}

}
