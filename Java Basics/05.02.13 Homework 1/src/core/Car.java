package core;

public class Car {

	private int speed;
	private final int MAX_SPEED;

	public Car(int max_speed) {
		this.MAX_SPEED = max_speed;
	}


	public void accelerate(int value) throws SpeedException {
		int temp;
		if ( (temp = this.speed + value) > MAX_SPEED ){
			throw new SpeedException("Trying to go above speed limit!", temp);
		} else {
			this.speed += value;
		}
	}

	public void deccelerate(int value) throws SpeedException {
		int temp;
		if ( (temp = this.speed - value ) <= 0) {
			throw new SpeedException("Speed cannot become negative", temp);
		} else {
			this.speed -= value;
		}
	}


	public int getSpeed() {
		return speed;
	}

	
	
}
