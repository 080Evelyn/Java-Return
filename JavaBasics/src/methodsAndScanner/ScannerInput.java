package methodsAndScanner;
import java.util.*;

public class ScannerInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello! What is your name?");
		String name = sc.nextLine();
		
		System.out.println("How are you " + name);
		String feel = sc.nextLine();
		System.out.println("Are you sure your "+ feel.toLowerCase());
		sc.nextLine();
		
		System.out.println("How old are you?");
		
		String age = sc.nextLine();
		int ageNum = Integer.parseInt(age);
		
		int birthYear = 2024 - ageNum; 
		
		
		System.out.println("Your name is " + name + " your were born in the year " + birthYear);
		
		

	}

}
