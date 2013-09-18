package core;

public class Player extends Person {

	private String sport;
	private String coach;
		
	public Player(String name, int age, String sport, String coach) {
		super(name, age);
		this.sport = sport;
		this.coach = coach;
	}

	@Override
	public void printProffesion() {
		System.out.println("He is a " + this.sport + " player.");
	}

	public String getSport() {
		return sport;
	}

	public void setSport(String sport) {
		this.sport = sport;
	}

	public String getCoach() {
		return coach;
	}

	public void setCoach(String coach) {
		this.coach = coach;
	}



}
