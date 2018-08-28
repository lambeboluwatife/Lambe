import java.util.Scanner;

public class simpleQuadratic {
	public static void main(String[] args)
	{
		// Create an instance of the Scanner class
		Scanner input = new Scanner (System.in);

		// Ask the user to enter the value of a
	    System.out.print("Enter a:");
	    double a = input.nextDouble();
	        
	    // Ask the user to enter the value of b
	    System.out.print("Enter b:");
	    double b = input.nextDouble();
	        
	    // Ask the user to enter the value of c
	    System.out.print("Enter c:");
	    double c = input.nextDouble();
	    // Compute x1 and x2
        double x1 = (-b + Math.sqrt(Math.pow(b, 2) + (4 * a * c))) / (2 * a);
        double x2 = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
        System.out.println(x1);
        System.out.println(x2);
	}    
}