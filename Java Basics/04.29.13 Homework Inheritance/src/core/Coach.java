package core;

public class Coach extends Player {

	private int championships;

	public Coach(String name, int age, String sport, String coach,
			int championships) {
		super(name, age, sport, coach);
		this.championships = championships;
	}

	public int getChampionships() {
		return championships;
	}

	public void setChampionships(int championships) {
		this.championships = championships;
	}
	
	
}
