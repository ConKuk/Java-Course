package Core;

public class Person {

	private String name;
	private int age;


	public Person(String nName, int age) throws WrongAgeException{
		name = nName;
		setAge(age);
	}

	public String getName(){
		return name;
	}

	public void setName(String nName){
		name = nName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws WrongAgeException{
		if (age > 130 || age < 0) {
			throw new WrongAgeException(age, "Wrong age set");
		} 
		this.age = age;


	}



}
