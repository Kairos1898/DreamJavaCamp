package dreamschool.cscourse.chapter04;

public class SalaryTest {

	public static void main(String[] args) {
		int ���� = 1000000;
		int ���ʽ� = ���� / 100 * 20;
		int ����1 = (���� / 10);
		int ����2 = (���ʽ� / 1000 * 55);
		
		System.out.println("���� :" + (����*12));
		System.out.println("���� ���� :" + (����*12 - ����1*12) );
		System.out.println("���ʽ� :" + ���ʽ� * 4);
		System.out.println("���� ���ʽ� :" + (���ʽ� * 4 - ����2 * 4));
		System.out.println("���޾� :" + (����*12 + ���ʽ�*4 - ����1*12 - ����2*4));
		
	}

}
