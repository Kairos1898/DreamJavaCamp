package dreanschool.cscourse.chapter09;

public class productTest {

	public static void main(String[] args) {
		Product laundry = new Product("�뵹��", 450000, 8);
		Television cinema = new Television("�ó׸� TV", 3500000, 10, "ȭ�� ũ�� 151cm");
		
		laundry.printProductInfo();
		System.out.println();
		cinema.printProductInfo();
		System.out.println("��� : " + cinema.getDiscount());
		
		System.out.println();
		System.out.println("[����] �������� ��� 15%�� �����մϴ�.");
		laundry.setDiscount(15);
		cinema.setDiscount(15);
		
		System.out.println(laundry.getName() + "�ǸŰ� : " + laundry.calculateDiscountPrice() + "��");
		System.out.println(cinema.getName() + "�ǸŰ� : " + cinema.calculateDiscountPrice() + "��");

	}

}
