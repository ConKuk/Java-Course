package core;

import java.util.Comparator;

public class AgeReverseComparator implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
			return ((Person)o1).compareTo(o2)*-1;		
	}



}
