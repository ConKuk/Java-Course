package core;

public class University {

	public static Person randPerson(){
		String[] prof = {"Chemistry", "Physics", "Math", "Biology", "Sociology"};

		String[] name = {"John", "Paul", "Michael", "Bob", "Donald", "George"};

		if ( (int)(Math.random()*21) > 14) {
			return new Professor(name[(int)(Math.random()*6)], prof[(int)(Math.random()*5)] );
		} else {
			return new Student(name[(int)(Math.random()*5)], (int)(Math.random()*101) );
		}
	}


	public static void main(String[] args) {

		int pCount=0,sCount=0, avg=0;
		Person[] people = new Person[10];

		for (int i = 0 ; i<10 ; i++) {
			people[i] = randPerson();
		}

		for (int i = 0 ; i<10 ; i++){
			System.out.println(people[i]);
		}
		
		for ( int i = 0 ; i<10 ;i++){
			if ( people[i] instanceof Professor){
				pCount++;
			} else if (people[i] instanceof Student){
				sCount++;
			}
		}
		
		for ( int i = 0 ; i<10 ;i++){
			if (people[i] instanceof Student){
				avg += ((Student)people[i]).getGrade();
			}
		}
		
		System.out.println();
		System.out.println("Number of professors: " + pCount);
		System.out.println("Number of students: " + sCount);
		System.out.println("Students average grade: " + (avg/sCount));
		// testing git sync
		// test 2
	}

}
