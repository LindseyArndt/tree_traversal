package binaryCalculator;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryCalculatorPanel extends JPanel {
	BinaryCalculatorListener bCL;
	JButton addButton, subtractButton, multiplyButton, divideButton, clear;
	JTextField input1, input2;
	JLabel input1L, input2L, output, help;
	public BinaryCalculatorPanel(BinaryCalculatorListener bCL){
		construct(bCL);
		this.setPreferredSize(new Dimension(400,200));
	}
	
	public void construct(BinaryCalculatorListener bCL){
		this.bCL = bCL;
		
		help = new JLabel("Enter any binary number for your inputs");
		add(help);
		
		addButton = new JButton("Add");
		addButton.addActionListener(bCL);
		add(addButton);
		
		subtractButton = new JButton("Subtract");
		subtractButton.addActionListener(bCL);
		add(subtractButton);
		
		multiplyButton = new JButton("Multiply");
		multiplyButton.addActionListener(bCL);
		add(multiplyButton);
		
		divideButton = new JButton("Divide");
		divideButton.addActionListener(bCL);
		add(divideButton);
		
		input1L = new JLabel("Input 1: ");
		input1 = new JTextField(10);
		add(input1L);
		add(input1);
		
		input2L = new JLabel("Input 2: ");
		input2 = new JTextField(10);
		add(input2L);
		add(input2);
		
		output = new JLabel();
		add(output);
		
		clear = new JButton("Clear");
		clear.addActionListener(bCL);
		add(clear);
	}
	
	public void setOutputText(String s){
		output.setText(s);
	}
	
	
	///////////////////////
	//GETTERS AND SETTERS//
	///////////////////////
	
	
	public BinaryCalculatorListener getbCL() {
		return bCL;
	}
	public void setbCL(BinaryCalculatorListener bCL) {
		this.bCL = bCL;
	}
	public JButton getAddButton() {
		return addButton;
	}
	public void setAddButton(JButton add) {
		this.addButton = add;
	}
	public JTextField getInput1() {
		return input1;
	}
	public void setInput1(JTextField input1) {
		this.input1 = input1;
	}
	public JTextField getInput2() {
		return input2;
	}
	public void setInput2(JTextField input2) {
		this.input2 = input2;
	}
	public JLabel getOutput() {
		return output;
	}
	public void setOutput(JLabel output) {
		this.output = output;
	}
	
	//serialVersionUID
	private static final long serialVersionUID = 1L;
}
