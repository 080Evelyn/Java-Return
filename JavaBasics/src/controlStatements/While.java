package controlStatements;

public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i= 1; i <= 5; i++ ) {
			System.out.println(i);
		}

		int j = 1;
		while(j <= 6) {
			System.out.println(j);
			j++;
		}
		
		int k = 1;
		while(true) {
			if(k > 7) {
				break;
			}
			System.out.println(k);
			k++;
			
		}
	}

}
