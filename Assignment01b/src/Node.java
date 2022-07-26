public class Node extends RM {

	private String data;
	private Node prev;
	private Node next;

	private String vid;
	private String name;
	private String company;
	private String actor;
	private String year;
	
	
	
	//construct a node which can be added to the tree
	public Node (String vid) {
		setData(vid);
		setPrev(null);
		next = null;
	}


	
	/*
	//method to insert it into the tree
	public void insert(String vid) {
		
		//create the node
		Node newnode = new Node(vid);
				
		if(head == null) {
			//both head and tail point to the new node
			head = tail = newnode;
			head.prev = null;
		}
		else {
			tail.setNext(newnode);
			newnode.prev = tail;
			tail = newnode; 
			tail.setNext(null);
		}
		
	}
	*/
	

	
	
	
	/*
	//when the root is not null
	public void insert(String vid) {
		if(vid.compareTo(data) < 0) {
			//insert in the left
			if(prev == null) {
				//create a node with i and make it in the left
				prev = new Node(vid);
			}
			else {
				//if there is already a node 
				prev.insert(vid);
			}
		}
		else {
			//insert in the right 
			if(getNext() == null) {
				//create a node with i and make it in the right
				setNext(new Node(vid));
			}
			else {
				//if there is already a right node
				getNext().insert(vid);
			}
		}
		
	}
	
	*/
	
//when the root is not null we want to get the values in the tree and print LNR
	/*
	public void in_order_traverse() {
		if (getPrev() != null) {
			 //we need to check the left again
			getPrev().in_order_traverse();
		}
			System.out.println( ", "+getData());
		if(getNext() != null) {
			getNext().in_order_traverse();
		}
		
	}
	*/

	
	//find the number in the binary tree
	public String find(String i) {
		if(getData().contains(i)) {
			return "Found!!";
			
		}
		else if(i.compareTo(getData()) < 0) {
			if (getPrev() != null) {
				return getPrev().find(i); //try to find it again
			}
			else {
				//if the left is null
				return "Not Found";
			}
		}
		else {
			if(getNext() != null) {
				return getNext().find(i); //try to find it 
			}
			else {
				//if the right is null 
				return "Not Found";
			}
		}
	
	}


	public Node getNext() {
		return next;
	}


	public void setNext(Node next) {
		this.next = next;
	}



	public Node getPrev() {
		return prev;
	}



	public void setPrev(Node prev) {
		this.prev = prev;
	}



	public String getData() {
		return data;
	}



	public void setData(String data) {
		this.data = data;
	}

	
	

	
}