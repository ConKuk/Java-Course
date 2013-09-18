package core;

import java.awt.ComponentOrientation;
import java.awt.List;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;


public class Run {

	public static void main(String[] args) {
		Car c1 = new Car(120);

		int temp;

		try {

			while (true) {
				// Randomizing a number between -7 and 13 
				temp = (int)(Math.random()*21)-7;
				
				System.out.println("Current speed is:" + c1.getSpeed());
				
				// Depending on the randomized speed we decide whether to accelerate or decelerate
				if (temp >= 0){
					System.out.println("Accelerating by " + temp);
					c1.accelerate(temp);
				} else {
					System.out.println("Deccelerating by " + Math.abs(temp) );
					c1.deccelerate( Math.abs(temp) );
				}
				System.out.println();
				
			} 
		}catch (SpeedException e) {
			e.printStackTrace();	
			
			String message = null;
			
			// This is a different way to use a "try" block, its called "try-with-resources"
			//  Basically it knows that we try to open a resource, in this case a file
			//     and it will automatically close it when we exit the block, 
			//     it doesn't matter if there will be an exception or not.
			// notice: I explicitly specify that I want java to open the file as a UTF-8
			//         file, otherwise instead of Hebrew we get a bunch of "????%$#??%????"  :p
			
			try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("test.txt"),Charset.forName("UTF-8")))){
				message = br.readLine();
			}catch (IOException e2) {
				System.out.println("Sorry, couldn't open file :(");
				message = "Default message";
			}
			
			// An addition just for Moshe (Displays an error dialog with e.getMessage as the message and "ERROR" as the title)
			// "JOptionPane.ERROR_MESSAGE" is the type of the dialog, you can delete the "ERROR_MESSAGE" part and try to press
			// Ctrl + Space to see other options.
			
			//+ "  -->  " + e.getMessage()
			
			
			String msg = "<html><body style='width: 200px; padding: 5px; text-align: right;'>"
                    +  message + "<br>"
                    + e.getMessage();
			JLabel label1 = new JLabel( msg , JLabel.RIGHT);
			
			JOptionPane.showMessageDialog(null, label1,"ERROR", JOptionPane.ERROR_MESSAGE);
			
		}

		System.out.println("\nDone!");
	}
	
}


