import java.util.Scanner;

public class areaOftriangle {
	public static void main(String[] args)
	{
		// Create an instance of the Scanner class
		Scanner input = new Scanner (System.in);

		
		// Ask the user to enter the value of b
                System.out.print("Enter b:");
                double b = input.nextDouble();
            
            // Ask the user to enter the value of h
	    System.out.print("Enter h:");
	    double h = input.nextDouble();
            
            // Compute x1
            double x1 = (1/2 * b * h);
            System.out.println(x1);
    }
}