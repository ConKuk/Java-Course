package core;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class ColorMouseMotionListener extends MouseMotionAdapter {

	private JFrame myFrame;
	
	public ColorMouseMotionListener( JFrame f ){
		this.myFrame = f;
	}
	
	@Override
	public void mouseMoved(MouseEvent e) {
		int test = ( e.getX() < (int)(myFrame.getSize().getWidth()/2))? 0 : 1;
		test += ( e.getY() < (int)(myFrame.getSize().getHeight()/2))? 0 : 2;

		switch (test){
		case 0:
			myFrame.getContentPane().setBackground(Color.WHITE);
			break;
		case 1:
			myFrame.getContentPane().setBackground(Color.BLACK);
			break;
		case 2:
			myFrame.getContentPane().setBackground(Color.ORANGE);
			break;
		case 3:
			myFrame.getContentPane().setBackground(Color.GRAY);
			break;
		}
	}

}
