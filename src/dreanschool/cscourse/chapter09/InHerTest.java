package dreanschool.cscourse.chapter09;

public class InHerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu = new Student("ȫ�浿", "123-4567", "��ǻ�Ͱ��а�");
		Teacher tea = new Teacher("ȫ���", "333-4567", "��ǻ�Ͱ��а�");
		Person per = new Person("������", "4567-7890");
		
		System.out.println("==== Person ====");
		per.study();
		per.eat();
		
		System.out.println("==== Student ====");
		stu.study();
		stu.eat();
		
		System.out.println("==== Teacher ====");
		tea.teach();
		tea.eat();

	}

}
