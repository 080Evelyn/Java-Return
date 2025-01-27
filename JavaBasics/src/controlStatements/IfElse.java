package controlStatements;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int value = 5;
		
		if(value == 2) {
			System.out.println("The value is 2");
		}
		else {
			if(value < 2) {
				System.out.println("The value is less than 2");
			}
			if(value > 5) {
				System.out.println("This value is higher than the set value");
			}
			else {
				System.out.println("The value is more than 2");
			}
		}

	}

}
