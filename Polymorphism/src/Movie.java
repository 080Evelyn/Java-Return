
public class Movie {

	private String title;

	public Movie(String title) {
		this.title = title;
	}   
	
	public void watchMovie() {
		String instanceType = this.getClass().getSimpleName();
		System.out.println(title + " is a " + instanceType + " film");
	}
	
	public static Movie getMovie(String type, String title) {
		return switch (type.toUpperCase().charAt(0)) {
		case 'A' -> new Adventure(title);
		case 'C' -> new Comedy(title);
		case 'S' -> new ScienceFiction(title);
		default -> new Movie(title);
		};
	}
}


class Adventure extends  Movie{

	public Adventure(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void watchMovie() {
		// TODO Auto-generated method stub
		super.watchMovie();
		System.out.printf("..%s%n ".repeat(3), "Pleasant Scene", "Scary Music", "Something Bad Happens");
		
	}
	
}

class Comedy extends  Movie{

	public Comedy(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void watchMovie() {
		// TODO Auto-generated method stub
		super.watchMovie();
		System.out.printf("..%s%n ".repeat(3), "Something funny happens", "Something even funnier hapens", "Happy Ending");
		
	}
	
}

class ScienceFiction extends  Movie{

	public ScienceFiction(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void watchMovie() {
		// TODO Auto-generated method stub
		super.watchMovie();
		System.out.printf("..%s%n ".repeat(3), "Bad aliens do Bad stuff", "Space Guys Chase Aliens", "Planet blows up");
		
	}
	
	
	
}