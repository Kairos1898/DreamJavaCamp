package dreamschool.cscourse.chapter06;

public class AccountTest {

	public static void main(String[] args) {
		Account acc = new Account();
		acc.accName = "ȫ�浿";
		acc.accNo = "123-456789";
		acc.balance = 100000;
		acc.printAccountInfo();
		System.out.println("�ܾ� : " + acc.balance + "��");
		
		System.out.println("20000���� �Ա��մϴ�.");
	    acc.deposit(20000);
	    
	    System.out.println("�ܾ� :" + acc.balance + "��");
	    
	    System.out.println("45000���� �Ա��մϴ�.");
	    acc.withdraw(45000);
	    System.out.println("�ܾ� : " + acc.balance + "��");

	}

}
