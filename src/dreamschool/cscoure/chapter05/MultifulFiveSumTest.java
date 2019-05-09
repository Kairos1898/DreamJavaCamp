package dreamschool.cscoure.chapter05;

public class MultifulFiveSumTest {
	
	public static void main(String[] args) {
		int count = 1;
		int sum = 0;
		
		while(sum<100) {
			int mulFive = count * 5;
			sum += mulFive;
			System.out.println(count +". ( + " + mulFive +" ) " + sum);
			count++;
		}
	}

}
