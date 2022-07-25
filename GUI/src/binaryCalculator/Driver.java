package binaryCalculator;

import javax.swing.JFrame;

public class Driver {
	public static void main(String[] args)
	   {
	      JFrame frame = new JFrame("Binary Calculator");
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      
	      BinaryCalculatorListener bCListener = new BinaryCalculatorListener();
	      BinaryCalculatorPanel bCPanel = new BinaryCalculatorPanel(bCListener);
	      bCListener.setbCP(bCPanel);
	      
	      frame.getContentPane().add(bCPanel);

	      frame.pack();
	      frame.setVisible(true);
	   }
}
