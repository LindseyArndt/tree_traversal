package SimpleGUI;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class LogarithmPanel extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton ln, log2, log10, sqrt, square, cbrt, cube, clear;
	private JRadioButton lnr, log2r, log10r, sqrtr, squarer, cbrtr, cuber, clearr;
	private JTextField text;
	private JLabel output;
	
	public LogarithmPanel(){
		//Create everything in groups and add it to the JPanel
		text = new JTextField(5);
		output = new JLabel("");
		clear = new JButton("Clear: ");
		clear.addActionListener(new ButtonListener());
		add(text);
		
		ln = new JButton("Natural Log: ");
		ln.addActionListener(new ButtonListener());
		add(ln);
		
		log2 = new JButton("Log Base 2: ");
		log2.addActionListener(new ButtonListener());
		add(log2);
		
		log10 = new JButton("Log Base 10: ");
		log10.addActionListener(new ButtonListener());
		add(log10);
		
		sqrt = new JButton("Square Root: ");
		sqrt.addActionListener(new ButtonListener());
		add(sqrt);
		
		square = new JButton("Square: ");
		square.addActionListener(new ButtonListener());
		add(square);
		
		cbrt = new JButton("Cube Root: ");
		cbrt.addActionListener(new ButtonListener());
		add(cbrt);
		
		cube = new JButton("Cube: ");
		cube.addActionListener(new ButtonListener());
		add(cube);
		
		add(output);
		add(clear);

		setPreferredSize(new Dimension(600, 200));
		setBackground(Color.LIGHT_GRAY);
	}
	
	private class ButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			double inValue = 0, outValue = 0;
			JButton clicked = (JButton) e.getSource();
			String labelOnButton = clicked.getText();
			if(labelOnButton.equals("Clear: ")){
				text.setText("");
				output.setText("");
			}
			else if(labelOnButton.equals("Natural Log: ")){
				inValue = Integer.parseInt(text.getText());
				outValue = Math.log(inValue);
				output.setText("The Natural Log of "+inValue+" is "+outValue);
			}
			else if(labelOnButton.equals("Log Base 2: ")){
				inValue = Integer.parseInt(text.getText());
				outValue = (Math.log(inValue))/(Math.log(2));
				output.setText("The Log Base 2 of "+inValue+" is "+outValue);
			}
			else if(labelOnButton.equals("Log Base 10: ")){
				inValue = Integer.parseInt(text.getText());
				outValue = Math.log10(inValue);
				output.setText("The Log Base 10 of "+inValue+" is "+outValue);
			}
			else if(labelOnButton.equals("Square Root: ")){
				inValue = Integer.parseInt(text.getText());
				outValue = Math.sqrt(inValue);
				output.setText("The square root of "+inValue+" is "+outValue);
			}
			else if(labelOnButton.equals("Square: ")){
				inValue = Integer.parseInt(text.getText());
				outValue = Math.pow(inValue, 2);
				output.setText("The square of "+inValue+" is "+outValue);
			}
			else if(labelOnButton.equals("Cube Root: ")){
				inValue = Integer.parseInt(text.getText());
				outValue = Math.cbrt(inValue);
				output.setText("The cube root of "+inValue+" is "+outValue);
			}
			else if(labelOnButton.equals("Cube: ")){
				inValue = Integer.parseInt(text.getText());
				outValue = Math.pow(inValue, 3);
				output.setText("The cube of "+inValue+" is "+outValue);
			}
		}
	}
}