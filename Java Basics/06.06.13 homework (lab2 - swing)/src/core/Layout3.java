package core;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Layout3 {

	public Layout3(){
		
		JFrame f = new JFrame("GridLayout example");
		
		f.setLayout(new GridLayout(3, 2));
		
		for (int i = 0; i < 3 ; i++) {
			for (int j = 0 ; j < 2 ; j++){
				int index = (i)*2+j;
				f.getContentPane().add(new JButton("" + (index+1)));
			}
		}
		
		f.setSize(300, 200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
	}
	
}
