package Core;

public class Run {

	public static void main(String[] args) {
		int x = (int)(Math.random()*101);
		
		int i;
		
		for (i = 0; i < x ; i++) {
			if ( (i % 2) == 0) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println("\n");
		
		for (i = 0; i < x ; i = i+2 ) {
			System.out.print(i + " ");
		}
	}

}
