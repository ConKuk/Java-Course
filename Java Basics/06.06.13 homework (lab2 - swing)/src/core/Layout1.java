package core;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Layout1 {

	public Layout1(){
		
		JFrame f = new JFrame("Flow layout example");
		
		f.setLayout(new FlowLayout());
		f.setSize(300,200);
		
		f.getContentPane().add(new JButton("1"));
		f.getContentPane().add(new JButton("2"));
		f.getContentPane().add(new JButton("3"));
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}
