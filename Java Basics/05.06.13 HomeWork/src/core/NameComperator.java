package core;

import java.util.Comparator;

public class NameComperator implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
			return ((Person)o1).getName().compareTo(((Person)o2).getName());
	}




}
