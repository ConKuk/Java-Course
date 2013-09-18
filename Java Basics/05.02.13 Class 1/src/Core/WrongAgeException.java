package Core;

public class WrongAgeException extends Exception {
	private int wrongAge;

	public WrongAgeException(int wrongAge, String arg0) {
		super(arg0);
		this.wrongAge = wrongAge;
	}
	
	public int getWrongAge() {
		return this.wrongAge;
	}
	
	
}
