package dreamschool.cscourse.chapter04;

public class OperationTest {

	public static void main(String[] args) {
		int num1 = 64;
		System.out.println("짝수입니까? :" + (num1 % 2 ==0));
		System.out.println("3의 짝수입니까? :" + (num1 % 3 ==0));
		System.out.println("2의 배수이면서 7의 배수입니까? :" + ((num1 % 2 ==0) && (num1 % 7 == 0)));
		System.out.println("2의 배수이거나 7의 배수 입니까? :" + ((num1 % 2 ==0) || (num1 % 2 ==0)));
		
	}

}
