package dreamschool.cscourse.chapter10;

public class truck extends car {
	private int maxWeight;

	public int getMaxWeight() {
		return maxWeight;
	}
	
	@Override
	public void go(int d) {
		System.out.println("Ʈ���� Ÿ��" + d + "km �̵��մϴ�.");

}
}
