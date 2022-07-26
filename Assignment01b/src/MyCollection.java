import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class MyCollection {	
	
	//variables
	private String vid = "";
	private String name = "";
	private String company = "";
	private String actor = "";
	private String year = "";
	
	public void getFIle() throws FileNotFoundException {
		//int[] numArray = new int[20];
		Scanner infile = new Scanner(new FileReader("Videos.dat"));
		// loop to read the line
		while (infile.hasNext()) {
			String line = infile.nextLine();
			//video.add(line);
			String [] video = line.split(" ");
			vid = video[0];
			name = video[1];
			company = video[2];
			actor = video[3];
			year = video[4];
			String create = vid + " " +name+ " " + company+" " + actor+" " + year;
			RM tree = new RM();
			tree.insert(create);
		}
	}
	

}
