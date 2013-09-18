package core;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Load {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		ArrayList<Person> ppl = null;
		
		try ( ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream("people.dat")))) {
			
			ppl = (ArrayList<Person>)(in.readObject());
			
		} catch (IOException | ClassNotFoundException e) {
			System.exit(1);
			e.printStackTrace();
		} 
		
		printList(ppl);

	}
	
	public static void printList(ArrayList<Person> ppl){
		for (Person p: ppl){
			System.out.println(p);
		}
	}

}
