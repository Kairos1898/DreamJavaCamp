package dreamschool.cscourse.chapter10;

public class CarTest {

	public static void main(String[] args) {
		car[] cars = new car[2];
		cars[0] = new Texi();
		cars[1] = new truck();
		
		cars[0].setOilSize(10);
		cars[1].setOilSize(10);
		Texi texi = (Texi)cars[0];
		texi.setMamNum(4);
		truck truck = (truck)cars[1];
		truck.setMaxWeight(100);
		
		
		cars[0].go(20);
		System.out.println("연료 :" + cars[0].getOilSize());
		System.out.println("택시 정원 :" + texi[0].getOilSize() + "명");
		cars[0].go(30);
		System.out.println("연료 :" + cars[0].getOilSize());
		System.out.println("트럭 최대 적재량 :" + truck.setMaxWeight() + "kg");

	}

}
