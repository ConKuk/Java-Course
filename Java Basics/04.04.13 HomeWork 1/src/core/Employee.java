package core;

public class Employee {

	private String name;
	private float salary;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "The employees name: " + name + " and his salary is: " + salary;
	}
	
	
}