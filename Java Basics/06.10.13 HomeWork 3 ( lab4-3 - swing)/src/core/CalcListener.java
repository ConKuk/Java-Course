package core;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

public class CalcListener implements ActionListener {

	private JTextField result;
	private  double calcRes;
	private  double secondOperand;
	private  double firstOperand;
	private char operator;
	private boolean toClear;
	private boolean operationPerformed;

	public CalcListener(JTextField result){
		this.result = result;
		calcRes = 0.0;
		operator = 'C';
		toClear = true;
		operationPerformed = true;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		/////////////////////        Equals pressed                    ///////////////////
		if (e.getActionCommand().equals("=")){
			calculate();
			result.setText(calcRes + "");
			secondOperand = calcRes;
			toClear = true;
		} 
		/////////////////////        Operands pressing catcher         ///////////////////
		else if (e.getActionCommand().matches("[/+/*//-]")){
			if ( !operationPerformed ){
				calculate();
				result.setText(calcRes + "");
			} else {
				firstOperand = secondOperand;
				result.setText(firstOperand + "");
			}
			operator = (e.getActionCommand()).charAt(0);
			operationPerformed = false;
			toClear = true;
		} 
		/////////////////////         Clear pressed                   ////////////////////
		else if (e.getActionCommand().equals("C")){
			calcRes = 0.0;
			firstOperand = 0.0;
			secondOperand = 0.0;
			toClear = false;
			operationPerformed = false;
			result.setText("");
		} 
		/////////////////////         Any other button pressed        ////////////////////
		else {
			if ( toClear ) {
				result.setText("");
				toClear = false;
			}
			result.setText(result.getText() + ((JButton)e.getSource()).getText());
			secondOperand = Double.parseDouble(result.getText());
		}

	}

	private void calculate(){
		if ( operator == '+' ){
			calcRes = firstOperand + secondOperand;
		} else if ( operator == '-' ){
			calcRes = firstOperand - secondOperand;
		} else if ( operator == '/' ){
			calcRes = firstOperand / secondOperand;
		} else if ( operator == '*' ){
			calcRes = firstOperand * secondOperand;
		} 
		firstOperand = calcRes;
		operationPerformed = true;
	}

}
