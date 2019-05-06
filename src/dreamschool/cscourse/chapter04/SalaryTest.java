package dreamschool.cscourse.chapter04;

public class SalaryTest {

	public static void main(String[] args) {
		int 월급 = 1000000;
		int 보너스 = 월급 / 100 * 20;
		int 세금1 = (월급 / 10);
		int 세금2 = (보너스 / 1000 * 55);
		
		System.out.println("연봉 :" + (월급*12));
		System.out.println("세후 연봉 :" + (월급*12 - 세금1*12) );
		System.out.println("보너스 :" + 보너스 * 4);
		System.out.println("세후 보너스 :" + (보너스 * 4 - 세금2 * 4));
		System.out.println("지급액 :" + (월급*12 + 보너스*4 - 세금1*12 - 세금2*4));
		
	}

}
