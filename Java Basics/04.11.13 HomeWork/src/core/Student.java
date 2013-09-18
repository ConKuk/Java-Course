package core;

public class Student extends Person {
	

	private int grade;

	public Student(String name, int grade) {
		super(name);
		this.grade = grade;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return super.toString() + " grade=" + grade;
	}
	
	@Override
	public boolean equals(Object o) {
		if ( o instanceof Student ) {
			if ( this.grade == ((Student)o).getGrade() ){
				return true;
			}
		}
		return false;
	}
	
}
