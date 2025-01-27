package methodsAndScanner;

import java.util.Scanner;

public class MinMaxChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int max = 0;
		int min = 0;
		int count = 0;
		
		while(true) {
			System.out.println("Enter a number, or any character to exit:");
			String nextEntry = sc.nextLine();
			try {
			int number = Integer.parseInt(nextEntry);
				if(count == 0 || number < min) {
					min = number;
				}
				if(count  == 0 || number > max) {
					max = number;
				}
				count ++;
			}
			catch(NumberFormatException e) {
				break;
			}
		} 
		if(count > 0) {
			System.out.println("min = " + min + ", max = " + max);
		}
		else {
			System.out.println("No valid data entered");
		}
	}

}
