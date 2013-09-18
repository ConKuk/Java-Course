package client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.IOException;

import javax.swing.JOptionPane;

public class MainFrameListener implements ActionListener {

	private ClientWindow mainChatter;
	private DataOutputStream out;
	
	public MainFrameListener(ClientWindow chatter) {
		this.mainChatter = chatter;
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if( "submit".equals( e.getActionCommand() ) ){
			try {
				server.SocketList.sendMsg(  mainChatter.getName() + " > " + mainChatter.getTxtInptChat().getText());
				mainChatter.getTxtChatList().append( mainChatter.getName() + " > " + mainChatter.getTxtInptChat().getText() + "\n");
				mainChatter.getTxtInptChat().setText("");
				
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
	}

}
