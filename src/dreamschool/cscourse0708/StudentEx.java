package dreamschool.cscourse0708;

public class StudentEx {
	private String name;
	private String studentId;
	private String phoneNo;
	
	
	
	public StudentEx(String name, String studentId, String phoneNo) {
		this.name = name;
		this.studentId = studentId;
		this.phoneNo = phoneNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	public void printStudentInfo() {
		System.out.println(this.name + "(" + this.studentId +") / 전화번호 : " + this.phoneNo);
	}
	

}
