import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import javax.swing.JDialog;

public class Driver {

	
//starts the GUI process but idk why there are arrows to all 3 of them 
	public static void main(String[] args) throws FileNotFoundException {
		
		try {
			GUI dialog = new GUI();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
