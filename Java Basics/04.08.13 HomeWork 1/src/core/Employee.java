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

	public void showDetails() {
		System.out.println("The employee's name is: " + name + " and his salary is: " + salary);
	}

	@Override
	public String toString() {
		return "The employee's name: " + name + " and his salary is: " + salary;
	}
	@Override
	public boolean equals(Object o) {

		if ( o instanceof Employee){

			if ( this.name.equals( ((Employee)o).getName()) &&
					this.salary == ((Employee)o).getSalary() ) {
				return true;
			} 
		}
		return false;


	}
}




