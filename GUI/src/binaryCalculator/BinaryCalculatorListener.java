package binaryCalculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class BinaryCalculatorListener implements ActionListener{

	BinaryCalculatorPanel bCP;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton clicked = (JButton) e.getSource();
		if(clicked.getText().equals("Add")){
			if(bCP.getInput1().getText().equals("")||bCP.getInput2().getText().equals("")){
				bCP.setOutputText("One or more inputs unresolved");
			}
			else{
				add(bCP.getInput1().getText(), bCP.getInput2().getText());
			}
		}
		if(clicked.getText().equals("Subtract")){
			if(bCP.getInput1().getText().equals("")||bCP.getInput2().getText().equals("")){
				bCP.setOutputText("One or more inputs unresolved");
			}
			else{
				subtract(bCP.getInput1().getText(), bCP.getInput2().getText());
			}
		}
		if(clicked.getText().equals("Multiply")){
			if(bCP.getInput1().getText().equals("")||bCP.getInput2().getText().equals("")){
				bCP.setOutputText("One or more inputs unresolved");
			}
			else{
				multiply(bCP.getInput1().getText(), bCP.getInput2().getText());
			}
		}
		if(clicked.getText().equals("Divide")){
			if(bCP.getInput1().getText().equals("")||bCP.getInput2().getText().equals("")){
				bCP.setOutputText("One or more inputs unresolved");
			}
			else{
				divide(bCP.getInput1().getText(), bCP.getInput2().getText());
			}
		}
		if(clicked.getText().equals("Clear")){
			bCP.getInput1().setText("");
			bCP.getInput2().setText("");
			bCP.setOutputText("");
		}
	}

	public void add(String val1, String val2){
		bCP.setOutputText(val1+" + "+val2+" = "+(Integer.parseInt(val1)+Integer.parseInt(val2)));
	}
	
	public void subtract(String val1, String val2){
		bCP.setOutputText(val1+" - "+val2+" = "+(Integer.parseInt(val1)-Integer.parseInt(val2)));
	}
	public void multiply(String val1, String val2){
		bCP.setOutputText(val1+" * "+val2+" = "+(Integer.parseInt(val1)*Integer.parseInt(val2)));
	}
	public void divide(String val1, String val2){
		bCP.setOutputText(val1+" / "+val2+" = "+(Integer.parseInt(val1)/Integer.parseInt(val2)));
	}
	
	//these were from when I thought this project was adding binary numbers
	
	public int binaryToDecimal(String s){
		return Integer.parseInt(s,2);
	}
	public String decimalToBinary(int num){
		return Integer.toBinaryString(num);
	}
	
	///////////////////////
	//GETTERS AND SETTERS//
	///////////////////////
	
	
	public BinaryCalculatorPanel getbCP() {
		return bCP;
	}

	public void setbCP(BinaryCalculatorPanel bCP) {
		this.bCP = bCP;
	}
	
}
