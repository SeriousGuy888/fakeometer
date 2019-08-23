import java.util.*;

import javax.swing.*;

public class Fakeometer extends JFrame {
	private static final long serialVersionUID = 1678250086550409328L;

	final static String VERSION = "1.5.0";
	
	static Scanner scanner = new Scanner(System.in);
	static Random rand = new Random();
	
	static String inputMessage = "Input something you want to get the fakeness of...";
	
	public static void main(String[] args) {
		GUI.main();
	}
	
	public static double calc() {
		double fakeness = ((double) rand.nextInt(1010) / 10) - 1;
		return fakeness;
	}
}