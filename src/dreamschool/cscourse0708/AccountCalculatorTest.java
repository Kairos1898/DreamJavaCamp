package dreamschool.cscourse0708;

public class AccountCalculatorTest {

public static void main(String[] args) {
Account[] arrAcc = {new Account("111-2222-5551", 10000, 4.5),
           new Account("111-2222-5552", 20000, 4.5),
           new Account("111-2222-5553", 30000, 4.5),
           new Account("111-2222-5554", 40000, 4.5),
           new Account("111-2222-5555", 10000, 4.5)
};
for (int i =0; i < arrAcc.length; i++) {
System.out.println("���¹�ȣ : " + arrAcc[i].getNumber() + "/�ܾ� : " + 
                      arrAcc[i].getBalance() + "/���� : " + arrAcc[i].getInterestRate() + "%"); 
}
System.out.println("������ �����մϴ�.");

for(int i = 0; i < arrAcc.length; i++) {
	arrAcc[i].setInterestRate(3.7);
	arrAcc[i].calculateInterest();
	System.out.println("���¹�ȣ : " + arrAcc[i].getNumber() + "/���� : " + arrAcc[1].getInterestRate()+"% / �ܾ� : "+ arrAcc[i].getBalance());
}

}

}