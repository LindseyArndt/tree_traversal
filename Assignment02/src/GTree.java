import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.Scanner;

public class GTree {

	// set the variables for the class
	Node root;

	public GTree() {
		root = null;
	}

	/*
	 * This method should take the data and insert it into the correct child
	 * position
	 */
	public void insert(int i, int parent) {
		// TODO Auto-generated method stub

		if (root == null) {
			Node newnode = new Node(i);
			root = newnode;
			System.out.println("The root is null so we are creating a new one");
		} else {
			root.insert(i, parent);
		}
	}

	// Method to return the height of the tree.
	public int getHeight() {
		int height = 0;
		return height;
	}

	// method to get the pre order traverse left to right children
	public void preOrderTraverse() {
		// TODO Auto-generated method stub
		if (root == null) {
			System.out.println("Tree is empty");
		} else {
			root.preOrderTraverse();
		}
	}

	// do the post order traversal which will do the right to left order of children
	public void postOrderTraverse() {
		// TODO Auto-generated method stub
		if (root == null) {
			System.out.println("Tree is empty");
		} else {
			root.postOrderTraverse();
		}
	}

	public void levelOrderTraversal() {
		// TODO Auto-generated method stub
		if (root == null) {
			System.out.println("Tree is empty");
		} else {

			int height = root.height(root);
			System.out.println("The height of the tree is " + height);
			for(int x = 1; x <= height; x++) {
				root.levelOrderTraversal(root, height,x, "");
			}
			
		}
	}

}
