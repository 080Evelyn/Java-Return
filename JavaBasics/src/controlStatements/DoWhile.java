package controlStatements;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int j = 1;
	do {
		System.out.println(j);
		j++;
		if(j % 5 != 0) {
			continue;
		}
	}
	while (j <= 10);

	}

}
