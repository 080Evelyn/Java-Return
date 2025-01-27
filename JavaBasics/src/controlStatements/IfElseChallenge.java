package controlStatements;

public class IfElseChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		calculateScore(true, 800, 5, 100);
		
		calculateScore(true, 1000, 8, 200);
	
	
	}
	
	public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
		
		 
		int finalScore = score;
		
	if(gameOver) {
		finalScore += (levelCompleted * bonus);
		
		System.out.println("Your final score was " + finalScore);
	}
	}

}
