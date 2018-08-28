import java.util.Scanner;

public class AP {
	public static void main(String[] args)
	{
		// Create an instance of the Scanner class
		Scanner input = new Scanner (System.in);

		
		// Ask the user to enter the value of a
                System.out.print("Enter a:");
                double a = input.nextDouble();
            
            // Ask the user to enter the value of d
	    System.out.print("Enter d:");
	    double d = input.nextDouble();
            
            // Ask the user to enter the value of n
	    System.out.print("Enter n:");
	    double n = input.nextDouble();
            
            // Compute x1
            double x1 = (a + (n - 1) d);
            System.out.println(x1);
    }
}
