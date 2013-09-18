package core;

import java.io.Serializable;

public class Line implements Serializable {

	private int length;
	
	public Line(int length){
		this.length = length;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	
	public void paint() {
		for( int i = 0 ; i < length ; i++ ){
			System.out.print("*");
		}
		System.out.println();
	}
}
