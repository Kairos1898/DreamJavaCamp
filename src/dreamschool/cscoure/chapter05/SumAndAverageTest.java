package dreamschool.cscoure.chapter05;

public class SumAndAverageTest {

	public static void main(String[] args) {
		int sum = 0;
		double average = 0;
		
		for(int i =1; i<=500; i++) {
			sum += i;
		}
		average = (double)sum / 500;
		System.out.println("ÇÕ°Ô :" + sum);
		System.out.println("Æò±Õ : " + average);
		

	}

}
