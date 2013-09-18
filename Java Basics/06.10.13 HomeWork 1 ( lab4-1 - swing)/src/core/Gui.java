package core;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Gui {

	private JFrame frame;
	private JTextField txtInput;
	private JLabel lblCelsius;
	private JButton btnConvert;
	private JLabel lblFahrenheit;
	private ConvListener listener;
	
	//public static Gui instance = new Gui();
	
	
	public JTextField getTxtInput() {
		return txtInput;
	}

	public JLabel getLblFahrenheit() {
		return lblFahrenheit;
	}

	
	
	public Gui(){
		
		frame = new JFrame("Celsius to Fahrenheit");
		frame.setSize(400, 100);
		
		frame.setResizable(false);
		frame.setLayout(new GridLayout(2, 2));
		
		
		buildGui();
	}
	
	public void buildGui(){

		txtInput = new JTextField("0");
		lblCelsius = new JLabel("Celsius");
		btnConvert = new JButton("Convert");
		lblFahrenheit = new JLabel("0 Fahrenheit");
		listener = new ConvListener(this);
		
		btnConvert.addActionListener(listener);
		
		frame.getContentPane().add(txtInput);
		frame.getContentPane().add(lblCelsius);
		frame.getContentPane().add(btnConvert);
		frame.getContentPane().add(lblFahrenheit);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	

}
