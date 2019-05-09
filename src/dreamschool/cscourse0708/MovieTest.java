package dreamschool.cscourse0708;

public class MovieTest {

	public static void main(String[] args) {
		Movie movie1 = new Movie("고질라");
		Movie movie2 = new Movie("트랜스포머4", "마이클 베어");
		Movie movie3 = new Movie("아바타", "제임스카메론" ,"SF");
		
		movie1.moiveInfo();
		movie2.moiveInfo();
		movie3.moiveInfo();
	}

}
