package dreanschool.cscourse.chapter09;

public class Television extends Product {
	private String description;
	
	public Television(String name, int price, int discountRate, String description); {
		super(name, price, discountRate);
		this.description = description;
	}
	
	public void printProductInfo() {
		System.out.println("===== 제품 정보 =====");
		System.out.println("제품명 : " +  this.name);
		System.out.println("정가 :" + this.price + "원(" + this.discountRate + "%)");
		System.out.println("판매가 : ");
	}

}
