package dreanschool.cscourse.chapter09;

public class Television extends Product {
	private String description;
	
	public Television(String name, int price, int discountRate, String description); {
		super(name, price, discountRate);
		this.description = description;
	}
	
	public void printProductInfo() {
		System.out.println("===== ��ǰ ���� =====");
		System.out.println("��ǰ�� : " +  this.name);
		System.out.println("���� :" + this.price + "��(" + this.discountRate + "%)");
		System.out.println("�ǸŰ� : ");
	}

}
