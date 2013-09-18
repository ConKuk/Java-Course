package core;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Shape {

	public static void main(String[] args) {
		
		List<Line> lineList = new ArrayList<>();
		
		lineList.add(new Line(12));
		lineList.add(new Line(3));
		
		lineList.add(new WLine(2, 9));
		lineList.add(new WLine(5, 3));
		
		try (ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("shapes.dat")))){
			
			out.writeObject(lineList);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
