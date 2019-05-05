package icehs.schience.chapter03;

public class StatisticsCastingTestjava {
	
	public static void main(String[] args) {
		double lottoProbability = 0.0000001235;
		long population = 6973738433L;
		
		int inLottoProbability = (int)lottoProbability;
		System.out.println("로또에 당첨될 확률 : " + lottoProbability);

		int intPopulation = (int)population;
		System.out.println("전 세계 인구수 : " + population);
		System.out.println("전 세계 인구수 int 변환 : " + intPopulation);
	}
}