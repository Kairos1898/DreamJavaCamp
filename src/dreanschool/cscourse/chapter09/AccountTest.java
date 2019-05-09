package dreanschool.cscourse.chapter09;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FundAccount fund = new FundAccount();
		
		fund.setNumber("111-2222");
		fund.setName("ȫ�浿");
		fund.setBalance(5000000);
		
		fund.openAccount();
		
		fund.setEarningRate(4.7);
		fund.earnMoney();

	}

}
