package core;

public class Run {

	public static void main(String[] args) {
		Line line1 = new Line(6);
		Line line2 = new Line(7);
		
		WLine wline1 = new WLine(8, 4);
		WLine wline2 = new WLine(4, 2);
		
		line1.paint();
		System.out.println();
		line2.paint();
		System.out.println();
		
		wline1.paint();
		System.out.println();
		wline2.paint();
	}

}
