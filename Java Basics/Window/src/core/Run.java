package core;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Run {

	public static void main(String[] args){
		JFrame f = new JFrame("test");
		JTextField l = new JTextField("My label");
		l.setToolTipText("<html><body> TEST" + 
				"<br>" + "test2" + "</body></html>");
		f.setSize(200, 200);
		l.addKeyListener(new MyList());
		f.getContentPane().add(l,BorderLayout.NORTH);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
	
}
