package dreamschool.cscourse0708;

public class ItBookTest {

	public static void main(String[] args) {
		ItBook sql = new ItBook("SQL Plus", 50000, 5.5);
		ItBook java = new ItBook("java 2.0", 28000, 3.2);
		ItBook jsp = new ItBook("JSP Servlet", 37000, 6.9);
		
		sql.printInfoBookInfo();
		java.printInfoBookInfo();
		jsp.printInfoBookInfo();
		
		System.out.println();
		System.out.println("SQL Plus ������ �������� �����մϴ�.");
		sql.setPrice(55000);
		sql.setDiscountRate(9.5);
		sql.printInfoBookInfo();
		
		System.out.println();
		System.out.println("Java 2.0 ������ �����մϴ�.");
		java.setPrice(33000);
		java.printInfoBookInfo();
		
		System.out.println();
		System.out.println("JSP Servlet ����� �������� �����մϴ�.");
		jsp.setTitle("Servelt & JSP");
		jsp.setDiscountRate(12.6);
		jsp.printInfoBookInfo();
		

	}

}
