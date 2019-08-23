
public class NoGUI {
	public static void main() {
		nogui();
	}
	
	public static void nogui() {
		System.out.println("\n" + Fakeometer.inputMessage);
		String object = Fakeometer.scanner.nextLine();
		
		Fakeometer.scanner.close();
		
		System.out.println("\nFakeometer v" + Fakeometer.VERSION +"\n\nCALCULATING...");
		System.out.println(object + " is " + Fakeometer.calc() + "% fake.");
	}
}
