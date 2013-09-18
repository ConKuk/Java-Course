package core;

public class SpeedException extends Exception{
	
	private int speed;
	
	public SpeedException(String msg, int speed) {
		super(msg + ": " + speed);
		this.speed = speed;
	}
	
	public int getSpeed(){
		return this.speed;
	}

}
