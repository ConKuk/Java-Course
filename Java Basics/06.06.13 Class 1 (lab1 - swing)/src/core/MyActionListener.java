package core;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class MyActionListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "BOOO","ERROR", JOptionPane.ERROR_MESSAGE);
		
	}

}
