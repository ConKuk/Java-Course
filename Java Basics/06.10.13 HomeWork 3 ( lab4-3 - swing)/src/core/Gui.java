package core;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.*;

public class Gui {

	private JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bEq,bDiv,bMul,bSub,bAdd,bClr;
	private JTextField result;
	private JFrame frame;
	private JPanel mainPanel;

	public Gui(){
		initializeComponents();
		buildGui();

	}

	private void initializeComponents(){
		frame = new JFrame("Calculator");

		b0 = new JButton("0");
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");
		bEq = new JButton("=");
		bDiv = new JButton("/");
		bMul = new JButton("*");
		bSub = new JButton("-");
		bAdd = new JButton("+");
		bClr = new JButton("C");
		mainPanel = new JPanel();
		
		result = new JTextField("");
	}

	private void buildGui(){
		
		buildMainPanel();
		addListeners();
		
		result.setFont(new Font("Arial", Font.BOLD, 25));
		frame.getContentPane().add(result,BorderLayout.NORTH);
		frame.getContentPane().add(mainPanel);
		frame.setSize(300, 250);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}
	
	private void buildMainPanel(){
		
		mainPanel.setLayout(new GridLayout(4, 4, 4, 4));
		
		mainPanel.add(b7);
		mainPanel.add(b8);
		mainPanel.add(b9);
		mainPanel.add(bMul);
		mainPanel.add(b4);
		mainPanel.add(b5);
		mainPanel.add(b6);
		mainPanel.add(bDiv);
		mainPanel.add(b1);
		mainPanel.add(b2);
		mainPanel.add(b3);
		mainPanel.add(bSub);
		mainPanel.add(bEq);
		mainPanel.add(b0);
		mainPanel.add(bClr);
		mainPanel.add(bAdd);
	}
	
	private void addListeners(){
		CalcListener listen = new CalcListener(result);

		b0.addActionListener(listen);
		b1.addActionListener(listen);
		b2.addActionListener(listen);
		b3.addActionListener(listen);
		b4.addActionListener(listen);
		b5.addActionListener(listen);
		b6.addActionListener(listen);
		b7.addActionListener(listen);
		b8.addActionListener(listen);
		b9.addActionListener(listen);
		bEq.addActionListener(listen);
		bDiv.addActionListener(listen);
		bMul.addActionListener(listen);
		bSub.addActionListener(listen);
		bAdd.addActionListener(listen);
		bClr.addActionListener(listen);
		
		b0.setActionCommand("0");
		b1.setActionCommand("1");
		b2.setActionCommand("2");
		b3.setActionCommand("3");
		b4.setActionCommand("4");
		b5.setActionCommand("5");
		b6.setActionCommand("6");
		b7.setActionCommand("7");
		b8.setActionCommand("8");
		b9.setActionCommand("9");
		bEq.setActionCommand("=");
		bDiv.setActionCommand("/");
		bMul.setActionCommand("*");
		bSub.setActionCommand("-");
		bAdd.setActionCommand("+");
		bClr.setActionCommand("C");
		
	}
}
