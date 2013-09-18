package core;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyList implements KeyListener {

	private int a;
	
	public MyList(){
		a = 0;
	}
	
	
	@Override
	public void keyPressed(KeyEvent arg0) {
		a++;
		System.out.println(a);
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		//a++;
		//System.out.println(a);

	}

}
