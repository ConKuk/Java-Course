package core;

import java.awt.BorderLayout;
import java.awt.HeadlessException;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.DefaultCaret;

public class ClientWindow {

	private Socket server;
	private String name = "client";
	private JFrame frame;
	public JFrame getFrame() {
		return frame;
	}

	private JFrame frameText;
	private JTextArea txtChatList;
	private JTextField txtInptChat;
	private JButton btnSubmit;
	private MainFrameListener myListener;


	public ClientWindow() {

		name = (String)JOptionPane.showInputDialog(
				frame,
				"Enter your name:",
				"Customized Dialog",
				JOptionPane.PLAIN_MESSAGE,
				null,
				null,
				"Client" + (new Random()).nextInt(10000));

		try {
			server = new Socket( (String)JOptionPane.showInputDialog( frame, "Enter the adress of the server:", 
						"Customized Dialog",
						JOptionPane.PLAIN_MESSAGE,
						null,
						null,""),5554);
			(new DataOutputStream( server.getOutputStream())).writeUTF(name);
		} catch (HeadlessException | IOException e) {
			JOptionPane.showMessageDialog( frame, "Unable to connect to server!","Error",JOptionPane.ERROR_MESSAGE);
			System.exit(-1);
		}

		frame = new JFrame("Mini chatter");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		txtChatList = new JTextArea();
		txtInptChat = new JTextField(25);

		btnSubmit = new JButton("Submit");



		buildGui();

		
		Thread t = new Thread(new ChatWindowUpdater(this));
		t.setDaemon(true);
		t.start();
	}

	public Socket getServer() {
		return server;
	}

	private void buildGui() {
		myListener = new MainFrameListener(this);

		JPanel pan = new JPanel();

		frame.setSize(500, 650);

		JScrollPane scroll = new JScrollPane (txtChatList,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	    
		txtChatList.setEditable(false);
		txtChatList.setVisible(true);
		txtChatList.setLineWrap(true);
		((DefaultCaret)txtChatList.getCaret()).setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
		frame.getContentPane().add( scroll );

		pan.add(txtInptChat);
		pan.add(btnSubmit, BorderLayout.SOUTH);

		frame.getContentPane().add(pan, BorderLayout.SOUTH);

		frame.setVisible(true);

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

	public String getName(){
		return name;
	}
}
