import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) throws FileNotFoundException {

		GTree mytree = new GTree();

		Scanner infile = new Scanner(new FileReader("tree.dat"));

		String amount = infile.nextLine(); // This is the amount of children a parent can have
		System.out.println("Each node can only have " + amount + " children in the tree");
		String root = infile.nextLine(); // this is the root of the tree
		System.out.println("The root is " + root);
		int r = Integer.parseInt(root);
		mytree.insert(r, r); // add the root to the tree

		while (infile.hasNext()) { //go through each line in the textfile

			String line = infile.nextLine();
			String[] nodes = line.split(" ");
			int parent = Integer.parseInt(nodes[0]);

			System.out.print("Starting with " + parent + " we are adding ");
			
			for (int x = 1; x < nodes.length; x++) {
				int child = Integer.parseInt(nodes[x]);
				System.out.println(child);
				mytree.insert(child, parent);
				//mytree.insert(child, parent); //insert this child into the tree
			}

		}

		System.out.println("Pre-order-Traversal----------------------------");
		mytree.preOrderTraverse();
		
		System.out.println("Post-order-Traversal----------------------------");
		mytree.postOrderTraverse();
		
		System.out.println("Level-order-Traversal----------------------------");
		mytree.levelOrderTraversal();
		

	}

}
