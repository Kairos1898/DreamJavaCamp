package icehs.schience.chapter03;

public class StatisticsCastingTestjava {
	
	public static void main(String[] args) {
		double lottoProbability = 0.0000001235;
		long population = 6973738433L;
		
		int inLottoProbability = (int)lottoProbability;
		System.out.println("�ζǿ� ��÷�� Ȯ�� : " + lottoProbability);

		int intPopulation = (int)population;
		System.out.println("�� ���� �α��� : " + population);
		System.out.println("�� ���� �α��� int ��ȯ : " + intPopulation);
	}
}