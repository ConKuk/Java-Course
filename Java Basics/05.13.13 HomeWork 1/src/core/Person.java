package core;

public class Person {
	
	private int age;
	private String name;
	private Gender gender;
	
	
	public Person(String name, int age, Gender gender) {
		this.age = age;
		this.name = name;
		this.gender = gender;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Gender getGender() {
		return gender;
	}


	public void setGender(Gender gender) {
		this.gender = gender;
	}


	@Override
	public boolean equals(Object arg0) {
		if (arg0 instanceof Person){
			
			Person other = (Person)arg0;
			
			if ( name.equals( other.getName() ) && age == other.getAge() && gender == other.gender){
				return true;
			} else {
				return false;
			}
		} else {
			throw new ClassCastException("Must compare with a Person.");
		}
	}


	@Override
	public String toString() {
		return name + ", age: " + age + ", " + gender;
	}
	
	
	
	

}
