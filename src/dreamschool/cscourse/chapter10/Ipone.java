package dreamschool.cscourse.chapter10;

public class Ipone extends Mobile {
	private String color;

	public Ipone(String production) {
		super(production);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void charge(int time) {
		System.out.println("Ipone : " + time + "�� �����Ǿ����� Full!!");
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	

}
