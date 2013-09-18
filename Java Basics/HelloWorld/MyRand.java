import java.math.*;

public class MyRand {
	public static void main(String[] args ) {
		int rand1 = (int)(Math.random()*101);
		int rand2 = (int)(Math.random()*101);
		System.out.println("Random1: " + rand1);
		System.out.println("Random2: " + rand2);
		System.out.println("Sum of the 2 randoms: " + (rand1 + rand2) );
		System.out.println("Average of the 2 randoms " + ( (rand1 + rand2)/2) );
		System.out.println("Remainder of dividing random1 by 10: " + (rand1%10) );
		System.out.println("Remainder of dividing random2 by 10: " + (rand2%10) );
		System.out.println("Are of rectangle with sides random1 and random2: " + ( rand1 * rand2 ) );
		}
}