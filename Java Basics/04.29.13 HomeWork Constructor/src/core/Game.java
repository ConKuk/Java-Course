package core;

import java.awt.SecondaryLoop;

public class Game {

	public static void main(String[] args) {
		int rounds = 0;
		int firstWon = 0;
		int secondWon = 0;
		
		if ( args.length != 3 ) {
			System.out.println("Wrong number of arguments! \nUsage: <programName> <integer - number of rounds> <Player1 name> <Player2 name>");
			System.exit(0);
		}
		
		try {
			rounds = Integer.parseInt(args[0]);
		} catch (NumberFormatException e) {
			System.out.println("The first argument must be an integer!!");
			System.exit(0);
		}
		
		
		Player p1 = new Player(args[1]);
		Player p2 = new Player(args[2]);
		
		
		for (int i = 0 ; i < rounds ; i++ ){
			p1.setLuckNum();
			p2.setLuckNum();
			
			if (p1.getLuckNum() == p2.getLuckNum() ){
				i--;
				continue;
			}
			
			if ( p1.getLuckNum() > p2.getLuckNum() ){
				System.out.println("Game no " + (i+1) + ": Winner - " + p1.getName());
				firstWon++;
			} else {
				System.out.println("Game no " + (i+1) + ": Winner - " + p2.getName());
				secondWon++;
			}
			
			
		}
		
		if (firstWon > secondWon){
			
		}

	}

}
