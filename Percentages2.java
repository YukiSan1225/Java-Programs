//Damien Burks
import java.util.Scanner;

public class Percentages2
{
	public static void main (String[] args) {
		double num1, num2;
		Scanner in = new Scanner(System.in);
		System.out.println ("Enter your first double:\n");
		num1 = in.nextDouble();
		System.out.println ("Enter your second double:\n");
		num2 = in.nextDouble();
		
		computePercent(num1,num2);
    }
    public static void computePercent(double x, double y)
    {
    	double percent, reverseP;
    	percent = x/y*100;
    	reverseP = y/x*100;
    	
    	System.out.println (x + "is " + percent + " of " + y);
    	System.out.println (y + "is " + reverseP + " of " + x);
    }
}