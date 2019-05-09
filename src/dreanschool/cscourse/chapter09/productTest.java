package dreanschool.cscourse.chapter09;

public class productTest {

	public static void main(String[] args) {
		Product laundry = new Product("통돌이", 450000, 8);
		Television cinema = new Television("시네마 TV", 3500000, 10, "화면 크기 151cm");
		
		laundry.printProductInfo();
		System.out.println();
		cinema.printProductInfo();
		System.out.println("비고 : " + cinema.getDiscount());
		
		System.out.println();
		System.out.println("[공지] 할인율이 모두 15%로 변경합니다.");
		laundry.setDiscount(15);
		cinema.setDiscount(15);
		
		System.out.println(laundry.getName() + "판매가 : " + laundry.calculateDiscountPrice() + "원");
		System.out.println(cinema.getName() + "판매가 : " + cinema.calculateDiscountPrice() + "원");

	}

}
