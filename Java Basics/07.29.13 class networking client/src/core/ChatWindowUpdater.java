package core;

import java.io.DataInputStream;
import java.io.IOException;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class ChatWindowUpdater implements Runnable{

	private ClientWindow cl;
	private DataInputStream in;
	
	public ChatWindowUpdater(ClientWindow cl) {
		this.cl = cl;
		try {
			in = new DataInputStream( cl.getServer().getInputStream() );
		} catch (IOException e) {
			JOptionPane.showMessageDialog( cl.getFrame(), "Unable to establish incoming connection!","Error",JOptionPane.ERROR_MESSAGE);
			System.exit(-1);
		}
	}
	
	@Override
	public void run() {

		while (true) {
			JTextArea temp = cl.getTxtChatList();
			try {
				temp.append( in.readUTF() );
			} catch (IOException e) {
				JOptionPane.showMessageDialog( cl.getFrame(), "Connection to server lost!","Error",JOptionPane.ERROR_MESSAGE);
				System.exit(-1);
			}
			temp.append("\n");
		}
		
	}

}
