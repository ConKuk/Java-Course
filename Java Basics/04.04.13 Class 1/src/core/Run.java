package core;

public class Run {

	
	public static void main (String[] args) {
		Point p1 = new Point();
		Point p2 = new Point();
		
		Pixel px1 = new Pixel();
		Pixel px2 = new Pixel();
		
		p1.setX(4);
		p1.setY(3);
		p2.setX(7);
		p2.setY(2);
		

		px1.setX(12);
		px1.setY(13);
		px1.setColor("Red");

		px2.setX(15);
		px2.setY(17);
		px2.setColor("Blue");

		
		/*System.out.println( p1.getX() + " " + p1.getY() );
		System.out.println( p2.getX() + " " + p2.getY() );
		
		System.out.println( px1.getX() + " " + px1.getY() + " " + px1.getColor() );
		System.out.println( px2.getX() + " " + px2.getY() + " " + px2.getColor() );*/
		
		System.out.println();
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(px1);
		System.out.println(px2);
		
	}
}
