package core;

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
		try {
			out = new DataOutputStream(chatter.getServer().getOutputStream());
		} catch (IOException e) {
			JOptionPane.showMessageDialog( mainChatter.getFrame(), "Unable to establish outgoing connection!","Error",JOptionPane.ERROR_MESSAGE);
			System.exit(-1);
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if( "submit".equals( e.getActionCommand() ) ){
			try {
				out.writeUTF( mainChatter.getTxtInptChat().getText() );
				mainChatter.getTxtInptChat().setText("");
				
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
	}

}
