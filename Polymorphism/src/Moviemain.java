import java.util.Scanner;

public class Moviemain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Movie theMovie = new ScienceFiction("Star Wars");
//		theMovie.watchMovie();
//		
//		System.out.println();
//		System.out.println();
		
//		Movie theMovie2=  Movie.getMovie("Adventure", "Stargon");
//		theMovie2.watchMovie();
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.print("Enter Type (A for Adventure, C for comedy, S for Science Fiction, or Q for quit):");
			String type = s.nextLine();
			if("Qq".contains(type)) {
				break;
			}
			System.out.println("Enter Movie Title: ");
			String title = s.nextLine();
			Movie movie = Movie.getMovie(type, title);
			movie.watchMovie();
					
					
					
		}
	}

}
