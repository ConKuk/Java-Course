package core;

import java.util.Calendar;
import java.util.MissingFormatArgumentException;

import javax.swing.JLabel;

public class Clock implements Runnable{

	private JLabel clockLabel;
	
	public Clock(JLabel clockLabel){
		this.clockLabel = clockLabel;
	}

	@Override
	public void run() {
		String ampm = null;;
		String time = null;
		while (true){
			Calendar c = Calendar.getInstance();
			ampm = ( ( c.get(Calendar.AM_PM ) == 1 ) ? "PM" : "AM");
			time = null;
			time = String.format(" %02d:%02d:%02d %s ", c.get(Calendar.HOUR), c.get(Calendar.MINUTE), c.get(Calendar.SECOND), ampm);
			
			clockLabel.setText( time );
			
			try {
				Thread.sleep(800);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
}
