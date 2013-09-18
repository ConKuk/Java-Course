package core;

public class Run {

	public static void main(String[] args) {
		Point[] points = new Point[5];
		
		points[0] = new Point(1,2);
		points[1] = new Point(3,2);
		points[2] = new Pixel(5,2, "red");
		points[3] = new Pixel(1,2, "blue");
		points[4] = new Pixel(1,2, "green");
		
				
		for ( int i = 0; i < 5 ; i++ ) {
			System.out.print("x= " + points[i].getX());
			
			if ( points[i] instanceof Pixel ) {
				System.out.print(" ,color= " + ((Pixel)points[i]).getColor() );
			}
			
			System.out.println();
		}
		
	}
}
