package dreamschool.cscoure.chapter05;

public class ConditionTestEx {
	public static void main(String[] args) {
		int age = 15;
		
		if (age < 19) {
			System.out.println("19세 이상만 입장");
			System.out.println("죄송합니다.");
			
		}
		
		if(age >= 19) {
			System.out.println("성인입니다.");
			System.out.println("입장하세요.");
			
		}else {
			System.out.println("성인이 아닙니다.");
			System.out.println("언른 집으로 꺼지세요. 님이 있을 곳이 아닙니다.");
		}
		
	}

}

