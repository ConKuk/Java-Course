package core;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Store {

	public static void main(String[] args) {
		
		List<Person> ppl = new ArrayList<>();

		// A string array of names to randomize people
		// Male
		String[] mNames = {"Bob","Alex","Michael","Drake","John","Oscar","Steve"};
		// Female
		String[] fNames = {"Janet","Barbara","Sarah","Elizabeth","Dana","Rachel","Gloria"};

		
		for (int i = 0; i < 20 ;i++){

			int rand = (int)(Math.random()*mNames.length); // Randomizing a name
			int genRand = (int)(Math.random()*2); // Randomizing whether male or female

			// Setting name and gender accordingly
			String name = ((genRand == 0)?mNames[rand]:fNames[rand]);
			Gender pGen = ((genRand == 0)?Gender.MALE:Gender.FEMALE);
			
			ppl.add(new Person( name , (int)(Math.random()*51) + 25 ,pGen));
		}
		
		
		try (ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("people.dat")))){
			
			out.writeObject(ppl);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
