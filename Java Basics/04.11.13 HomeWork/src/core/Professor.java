package core;

public class Professor extends Person {

	private String profession;

	public Professor(String name, String profession) {
		super(name);
		this.profession = profession;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	@Override
	public String toString() {
		return super.toString() + " profession=" + profession;
	}

	@Override
	public boolean equals(Object o) {
		if ( o instanceof Professor ){
			if ( this.profession.equals( ((Professor)o).getProfession() ) ){
				return true;
			}
		}
		return false;
	}
	
	
	
	
}
