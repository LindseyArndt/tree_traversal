import java.util.ArrayList;

public class node {

	// variables
	ArrayList<String[]> str = new ArrayList<String[]>();
	String l2;
	String value;
	String l1;

	public node(String lab) {

		l1 = lab;
		str = new ArrayList<String[]>();
	}
	
	public void insert(String l2i, String valuei) {
		// insert in the label str
		l2 = l2i;
		value = valuei;
		String[] arr = {l2, value};
		str.add(arr);
	}
	
	
	/*
	 * This method will return true if the letter matches a letter that is already a node 
	 */
	public boolean find(String letter) {
		if(this.l1.equals(letter)) {
			//System.out.println("found "+ letter);
			return true;
		}
		else {
			return false;
		}
	}

	public void getAll() {
		if(l2 == null || value == null) {
			
		}
		else {
			System.out.println(l1 + " " + l2 + " " + value);
		}
		
	}
	
	public boolean getIndex(String letter) {
		if(this.l1.equals(letter)) {
			System.out.println("found "+ letter);
			return true;
		}
		else {
			return false;
		}
	}
	
	

}
