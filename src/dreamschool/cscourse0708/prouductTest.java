package dreamschool.cscourse0708;

public class prouductTest {
	
	public static void main(String[] arge) {
		System.out.println("=====Ä¿ÇÇ¹Í½º=====");
		Prouduct mix = new Prouduct("Ä¿ÇÇ¹Ô½º", 12000, 20);
		Prouduct cup = new Prouduct("Á¾ÀÌÄÅ", 3000);
		mix.printProductInfo();
		cup.printProductInfo();
	}

}
