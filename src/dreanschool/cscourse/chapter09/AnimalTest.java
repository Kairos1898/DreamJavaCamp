package dreanschool.cscourse.chapter09;

public class AnimalTest {

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.setName("�߿���");
		cat.setAge(3);
		cat.setKind("�丣�þ�");
		
		System.out.println("�̸� : " + cat.getName());
		System.out.println("���� : " + cat.getAge() + "��");
		System.out.println("���� : " + cat.getKind());
		
		cat.run();
		cat.hunt();
		cat.play();

	}

}
