package dreanschool.cscourse.chapter09;

public class InHerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu = new Student("홍길동", "123-4567", "컴퓨터공학과");
		Teacher tea = new Teacher("홍길순", "333-4567", "컴퓨터공학과");
		Person per = new Person("강감찬", "4567-7890");
		
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
