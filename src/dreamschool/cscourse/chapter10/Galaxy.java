package dreamschool.cscourse.chapter10;

public class Galaxy extends Mobile implements GooglePlay {
	private String osVersion;

	public Galaxy(String production) {
		super(production);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void charge(int time) {
		System.out.println("Galaxy : �������͸�" + time + "�� ����");


}
	public String getOsVersion() {
		return osVersion;
	}
	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}
	@Override
	public void buy(String kind, int price) {
		System.out.println("Galaxy : " + kind + "���� " + price + "���� �����߽��ϴ�.");
		
	}
}
