package demo;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
public class TrywithParameter {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("C:\Users\divag\OneDrive\Documents\session1.txt");
		PrintWriter printwriter = new PrintWriter(file);
		printwriter.print("Hello,Today is Friday");
		printwriter.close();
	}
}



