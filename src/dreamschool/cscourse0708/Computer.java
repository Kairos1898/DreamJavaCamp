package dreamschool.cscourse0708;

public class Computer {
	String model;
	String osVer;
	int Production;
	int sales;
	public Computer(String model, String osVer, int production) {
		this.model = model;
		this.osVer = osVer;
		Production = production;
	}
	public Computer(String model, String osVer, int production, int sales) {
		this.model = model;
		this.osVer = osVer;
		this.Production = production;
		this.sales = sales;
	}
	
	void printComputerInfo() {
		System.out.println("===" + this.model +"(" +this.osVer +") ===");
		System.out.println("���� : " + this.Production +"/�Ǹ� :" + this.sales);
	}
	
	
	

}
