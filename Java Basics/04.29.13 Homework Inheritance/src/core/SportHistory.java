package core;

public class SportHistory {

	public static void main(String[] args) {
		Person[] players = new Person[7];

		Coach c = null;

		players[0] = new Player("Tami",24,"Football","Greg");
		players[1] = new Player("Ami",24,"Football","Greg");
		players[2] = new Player("George",24,"Football","Paul");
		players[3] = new Player("Blake",24,"Football","Paul");
		players[4] = new Player("Sid",24,"Football","Mike");
		players[5] = new Coach("Greg",24,"Football","Ami",4);
		players[6] = new Coach("Paul",24,"Football","Ami",7);

		for ( int i = 0 ; i < players.length ; i++ ) {
			if (players[i] instanceof Player && 
					!(players[i] instanceof Coach)){
				System.out.print("The player name is " + players[i].getName());
				if ( (c = coachExists(players[i], players)) != null ) {
					System.out.println(" his coach name is " + c.getName() + " and he won " + c.getChampionships() + " championships");
				} else {
					System.out.println();
				}
			}
		}


	}

	public static Coach coachExists(Person player, Person[] players) {
		if ( !(player instanceof Player) ){
			return null;
		}
		for (int i = 0 ; i < players.length ; i++ ) {
			if ( players[i] instanceof Coach ) {
				if ( ((Player)player).getCoach().equals(players[i].getName()) ) {
					return (Coach)players[i];
				}
			}
		}
		return null;
	}

}
