package dreanschool.cscourse.chapter09;

public class Student extends Person {
	private String department;
	
	public Student(String name, String phoneNumber, String department) {
		super(name, phoneNumber);
		this.department = department;
	}
	
	public void study() {
		super.eat();
		System.out.println("���θ� �ؿ�.");
		
	}
	
	public void eat() {
		System.out.println("������ �Ծ��.");
	}
	
	@Override
	public void eat() {
		System.out.println("�ٰ��� �Ծ��.");
	}

}
