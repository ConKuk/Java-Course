package core;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Run {

	public static void main(String[] args){
		
		gui();
	}
	
	public static void gui(){
		
		JFrame frame = new JFrame("");
		frame.setSize(600, 300);
		
		JLabel headLabel = new JLabel("Connection User Interface");
		headLabel.setFont(new Font("Arial", Font.ITALIC, 24));
		
		JPanel leftPanel = new JPanel();
		JPanel centerPanel = new JPanel();
		JPanel rightPanel = new JPanel();
		
		JRadioButton rb1 = new JRadioButton("Shared");
		JRadioButton rb2 = new JRadioButton("Not Shared");
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		
		leftPanel.setLayout(new GridLayout(7,1));
		centerPanel.setLayout(new GridLayout(3,1));
		
		leftPanel.add(new JCheckBox("Proxy"));
		leftPanel.add(new JCheckBox("Fire Wall"));
		leftPanel.add(new JCheckBox("SSL Enabled"));
		leftPanel.add(new JLabel(""));
		leftPanel.add(new JLabel("Files"));
		leftPanel.add(rb1);
		leftPanel.add(rb2);
		
		JButton b1 = new JButton("Connect");
		JButton b2 = new JButton("Disconnect");
		JButton b3 = new JButton("Away");
		
		b1.setToolTipText("Connect to the server");
		b2.setToolTipText("Disconnect from the server");
		b3.setToolTipText("Enable 'away' mode");
		
		centerPanel.add(b1);
		centerPanel.add(b2);
		centerPanel.add(b3);
		
		String[] options = {"User 1", "User 2", "User 3"};
		
		rightPanel.add(new JLabel("Choose User"));
		rightPanel.add(new JComboBox<String>(options));
		rightPanel.setSize(100, 50);
		

		frame.getContentPane().add(headLabel, BorderLayout.NORTH);
		frame.getContentPane().add(leftPanel, BorderLayout.WEST);
		frame.getContentPane().add(centerPanel, BorderLayout.CENTER);
		frame.getContentPane().add(rightPanel, BorderLayout.EAST);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
