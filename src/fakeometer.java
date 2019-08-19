import java.util.*;

public class fakeometer {
	public static void main(String[] args) {
		final String VERSION = "1.2.3";
		
		Scanner scanner = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("\nInput object to calculate the fakeness of:");
		String object = scanner.nextLine();
		
		System.out.println("\nFakeometer v" + VERSION +"\n\nCALCULATING...");
		
		int fakeness = rand.nextInt(100);
		
		System.out.println(object + " [is/are/was/were] " + fakeness + "% fake.");
	}
}