package dreamschool.cscourse0708;

public class Prouduct {
	String name;
	int price;
	int discount;
	public Prouduct() {
	}
	public Prouduct(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public Prouduct(String name, int price, int discount) {
		this.name = name;
		this.price = price;
		this.discount = discount;
	}
    void printProductInfo() {
    	System.out.println("====" + this.name +"====");
    	System.out.println("���� : " + this.price + "��");
    	if(this.discount != 0) {
    		System.out.println("������ : " + this.discount + "��");
    	}else {
    		System.out.println("������ : �������� ����");
    	}
    }
	
	

}
