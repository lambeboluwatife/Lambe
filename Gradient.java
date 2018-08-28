import java.util.Scanner;

public class Gradient {
	public static void main(String[] args)
	{
		// Create an instance of the Scanner class
		Scanner input = new Scanner (System.in);

		
		// Ask the user to enter the value of y1
                System.out.print("Enter y1:");
                double y1 = input.nextDouble();
            
            // Ask the user to enter the value of y2
	    System.out.print("Enter y2:");
	    double y2 = input.nextDouble();
            
            // Ask the user to enter the value of x1
	    System.out.print("Enter x1:");
	    double x1 = input.nextDouble();
            
            // Ask the user to enter the value of x2
	    System.out.print("Enter x2:");
	    double x2 = input.nextDouble();
            
            // Compute x1 and x2
            double a1 = ((y2 - y1) / (x2 - x1));
            System.out.println("Solution = " + a1);
        }
}