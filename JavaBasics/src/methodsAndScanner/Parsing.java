package methodsAndScanner;

public class Parsing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int currentYear = 2024;
		String usersDateOfBirth = "1999";
		
		int dateOfBirth = Integer.parseInt(usersDateOfBirth);
		
		System.out.println("Age = " + (currentYear - dateOfBirth));
		
		
		String ageWithPartialYear = "22.5";
		double ageYear = Double.parseDouble(ageWithPartialYear);
		
		System.out.println("The user says he is " + ageYear);
		

	}

}
