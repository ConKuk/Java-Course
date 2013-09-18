package core;

public class Manager extends Employee {
	
	private String department;

	
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	@Override
	public String toString(){
		return super.toString() + ". He is the manager of " + department + " department";
	}
}
