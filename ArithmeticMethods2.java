//Damien Burks
import java.util.Scanner;
public class ArithmeticMethods2
{
	public static void main (String[] args) {
		int num1, num2;
		Scanner in = new Scanner(System.in);
		System.out.println ("Enter your first number: ");
		num1 = in.nextInt();
		System.out.println("Enter your second number: ");
		num2 = in.nextInt();
		
		displayNumberPlus10(num1,num2);
		displayNumberPlus100(num1, num2);
		displayNumberPlus1000(num1,num2);
    }
    public static void displayNumberPlus10(int x, int y)
    {
    	x = x + 10;
    	y = y + 10;
    	
    	System.out.println("Number plus 10:\n");
    	System.out.println (x + "\n");
    	System.out.println (y);
    }
    public static void displayNumberPlus100(int x, int y)
    {
    	x = x + 100;
    	y = y + 100;
    	
    	System.out.println("Number plus 100:\n");
    	System.out.println (x + "\n");
    	System.out.println (y);
    }
    public static void displayNumberPlus1000(int x, int y)
    {
    	x = x + 1000;
    	y = y + 1000;
    	
    	System.out.println("Number plus 1000:\n");
    	System.out.println (x + "\n");
    	System.out.println (y);
    }
}