package gooto.github;

public class Car {
	private String modelName;
	private int maxSpeed;
	private int numberLimit;
	private int mileage;
	private boolean available;
	
	public void displayInfo() {
		System.out.println("-------------------------------------------");
		System.out.println(" 모 델 명 : " + modelName);
		System.out.println(" 최고속도 : " + maxSpeed + "km/h");
		System.out.println(" 최대정원 : " + numberLimit + "명");
		System.out.println(" 평균연비 : " + mileage + "km/l");
	}
}
