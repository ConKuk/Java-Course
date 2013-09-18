package core;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Run {

	public static void main(String[] args){
		
		JFrame frame = new JFrame("Clock");
		
		frame.setSize(200, 100);
		frame.setResizable(false);
		
		JLabel clock = new JLabel("00:00:00");
		clock.setFont(new Font("Arial", Font.ITALIC, 24));
		
		frame.getContentPane().add(clock);
		
		Thread t = new Thread(new Clock(clock));
		t.setDaemon(true);
		t.start();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
}
