
public class Node {

	int data;
	Node childLeft, childRight, childMid;

	public Node(int i) {
		// TODO Auto-generated constructor stub
		data = i;
		childLeft = null;
		childRight = null;
		childMid = null;
		;

	}

	public void insert(int i, int parent) {
		// System.out.println("The data is "+data);
		if (data == parent) {
			// insert the child with the parent
			if (childLeft == null) {
				// create a node with i and make it the left
				childLeft = new Node(i);

			} else if (childMid == null) {
				childMid = new Node(i);

			} else if (childRight == null) {
				childRight = new Node(i);
			}
		}
		// end of the insert and this is what we do when we still cannot find the node
		// to insert children

		if (childLeft != null) {
			childLeft.insert(i, parent);
		}
		if (childMid != null) {
			childMid.insert(i, parent);
		}
		if (childRight != null) {
			childRight.insert(i, parent);
		} else {
			System.out.println("not found");
		}

	}

	// print children left to right
	public void preOrderTraverse() {
		// TODO Auto-generated method stub

		System.out.println(", " + data);

		if (childLeft != null) {

			childLeft.preOrderTraverse();
		}

		if (childMid != null) {

			childMid.preOrderTraverse();
		}

		if (childRight != null) {
			childRight.preOrderTraverse();

		}

	}

	// print children left to right
	public void postOrderTraverse() {

		if (childRight != null) {
			childRight.postOrderTraverse();

		}

		if (childMid != null) {

			childMid.postOrderTraverse();
		}

		if (childLeft != null) {

			childLeft.postOrderTraverse();
		}

		System.out.println(", " + data);

	}

	/*
	 * public void levelOrderTraversal(int height, int level1, int level2) {
	 * 
	 * if (level1 == 2) { System.out.print(data + " "); } if (height > 0) {
	 * System.out.print(data + " "); if (childRight != null) { //
	 * System.out.print(data + " "); childRight.levelOrderTraversal(height -1,
	 * level1, level2); } else if (level1 == 0) { level1 = height; } if (childMid !=
	 * null) { // System.out.print(data + " "); childMid.levelOrderTraversal(height
	 * -1, level1, level2); } else if (level2 == 0) { level1 = height; } if
	 * (childLeft != null) { // System.out.print(data + " ");
	 * childLeft.levelOrderTraversal(height -1, level1, level2);
	 * System.out.print(data + " "); }
	 * 
	 * }
	 * 
	 * }
	 */

	public void levelOrderTraversal(Node root, int height, int x, String keep) {
		
		
		if(height == x) {
			keep += root.data + " ";
			System.out.print(keep);
		}
	
		
		if (height > 1) {
		
			if (root.childRight != null) {
				levelOrderTraversal(root.childRight, height - 1, x, keep);
				
			}
			

			if (root.childMid != null) {
				levelOrderTraversal(root.childMid, height - 1, x, keep);
				
			}
		
	
			if (root.childLeft != null) {
				levelOrderTraversal(root.childLeft, height - 1,x, keep);
			
			}
			
			
		}
	
	}

	public int height(Node root) {
		if (root == null)
			return 0;
		else {
			/* compute height of each subtree */
			int lheight = height(root.childLeft);
			int mheight = height(root.childMid);
			int rheight = height(root.childRight); // int rheight = height(root.childRight);

			/* use the larger one */
			if (lheight >= rheight && lheight >= mheight)
				return (lheight + 1);
			else if (mheight >= lheight && mheight >= rheight) {
				return (mheight + 1);
			}
			return (rheight + 1);
		}
	}
}
