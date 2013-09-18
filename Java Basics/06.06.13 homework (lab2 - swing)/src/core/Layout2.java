package core;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Layout2 {

	
	public Layout2(){
		
		JFrame f = new JFrame("BorderLayout example");
		
		
		f.setSize(300,200);
		f.getContentPane().add(new JButton("NORTH"),BorderLayout.NORTH);
		f.getContentPane().add(new JButton("SOUTH"),BorderLayout.SOUTH);
		f.getContentPane().add(new JButton("EAST"),BorderLayout.EAST);
		f.getContentPane().add(new JButton("WEST"),BorderLayout.WEST);
		f.getContentPane().add(new JButton("CENTER"));
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
	}
}
