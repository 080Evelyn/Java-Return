package controlStatements;

public class SumNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			System.out.println(sum += i);
		}
		System.out.println("The present " + sum);
	}

}
