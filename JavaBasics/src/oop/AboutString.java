package oop;


public class AboutString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printIn("Hello World");
		printIn("");
		printIn(" ");
		
		String hello = "Hello World";
		System.out.printf("index of r = %d \n", hello.indexOf("r"));
		System.out.printf("index of World = %d \n", hello.indexOf("World"));
		
		System.out.printf("index of l = %d  \n", hello.indexOf("l"));
		System.out.printf("index of l = %d \n", hello.lastIndexOf("l") );
		
		String helloworldlower = hello.toLowerCase();
		if(hello.equals(helloworldlower)) {
			System.out.println("Value matches the same");
		}
		
		if(hello.equalsIgnoreCase(helloworldlower)) {
			System.out.println("Value matching ignore case");
		}
		
		if(hello.endsWith("World")) {
			System.out.println("String ends with world");
		}
		
		if(hello.startsWith("Hello")) {
			System.out.println("String starts with hello");
		}
		
		if(hello.contains("World")) {
			System.out.println("String contains World");
		}
		
		if(hello.contentEquals("Hello World")) {
			System.out.println("Value content matches");
		}

	}
	
	public static void printIn(String string) {
		int length = string.length();
		System.out.printf("Length = %d \n", length);
		
		if(string.isEmpty()) {
			System.out.println("String is empty");
			return;
		}
		
		if(string.isBlank()) {
			System.out.println("String is blank");
			return;
		}
		System.out.printf("First char = %c \n", string.charAt(4));
		
		System.out.printf("Last char = %c " , string.charAt(length-1));
	}

}
