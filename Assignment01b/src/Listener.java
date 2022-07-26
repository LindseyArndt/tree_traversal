import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Listener extends RM {
//this class talks to the GUI and decides what to do in RM then translates back to the GUI

/*
 * searchClicked has the 
 */
	public String searchClicked(int comboBox, String text, RM manage) {
		if(comboBox == 0) {
			return manage.searchTitle(text);
		}
		else if(comboBox == 1) {
			return manage.searchVid(text);
		}
		else if(comboBox == 2) {
			return manage.searchComp(text);
		}
		else if(comboBox == 3) {
			return manage.searchActor(text);
		}
		else if(comboBox == 4) {
			return manage.sortYear(text);
		}
		else {
			return ("You need to fill out the required fields");
		}
		
	}
	
	public String sTitle(RM manage) throws FileNotFoundException {
		manage.sortTitle();
		return manage.printVideo();
	}
	
	public String sVid(RM manage) {
		manage.sortVid();
		return manage.printVideo();
	}
	
	public String sComp(RM manage) {
		manage.sortVid();
		return manage.printVideo();
	}
}
