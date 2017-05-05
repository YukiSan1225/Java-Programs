//Damien Burks
import java.util.Scanner;
public class Factorials
{
	public static void main (String[] args) {
		int i = 1;
		for(int factorial = 1; factorial <= 10; factorial++)
		{
			i = i * factorial;
		}
		System.out.println ("Factorial of 10: " + i);
    }
}