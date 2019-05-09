package dreamschool.cscourse0708;

public class StudentExTest {

	public static void main(String[] args) {
		StudentEx[] studentsEx = { new StudentEx("강감찬" , "STU0001", "010-1234-5678"),
				                new StudentEx("이순신", "STU0002", "010-2345-6789"),
				                new StudentEx("김유신", "STU0003", "010-9876-5432")
				
	};
		
	for(int i = 0 ; i< studentsEx.length; i++) {
		studentsEx[i].printStudentInfo();
	}

	}

}
