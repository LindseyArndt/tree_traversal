import java.util.ArrayList;

public class grid {

	ArrayList<node> labels;

	public grid() {
		labels = new ArrayList<node>();
	}

	public void insert(String l1, String l2, String weight) {

		if (labels.isEmpty()) {
			node newnode = new node(l1);
			labels.add(newnode);
			//System.out.println("The fist label is null so we are creating a new one");
			labels.get(labels.indexOf(newnode)).insert(l2, weight);
			//System.out.println("The letter " + l2 + " is getting inserted into the label " + l1 + " with the weight " + weight);
			// creating a new node for the second letter also
			node newnode2 = new node(l2);
			labels.add(newnode2);
			//System.out.println("The letter " + l1 + " is getting inserted into the label " + l2 + " with the weight " + weight);
			//labels.get(labels.indexOf(newnode2)).insert(l1, weight);
		}

		// if the first letter is not a node yet
		else if (!find(l1)) {
			node newnode = new node(l1);
			labels.add(newnode);
			//System.out.println("we are creating a new node for labels");
			{
				labels.get(labels.indexOf(newnode)).insert(l2, weight);
				//System.out.println("The letter " + l2 + " is getting inserted into the label " + l1 + " with the weight " + weight);
			}

		}
		// if the second letter is not a node yet
		else if (!find(l2)) {
			node newnode = new node(l2);
			labels.add(newnode);
			//System.out.println("we are creating a new node for labels");
			int index = labels.indexOf(newnode);
			labels.get(index).insert(l1, weight);
			//System.out.println("The letter " + l1 + " is getting inserted into the label " + l2 + " with the weight " + weight);

		} else {
			// get the index of the node and insert the values into it
			// get the value at for

			//System.out.println("you do not add anything because the weight is larger");
			/*
			 * int[] indexOf1 = getIndex(l1); int[] indexOf2 = getIndex(l2); for (int x = 0;
			 * x < labels.size(); x++) { for (int i = 0; i < labels.size(); i++) { if
			 * (indexOf1[x] == indexOf2[x]) { labels.get(x).insert(l2, weight); } } }
			 */
		}
		return;
	}

	/*
	 * This method will determine if the letter is a node that already exists
	 */
	public boolean find(String letter) {
		if (labels == null) {
			System.out.println("Tree is empty");
		} else {
			for (int x = 0; x < labels.size(); x++) {
				//System.out.println("is finding the letter to find");
				boolean found = (labels.get(x)).find(letter);
				if (found) {
					return true;
				}
			}
		}
		return false;
	}

	// method to get the pre order traverse left to right children
	public void getAll() {

		if (labels == null) {
			System.out.println("Tree is empty");
		} else {
			for (int x = 0; x < labels.size(); x++) {
				//System.out.println("is getting the label and pritning weights");
				labels.get(x).getAll();
			}
		}

	}


}
