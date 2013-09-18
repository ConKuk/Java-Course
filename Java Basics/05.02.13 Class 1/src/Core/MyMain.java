package Core;

public class MyMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			Person person1 = new Person("Test1",500);
			System.out.println("Sababa!");
		} catch (WrongAgeException e) {
			System.out.println("Error: " + e.getMessage() + " value= " + e.getWrongAge());
		}
		
		
	}

}
