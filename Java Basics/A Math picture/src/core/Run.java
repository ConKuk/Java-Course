package core;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int temp;
		int x;
		
		
		System.out.println("Please enter the size of the \"picture\": ");
		x = scan.nextInt();

		for (int i = -x+1 ; i < x ; i++ ) {
			temp = 1;
			for ( int j = -x+1 ; j < x ; j++ ) {

				if ( x - Math.abs(j) <= x - Math.abs(i) ) {
					temp = x - Math.abs(j);
				}

				System.out.printf("%2d ", temp);
			}
			System.out.println();
		}

	}

}
