package SimpleGUI;
import javax.swing.JFrame;

public class Logarithm {
	public static void main(String[] args)
	   {
	      JFrame frame = new JFrame("Logarithm");
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	      frame.getContentPane().add(new LogarithmPanel());

	      frame.pack();
	      frame.setVisible(true);
	   }
}
