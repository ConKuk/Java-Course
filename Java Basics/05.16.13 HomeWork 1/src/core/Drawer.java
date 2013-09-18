package core;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Drawer {

	public static void main(String[] args) {
		
		try (ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream("shapes.dat")))){
			
			ArrayList<Line> lineList = (ArrayList<Line>)in.readObject();
			
			for (Line l : lineList){
				l.paint();
				System.out.println();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
