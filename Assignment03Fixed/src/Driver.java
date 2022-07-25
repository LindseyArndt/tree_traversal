import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) throws FileNotFoundException {
		// read the file and import the values
		grid graph = new grid();
		Scanner infile = new Scanner(new FileReader("graph.dat"));
		ArrayList<String[]> sorted = new ArrayList<String[]>();
		System.out.println("Kruskal’s algorithm------------------------------------------------");
		while (infile.hasNext()) { // go through each line in the textfile
			
			String line = infile.nextLine();
			String[] nodes = line.split(" "); //This is the set of a node going to be ebtered
			//System.out.println(nodes[2]);
			if (sorted.isEmpty()) {
				sorted.add(nodes);
			} else {
				// kruskals method for sorting the values
				boolean entered = false;
				for (int x = 0; x < sorted.size(); x++) {
					
					String[] s = sorted.get(x);
					if ((Integer.parseInt(nodes[2]) <= Integer.parseInt(s[2])) && !entered) {
						sorted.add(x, nodes);
						//System.out.println("added, the size is now "+sorted.size());
						entered = true;
					}	
				}
				if (!entered) {
					sorted.add(nodes);	
				}
				
			}

		}
		//System.out.println("inserting------------------------------------------------");
		for (int x = 0; x < sorted.size(); x++) {
			String[] n = sorted.get(x);
			String l1 = n[0];
			String l2 = n[1];
			String weight = n[2];
			System.out.println(l1 + " " +l2 +" " + weight);
			graph.insert(l1, l2, weight);// insert the letter into the label with the same weight
			
		}

		System.out.println("This is the output for Minimum Spanning Tree-------------------------------");
		graph.getAll();
	}

}