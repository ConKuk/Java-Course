package core;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MiniChatter {

	
	private JFrame frame;
	private JFrame frameText;
	private JTextArea txtChatList;
	private JTextField txtInptChat;
	private JButton btnAddText;
	private JButton btnSubmit;
	private MainFrameListener myListener;
	private MiniChatterWindowListener myWindowListener;
	
	public MiniChatter(){
		
		frame = new JFrame("Mini chatter");
		frameText = new JFrame("Add text");
		
		txtChatList = new JTextArea();
		txtInptChat = new JTextField(25);
		
		btnAddText = new JButton("Add");
		btnSubmit = new JButton("Submit");
		
		myListener = new MainFrameListener(this);
		myWindowListener = new MiniChatterWindowListener();
		
		buildGui();
	}
	
	private void buildGui(){
		JPanel pan = new JPanel();
		
		frame.setSize(500, 650);
		frameText.setSize(300, 100);
		frameText.setResizable(false);
		
		txtChatList.setEnabled(false);
		frame.getContentPane().add(txtChatList);
		frame.getContentPane().add(btnAddText, BorderLayout.SOUTH);
		
		
		pan.add(txtInptChat);
		frameText.getContentPane().add(pan);
		frameText.getContentPane().add(btnSubmit, BorderLayout.SOUTH);
		
		frame.addWindowListener(myWindowListener);
		frameText.addWindowListener(myWindowListener);
		
		frame.setVisible(true);
		
		btnAddText.addActionListener(myListener);
		btnAddText.setActionCommand("add");
		btnSubmit.addActionListener(myListener);
		btnSubmit.setActionCommand("submit");
		
		txtInptChat.setActionCommand("submit");
		txtInptChat.addActionListener(myListener);
		
	}

	public JFrame getFrameText() {
		return frameText;
	}

	public JTextArea getTxtChatList() {
		return txtChatList;
	}

	public JTextField getTxtInptChat() {
		return txtInptChat;
	}
	
}
