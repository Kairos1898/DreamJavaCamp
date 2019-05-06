package dreamschool.cscourse.chapter04;

public class SepNumTest {

	public static void main(String[] args) {
		int num1 = 456;
		 System.out.println("숫자 :" + num1);
		 System.out.println("백의 자리 :" + num1 / 100);
		 System.out.println("십의 자리 :" + num1 % 100 / 10);
		 System.out.println("일의 자리 :" + num1 % 100 % 10 / 1);
		
	}

}
