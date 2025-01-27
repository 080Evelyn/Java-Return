package methodsAndScanner;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int newScore = calculateScore("Tim", 500);
		System.out.println("New score is " + newScore);
		
		newScore = calculateScore(700);
		System.out.println("New score for unnamed player is " + newScore);
		
		calculateScore();
		
	}
	
	public static int calculateScore(String playerName, int score) {
		System.out.println("Player " + playerName + " scored " + score + " points");
		return score *1000;
	}
	
	public static int calculateScore(int score) {
		System.out.println("unnamed player scored " + score + " points");
		return score *1000;
	}
	
	public static int calculateScore() {
		System.out.println("No player name, no player score" );
		return 0;
	}


}
