package dreamschool.cscourse.chapter11;

import java.util.ArrayList;

public class BookListTest {

	public static void main(String[] args) {
		ArrayList<Book> list = new ArrayList<>();
		list.add(new Book("���� �ڱ��ϴ� java", 900, 25000));
		list.add(new Book("Oracle 11g", 560, 20000));
		list.add(new Book("Java�� ����", 271, 12000));
		
		for(int i = 0; i< list.size(); i++) {
			Book book = list.get(i);
			System.out.println((i+1) + "." + book.getTitle() + "( " + book.getPage()+ " page) : " + book.getPrice()+"��");
		}
		

	}

}
