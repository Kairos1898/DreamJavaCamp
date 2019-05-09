package dreamschool.cscourse0708;

public class PublishingTest {

	public static void main(String[] args) {
		Pulication book1 = new Pulication();
		Pulication book2 = new Pulication();
		
		System.out.println(book1);
		System.out.println(book2);
		
		
		System.out.println("===== 출판물 정보를 세팅합니다. =====");
		book1.setTitle("만화삼국지");
		book1.setPrice(-100);
		book1.setPrice(5000);
		book1.setPage(-280);
		book1.setPage(300);
		
		System.out.println("출판물 정보 : " + book1.getTitle() + "( " + book1.getPrice() +" 원, " + book1.getPage()+ " page )");
		

	}

}
