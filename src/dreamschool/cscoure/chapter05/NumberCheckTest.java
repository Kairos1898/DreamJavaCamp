package dreamschool.cscoure.chapter05;

public class NumberCheckTest {

	public static void main(String[] args) {
		int num1 = 2 * 3;
		if (num1 < 0) {
			System.out.println("음수를 확인하지 않았습니다.");	
		}else if (num1 < 10 ) {
			System.out.println("한자리 수입니다.");
		}else if (num1 < 100) {
			System.out.println("num1 < 100");
		}
		
		

	}

}
