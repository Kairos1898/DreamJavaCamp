package dreamschool.cscourse.chapter06;

public class ChocolateTest {

	public static void main(String[] args) {
		Chocolate choco = new Chocolate();
		choco.name = "아마도라 ";
		choco.type = "다크";
		choco.price = 2200;
		choco.printChocolateInfo();
		String chocoName = choco.getName();
		int totalPrice =choco.calculateTotalPrice(20);
		System.out.println(chocoName + "초콜릿 20개 :" + totalPrice);
		choco.changeCholateInfo("카페 키리쉬", 2500);
		choco.printChocolateInfo();
		System.out.println("카페기리시 초콜릿 15개(10% 할인) : " + choco.calculateTotalPrice(15, 10));
		choco.changeCholateInfo("트리플 블랑", "화이트", 2300);
		choco.printChocolateInfo();

	}

}
