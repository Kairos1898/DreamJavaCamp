package dreamschool.cscourse.chapter10;

public class PolymorphismEx {

	public static void main(String[] args) {
		Person[] persons = new Person[4];
		Persons[0] per1 = new Person("ȫ�浿" , "111-2222");
		Persons[1] stu1 new Student("ȫ���" , "111-2345", "��ǻ�Ͱ��а�");
		Persons[2] tea1 = new Teacher("������", "222-3333", "Java");
		
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
