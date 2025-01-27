
public class DigitSumChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("The sum of the digits in number 1234 is " + sumDigits(1234));
		System.out.println("The sum of the digits in number 1234 is " + sumDigits(-125));
		System.out.println("The sum of the digits in number 1234 is " + sumDigits(4));
		System.out.println("The sum of the digits in number 1234 is " + sumDigits(32123));


	}
	public static int sumDigits(int number)	{
		
		if(number >= 0) {
			int sum = 0;
			
			while(number > 9) {
				sum += (number % 10);
				number = number / 10;
				
			}
			sum += number;
			
			return sum;
		}
		return -1;
	}

}
