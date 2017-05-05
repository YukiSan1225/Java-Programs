public class Percentages
{
	public static void main (String[] args) {
		double num1 = 15.0;
		double num2 = 89.0;
		computePercent(num1,num2);
    }
    public static void computePercent(double n1, double n2)
    {
    	double percent = n1 / n2 * 100;
    	
    	System.out.println (n1 + " is " + percent + " of " + n2);
    	
    	double reverseP = n2 / n1 * 100;
    	
    	System.out.println (n2 + " is " + reverseP + " of " + n1);
    }
}