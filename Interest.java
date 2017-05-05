import java.util.Scanner;
public class Interest
{
	public static void main (String[] args) {
		double money, percent, calculations;
		Scanner reader = new Scanner(System.in);
		System.out.println ("Please enter your starting number for you investment:\n");
		money = reader.nextDouble();
		
		percent = 0.05;
		
		calculations = Calculation(money,percent);
		
		System.out.println ("The amount of money saved for one year would be " + calculations + " .");
    }
    public static double Calculation(double m, double p)
    {
    	double interest, total;
    	
    	interest = m * p;
    	
    	total = interest + m;
    	
    	return total;
    }
}