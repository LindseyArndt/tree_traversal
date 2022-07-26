import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

public class RM {

	// variables
	// ArrayList<String> video = new ArrayList<>();
//this class will have the video ID and it will talk to the Videos.dat file to get the information

	private int length;
	private Node head, tail = null;

	private String vid;
	private String name;
	private String company;
	private String actor;
	private String year;
	private ArrayList<ArrayList <String>> creation = new ArrayList<ArrayList <String>>(); //multilist

	public void getFile() throws FileNotFoundException {
		// int[] numArray = new int[20];
		Scanner infile = new Scanner(new FileReader("Videos.dat"));
		// loop to read the line
		while (infile.hasNext()) {
			String line = infile.nextLine();
			// video.add(line);
			String[] video = line.split(" ");
			ArrayList<String> c = new ArrayList<String>();
			
			vid = video[0];
			name = video[1];
			company = video[2];
			actor = video[3];
			year = video[4];
			String create = vid + " " + name + " " + company + " " + actor + " " + year + "\n";
			c.add(vid);
			c.add(name);
			c.add(company);
			c.add(actor);
			c.add(year);
			insert(create);
			creation.add(c);
		}
	}

	// addNode() will add a node to the list
	public void insert(String data) {
		// Create a new node
		Node newNode = new Node(data);

		// If list is empty
		if (head == null) {
			// Both head and tail will point to newNode
			head = tail = newNode;
			// head's previous will point to null
			head.setPrev(null);
			// tail's next will point to null, as it is the last node of the list
			tail.setNext(null);
		} else {
			// newNode will be added after tail such that tail's next will point to newNode
			tail.setNext(newNode);
			// newNode's previous will point to tail
			newNode.setPrev(tail);
			// newNode will become new tail
			tail = newNode;
			// As it is last node, tail's next will point to null
			tail.setNext(null);
		}
	}

	// display() will print out the nodes of the list
	public String printVideo() {
		String video = " ";
		// Node current will point to head
		Node current = head;
		if (head == null) {
			System.out.println("List is empty");
			return "List is empty";
		}
		System.out.println("Nodes of doubly linked list: ");
		while (current != null) {
			// Prints each node by incrementing the pointer.
			video += current.getData() + " ";
			System.out.print(current.getData() + " ");
			current = current.getNext();
		}
		return video;
	}

	
	
	public String searchTitle(String title) {
		String list = "";
        
        //Node current will point to head  
        Node current = head; 
        
		if(head == null) {  
			System.out.println("List is empty");  
			return "list is emppty"; 
		}
		 while(current != null) {  
	            //Compare value to be searched with each node in the list  
			 String cur[] = (current.getData()).split("\\s");
	            if((cur[1].toLowerCase()).contains(title.toLowerCase())) { 
	                list += current.getData();
	            }  
	            current = current.getNext();  
	        }
		 return list;
	        
	        
	}
         
         
	public String searchVid(String vid) {
		String list = "";
        
        //Node current will point to head  
        Node current = head; 
        
		if(head == null) {  
			System.out.println("List is empty");  
			return "list is emppty"; 
		}
		 while(current != null) {  
	            //Compare value to be searched with each node in the list  
			 String cur[] = (current.getData()).split("\\s");
	            if((cur[0].toLowerCase()).contains(vid.toLowerCase())) { 
	                list += current.getData();
	            }  
	            current = current.getNext();  
	        }
		 return list;
	}

	public String searchComp(String comp) {
		String list = "";
        
        //Node current will point to head  
        Node current = head; 
        
		if(head == null) {  
			System.out.println("List is empty");  
			return "list is emppty"; 
		}
		 while(current != null) {  
	            //Compare value to be searched with each node in the list  
			 String cur[] = (current.getData()).split("\\s");
	            if((cur[2].toLowerCase()).contains(comp.toLowerCase())) { 
	                list += current.getData();
	            }  
	            current = current.getNext();  
	        }
		 return list;
	}

	public void sortTitle() {
		System.out.println(head);
		Node current = null, index = null;
		String temp;
		// Check whether list is empty
		if (head == null) {
			return;
		} else {
			// Current will point to head
			for (current = head; current.getNext() != null; current = current.getNext()) {
				// Index will point to node next to current
				for (index = current.getNext(); index != null; index = index.getNext()) {
					// If current's data is greater than index's data, swap the data of current and
					// index
					String cur[] = (current.getData()).split("\\s");
					String in[] = (index.getData()).split("\\s");
					if (cur[1].compareTo(in[1]) > 0) {
						temp = current.getData();
						current.setData(index.getData());
						index.setData(temp);
					}
				}
			}
		}
	}
	
	

	public void sortVid() {
		System.out.println(head);
		Node current = null, index = null;
		String temp;
		// Check whether list is empty
		if (head == null) {
			return;
		} else {
			// Current will point to head
			for (current = head; current.getNext() != null; current = current.getNext()) {
				// Index will point to node next to current
				for (index = current.getNext(); index != null; index = index.getNext()) {
					// If current's data is greater than index's data, swap the data of current and
					// index
					String cur[] = (current.getData()).split("\\s");
					String in[] = (index.getData()).split("\\s");
					if (cur[0].compareTo(in[0]) > 0) {
						temp = current.getData();
						current.setData(index.getData());
						index.setData(temp);
					}
				}
			}
		}
	}

	public void sortCompany() {
		System.out.println(head);
		Node current = null, index = null;
		String temp;
		// Check whether list is empty
		if (head == null) {
			return;
		} else {
			// Current will point to head
			for (current = head; current.getNext() != null; current = current.getNext()) {
				// Index will point to node next to current
				for (index = current.getNext(); index != null; index = index.getNext()) {
					// If current's data is greater than index's data, swap the data of current and
					// index
					String cur[] = (current.getData()).split("\\s");
					String in[] = (index.getData()).split("\\s");
					if (cur[2].compareTo(in[2]) > 0) {
						temp = current.getData();
						current.setData(index.getData());
						index.setData(temp);
					}
				}
			}
		}
	}
	
	public String sortYear(String act) {
		String yearsList = searchActor(act);
		String list = "";
		String year[]  = yearsList.split("\n");
		for(String line: year) {
			if(line.contains(act)) {
				list += line;
			}
		}
		
		return list;
		
	}

	public String searchActor(String actor) {
		String list = "";
        
        //Node current will point to head  
        Node current = head; 
        
		if(head == null) {  
			System.out.println("List is empty");  
			return "list is emppty"; 
		}
		 while(current != null) {  
	            //Compare value to be searched with each node in the list  
			 String cur[] = (current.getData()).split("\\s");
	            if((cur[3].toLowerCase()).contains(actor.toLowerCase())) { 
	                list += current.getData();
	            }  
	            current = current.getNext();  
	        }
		 return list;
	}
}
