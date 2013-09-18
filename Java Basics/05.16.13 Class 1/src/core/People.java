package core;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class People {

	public static void main(String[] args) {
		
		int averageAge = 0;
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
		
		
		 // Computing the average.
		for (Person p : ppl){
			averageAge += p.getAge();
		}
		
		averageAge /= ppl.size();
		// average computed.
		
		
		try ( DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("oldpeople.dat")))) {
			
			out.writeUTF("Average = " + averageAge);
			
			for ( Person p : ppl ){
				if ( p.getGender() == Gender.MALE && p.getAge() > averageAge){
					out.writeUTF(p.getName() + "-" + p.getAge());
				}
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
