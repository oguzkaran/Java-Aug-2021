/*----------------------------------------------------------------------------------------------------------------------
	 
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{	
		EquationSolverApp.run();		
	}
}


class EquationSolverApp {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("a?");
		double a = Double.parseDouble(kb.nextLine());
		
		System.out.print("b?");
		double b = Double.parseDouble(kb.nextLine());
		
		System.out.print("c?");
		double c = Double.parseDouble(kb.nextLine());
		
		EquationSolver.findRoots(a, b, c);		
	}
}

class EquationSolver {
	public static double getDeltaValue(double a, double b, double c)
	{
		return b * b - 4 * a * c;
	}
	
	public static void findRoots(double a, double b, double c)
	{
		double delta = getDeltaValue(a, b, c);
		
		if (delta >= 0) {
			double sqrtDelta = Math.sqrt(delta); 
			double x1 = (-b + sqrtDelta) / (2 * a);
			double x2 = (-b - sqrtDelta) / (2 * a);
			
			System.out.printf("x1 = %f, x2 = %f%n", x1, x2);			
		}		
		else
			System.out.println("Gerçek kök yok");
	}
}