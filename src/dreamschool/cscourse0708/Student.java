package dreamschool.cscourse0708;

public class Student {
	public final static String COURSE = "JAVA";
	public String id ;
	private String name;
	
	public static void printTitle() {
		System.out.println("=============");
		System.out.println("�л� ���� ���");
		System.out.println("=============");
	}
	
	public void printSudentInfo() {
		System.out.println("�й�" + this.id);
		System.out.println("�̸�" + this.name);
	}

}