package core;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Run  {
	
	public static void main(String[] args){
		
		JFrame f = new JFrame("My first swing frame");
		f.setSize(300, 200);
		JButton b = new JButton("My button");
		b.setBackground(Color.RED);
		b.setFont(new Font("Arial", Font.BOLD, 25));
		b.setHorizontalAlignment(JButton.CENTER);
		
		b.addActionListener(new MyActionListener());
		
		f.setLayout(new FlowLayout());
		f.getContentPane().add(b);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

}
