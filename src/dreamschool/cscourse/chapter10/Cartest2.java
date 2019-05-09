package dreamschool.cscourse.chapter10;

public class Cartest2 {

	public static void main(String[] args) {
		//car[] cars = new car[2];
		Washer[] cars = new Washer[2];
		
		cars[0] = new Texi();
		cars[0].wash();
		
		System.out.println("택시 : ");
		cars[0].wash();
		
		cars[1] = new truck();
		
		System.out.println("트럭 : ");
		cars[1].wash();

	}

}
