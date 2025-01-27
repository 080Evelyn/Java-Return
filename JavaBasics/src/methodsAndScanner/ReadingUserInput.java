package methodsAndScanner;

public class ReadingUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int currentYear = 2024;
		
		System.out.println(getInputFromConsole(currentYear));
		System.out.println(getInputFromScanner(currentYear));

	}
	
	public static String getInputFromConsole(int currentYear) {
		String name =System.console().readLine("Hi! What is your name? ");
		System.out.println("Hi " + name + ", thanks for taking the course!");
		return "";
	}
	
	public static String getInputFromScanner(int currentYear) {
		return "";	}

}
