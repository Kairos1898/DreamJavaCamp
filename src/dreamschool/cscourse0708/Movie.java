package dreamschool.cscourse0708;

public class Movie {
	String title;
	String director;
	String genre;
	
	public Movie(String title) {
		this.title = title;
	}
	public Movie(String title, String director) {
		this.title = title;
		this.director = director;
	}
	public Movie(String title, String director, String genre) {
		this.title = title;
		this.director = director;
		this.genre = genre;
	}
	public void moiveInfo() {
		System.out.println(title);
		System.out.println(director);
		System.out.println(genre);
		

	}

	
	
}
