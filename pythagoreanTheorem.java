import java.util.Scanner;

public class pythagoreanTheorem {
	public static void main(String[] args)
	{
		// Create an instance of the Scanner class
		Scanner input = new Scanner (System.in);

		// a^2+b^2=c^2
		// Ask the user to enter the value of a
	    System.out.print("Enter a:");
	    double a = input.nextDouble();
	        
	    // Ask the user to enter the value of b
	    System.out.print("Enter b:");
	    double b = input.nextDouble();
	        
	    // Compute c and d
        double c = (Math.pow(a, 2) + Math.pow(b, 2));
        double d = (Math.sqrt(c));
        System.out.println("c = " + d);
	}    
}