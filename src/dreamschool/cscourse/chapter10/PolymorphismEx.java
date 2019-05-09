package dreamschool.cscourse.chapter10;

public class PolymorphismEx {

	public static void main(String[] args) {
		Person[] persons = new Person[4];
		Persons[0] per1 = new Person("홍길동" , "111-2222");
		Persons[1] stu1 new Student("홍길순" , "111-2345", "컴퓨터공학과");
		Persons[2] tea1 = new Teacher("강감찬", "222-3333", "Java");
		
		for(int i =0; i <persons.length ;i++) {
			persons[i].eat();
			persons[i].sleep();
			System.out.println();
		}
		
		for(Person p : persons) {
			p.eat();
			p.sleep();
			System.out.println();
		}
	}

}
