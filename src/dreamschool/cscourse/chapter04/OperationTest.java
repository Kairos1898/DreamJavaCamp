package dreamschool.cscourse.chapter04;

public class OperationTest {

	public static void main(String[] args) {
		int num1 = 64;
		System.out.println("¦���Դϱ�? :" + (num1 % 2 ==0));
		System.out.println("3�� ¦���Դϱ�? :" + (num1 % 3 ==0));
		System.out.println("2�� ����̸鼭 7�� ����Դϱ�? :" + ((num1 % 2 ==0) && (num1 % 7 == 0)));
		System.out.println("2�� ����̰ų� 7�� ��� �Դϱ�? :" + ((num1 % 2 ==0) || (num1 % 2 ==0)));
		
	}

}
