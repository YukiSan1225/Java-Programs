public class ArithmeticMethods
{
	public static void main (String[] args) {
		int num1 = 35;
		int num2 = 95;
		displayNumberPlus10(num1, num2);
		displayNumberPlus100(num1,num2);
		displayNumberPlus1000(num1,num2);
    }
    public static void displayNumberPlus10(int num10, int num20)
    {
    	num10 = num10 + 10;
    	num20 = num20 + 10;
    	System.out.println ("Numbers plus 10:\n" + num10 + "\n" + num20);
    }
    public static void displayNumberPlus100(int num100, int num200)
    {
    	num100 = num100 + 100;
    	num200 = num200 + 100;
    	System.out.println ("Numbers plus 100:\n" + num100 + "\n" + num200);
    }
    public static void displayNumberPlus1000(int num1000, int num2000)
    {
    	num1000 = num1000 + 1000;
    	num2000 = num2000 + 1000;
    	System.out.println ("Numbers plus 1000:\n" + num1000 + "\n" + num2000);
    }
}