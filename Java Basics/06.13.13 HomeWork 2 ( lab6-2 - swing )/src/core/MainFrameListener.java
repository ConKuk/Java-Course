package core;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MainFrameListener implements ActionListener {

	private MiniChatter mainChatter;
	
	public MainFrameListener(MiniChatter chatter){
		this.mainChatter = chatter;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if ( "add".equals( e.getActionCommand() ) ){
			mainChatter.getFrameText().setVisible(true);
			mainChatter.getTxtInptChat().setText("");
			mainChatter.getTxtInptChat().requestFocus();
			
		} else if( "submit".equals( e.getActionCommand() ) ){
			JTextArea temp = mainChatter.getTxtChatList();
			temp.append( "root > " + mainChatter.getTxtInptChat().getText() );
			temp.append("\n");
			mainChatter.getFrameText().setVisible(false);
		}
		
	}

}
