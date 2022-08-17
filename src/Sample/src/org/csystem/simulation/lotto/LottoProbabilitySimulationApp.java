package org.csystem.simulation.lotto;

public class LottoProbabilitySimulationApp {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);

		System.out.print("Bir sayı giriniz:");
		int count = Integer.parseInt(kb.nextLine());
		LottoProbabilitySimulation simulation = new LottoProbabilitySimulation(count);

		simulation.run();
		System.out.printf("1.oyun için oyuncunun kazanma olasılığı:%f%n", simulation.getGame1Prob());
		System.out.printf("2.oyun için oyuncunun kazanma olasılığı:%f%n", simulation.getGame2Prob());
		System.out.printf("3.oyun için oyuncunun kazanma olasılığı:%f%n", simulation.getGame3Prob());
	}
}





