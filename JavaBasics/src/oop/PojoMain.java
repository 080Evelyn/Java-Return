package oop;

public class PojoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 1; i <= 5; i++) {
			Pojo s = new Pojo ("S92300" + i,
					switch(i) {
					case 1 -> "Mary";
					case 2 -> "Carol";
					case 3 -> "Tim;";
					case 4 -> "Harry";
					case 5 -> "Lisa";
					default -> "Anonymous";
					},
					"05/11/1985",
					"Java Masterclass");
			System.out.println(s);
		}
		

	}

}
