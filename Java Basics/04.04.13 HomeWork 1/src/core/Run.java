package core;

public class Run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		Manager m1 = new Manager();
		Manager m2 = new Manager();
		
		e1.setName("Yosi");
		e1.setSalary(4000);
		
		e2.setName("Moty");
		e2.setSalary(4200);
		
		m1.setName("Abraham");
		m1.setSalary(9000);
		m1.setDepartment("Engineering");
		
		m2.setName("Jacob");
		m2.setSalary(11000);
		m2.setDepartment("Acounting");
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(m1);
		System.out.println(m2);
		
		
	}

}
