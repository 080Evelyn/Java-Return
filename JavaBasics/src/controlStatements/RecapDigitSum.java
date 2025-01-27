package controlStatements;

public class RecapDigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Here is the sum of the digits " + sumDigits(5230));
		
	}
	public static int sumDigits(int number) {
		
		if(number > 0) {
			int sum = 0;
			
			while(number > 9) {
				sum += number % 10;
				number /= 10;
			}
			sum += number;
			return sum;
		}
		return -1;
	}

}
