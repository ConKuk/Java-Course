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
	public void showDetails() {
		super.showDetails();
		System.out.println("He is the manager of " + department + " department");
	}

	@Override
	public String toString(){
		return super.toString() + ". He is the manager of " + department + " department";
	}

	@Override
	public boolean equals(Object o) {
		
		if (o instanceof Manager){
			if (super.equals(o) && 
					this.department.equals( ((Manager)o).getDepartment() ) ) {
				return true;
			} 
		}
		
		return false;

	}


}
