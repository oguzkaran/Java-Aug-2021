package org.csystem.simulation.craps;

public class CrapsSimulationApp {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		CrapsSimulation cs = new CrapsSimulation();
				
		for (;;) {
			System.out.print("Kaç kez oynatmak istiyorsunuz?");
			int n = Integer.parseInt(kb.nextLine());
			
			if (n <= 0)
				break;
			
			System.out.println("----------------------------");
			
			cs.run(n);
			System.out.printf("Kazanma olas?l???: %f%n", cs.p);
			System.out.println("----------------------------");
		}
		
		System.out.println("Tekrar yap?yor musunuz?");		
	}
}
