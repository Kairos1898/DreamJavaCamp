package dreamschool.cscourse.chapter06;

public class ChocolateTest {

	public static void main(String[] args) {
		Chocolate choco = new Chocolate();
		choco.name = "�Ƹ����� ";
		choco.type = "��ũ";
		choco.price = 2200;
		choco.printChocolateInfo();
		String chocoName = choco.getName();
		int totalPrice =choco.calculateTotalPrice(20);
		System.out.println(chocoName + "���ݸ� 20�� :" + totalPrice);
		choco.changeCholateInfo("ī�� Ű����", 2500);
		choco.printChocolateInfo();
		System.out.println("ī��⸮�� ���ݸ� 15��(10% ����) : " + choco.calculateTotalPrice(15, 10));
		choco.changeCholateInfo("Ʈ���� ���", "ȭ��Ʈ", 2300);
		choco.printChocolateInfo();

	}

}
