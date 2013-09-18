package core;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConvListener implements ActionListener {

	private Gui gui;
	
	public ConvListener(Gui gui){
		this.gui = gui;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
			float answer = Integer.parseInt(gui.getTxtInput().getText())*(9.0f/5.0f)+32.0f;
			gui.getLblFahrenheit().setText(answer + " Fahrenheit");
		
	}

}
