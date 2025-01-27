package methodsAndScanner;
import java.util.Scanner;

public class UserInputChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum = 0;
	
		for(int i = 1; i <= 5; i++) {
			System.out.println("Enter a number #" + i);
			String num = sc.nextLine();
			try {
				int number = Integer.parseInt(num);
				sum += number;
			}
			catch (NumberFormatException e) {
				System.out.println("Invalid number");
			}
		}
		System.out.println("The sum of the 5 numbers = " + sum);

	}

}
