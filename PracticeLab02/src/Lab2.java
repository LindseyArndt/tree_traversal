import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Lab2 {
	//finding the first smallest takes n-1 steps
	//finding the second smallest takes n-1

	//practice using debug for logical error
	public static void main(String[] args) throws FileNotFoundException {
		
		Integer [] DATA1 = new Integer [25];
		System.out.println("Amount of integers: "+DATA1.length);
		
		for(int x = 0; x < DATA1.length; x++) {
			DATA1[x] = (int)(Math.random()*200)+1;
		}
		
		//put numbers into a text file
		PrintWriter outfile = new PrintWriter(new File("output.dat"));
		
		for(int x = 0; x < DATA1.length; x++) {
			if(x % 5 == 0 && x != 0) outfile.println(""); //print of different lines
			outfile.print(DATA1[x]+" ");
		}
		System.out.println();
		//save the file 
		outfile.flush();
		
		//close the file printWriter
		outfile.close();
		
		DATA1 = new Integer[25]; //fresh new array
		
		try {
			// create a file reader stream
	        Scanner infile = new Scanner(new File("output.dat"));
	        for(int x = 0; x < 25; x++) {
				DATA1[x] = infile.nextInt(); //get the file. This is also converting it
			}
	            
	    } catch (IOException e) {
	            //TODO use System.out.println to print error message 
	            //         in case of exception happen
	        	System.out.print("Error");
	        } 
		
		Integer [] DATA2 = new Integer [25];
		
		int largest = 0;
		//find the largest number 
		for(int x = 0; x < DATA1.length; x++) {
			if(DATA1[x] > largest)
				largest = DATA1[x];
		}
		
		//Selection sort
		//greater than the first smallest and smaller than the rest 
		int small = DATA1[0];
		int smallest = -1;
		for(int i = 0; i < DATA1.length; i ++) {
			//check for the smallest number to put in spot i 
			small = largest;
			for (int j = 0; j < DATA1.length; j++) { //Go through each number in the array to look for the smallest number
				
				if(DATA1[j] < small && DATA1[j] > smallest) {
					
					//switch the variables
					small = DATA1[j];
				}
			}
			DATA2[i] = small;
			smallest = small;
		}
		
		System.out.print("The integers in order: ");
		//print the array to check it
		for(int x = 0; x < DATA2.length; x++) {
			System.out.print(DATA2[x]+" ");
		}
		
		//print the sorted array into a new file/
		//put numbers into a text file
		PrintWriter sortedOutfile = new PrintWriter(new File("sortedOutput.dat"));
				
		for(int x = 0; x < DATA2.length; x++) {
			if(x % 5 == 0 && x != 0) sortedOutfile.println(""); //print of different lines
			sortedOutfile.print(DATA2[x]+" ");
		}
		System.out.println();
		//save the file 
		sortedOutfile.flush();
				
		//close the file printWriter
		sortedOutfile.close();

	}

}
