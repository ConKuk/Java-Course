package core;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class ColorMouseListener implements MouseListener {

	private JFrame myFrame;
	
	public ColorMouseListener(JFrame f){
		myFrame = f;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		if ( e.getButton() == MouseEvent.BUTTON1){
			myFrame.getContentPane().setBackground(Color.RED);
		} else if ( e.getButton() == MouseEvent.BUTTON2 ){
			myFrame.getContentPane().setBackground(Color.YELLOW);
		} else if ( e.getButton() == MouseEvent.BUTTON3 ){
			myFrame.getContentPane().setBackground(Color.BLUE);
		}

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
