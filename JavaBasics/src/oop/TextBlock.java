package oop;

public class TextBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String bulletIt = "Print a Bulleted List:\n" + 
		"\t \u2022 First Point \n" +
				"\t\u2022 Sub Point";
		
		System.out.println(bulletIt);

		
		String textBlock = """
				Print a BulletIt List
					\u2022 First Point
					 \u2022 Sub Point
				""";
		
		System.out.println(textBlock);
		
		int age = 35;
		System.out.printf("Your age is %d", age);
		
		int yearOfBirth = 2023 - age;
		System.out.printf(" \nAge = %d, Birth year = %d", age, yearOfBirth);
		
		
		for(int i = 1; i <= 100000; i *= 10) {
			System.out.printf("Printing %6d \n", i);
			
			String formattedString = String.format("Your age is %d", age);
			System.out.println(formattedString);
			
			formattedString = "Your age is %d".formatted(age);
			System.out.println(formattedString);
		}
	}

}
