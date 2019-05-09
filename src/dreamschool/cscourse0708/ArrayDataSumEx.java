package dreamschool.cscourse0708;

public class ArrayDataSumEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numbers = {11,22,33,44,55,66,77,88,99};
		int sum = 0;
		
		for(int i =0 ; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
			sum += numbers[i];
		}
		
		System.out.println();
		
		System.out.println("รัวี : " + sum);

	}

}
