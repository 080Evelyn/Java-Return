package oop;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String birthDate = "25/11/1982";
		int startingIndex = birthDate.indexOf("1982");
		
		System.out.println("startingIndex = " + startingIndex);
		System.out.println("Birth year = " + birthDate.substring(startingIndex));

		System.out.println("Month = " + birthDate.substring(3,  5));
		
		String newDate = String.join("/", "22", "09", "1995");
		System.out.println("New date = " + newDate);
		System.out.println("Am replacing " + newDate.replace("/", "-" ));
		
		System.out.println("ABC \n".repeat(4));
		System.out.println("-".repeat(3));
		
		System.out.println("ABC \n".repeat(4).indent(2));
		System.out.println("-".repeat(5));
	}

}
