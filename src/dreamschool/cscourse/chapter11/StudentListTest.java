package dreamschool.cscourse.chapter11;

import java.util.ArrayList;

public class StudentListTest {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student("�̼���",80, 90, 95));
		list.add(new Student("������",95, 89, 92));
		list.add(new Student("������",88, 97, 94));
		
		Student stu = list.get(0);
		stu.setEnglish(90);
		list.remove(1);
		
		for(Student stu1 : list) {
			System.out.println(stu1.getName() +"( ���� : " + stu1.getKorean() + ", ���� : " + stu1.getEnglish() + ", ���� : " + stu1.getMath() +" )" );
		}
		

	}

}
