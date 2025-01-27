package dev.lpa;

public class VarArgs {

	public static void main(String... args) {
		// TODO Auto-generated method stub

		System.out.println("Hello World again");
		
		String[] splitStrings = "Hello World again".split(" ");
		printText(splitStrings);
		
		System.out.println("-".repeat(20));
		printText("Hello!");
		
		System.out.println("*".repeat(20));
		printText("Hello!", "World","again");
		
		String[] sArray = {"first", "second", "third", "fourth", "fifth"};
		System.out.println(String.join(",", sArray));		
		
	}

	private static void printText(String... textList) {
		for(String t : textList) {
			System.out.println(t);
		}
	}
}
