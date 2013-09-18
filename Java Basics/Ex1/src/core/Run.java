package core;

public class Run {
	public static void main(String[] args) {
		int x,y,z;
		
		x = (int)(Math.random()*101);
		y = (int)(Math.random()*101);
		z = (int)(Math.random()*101);
		
		System.out.println("x = " + x );
		System.out.println("y = " + y );
		System.out.println("z = " + z );
		
		if ( x > y && x > z) {
			System.out.println("x is the biggest.");
		} else if ( y > z ){
			System.out.println("y is the biggest.");
		} else {
			System.out.println("z is the biggest.");
		}
	}

}
