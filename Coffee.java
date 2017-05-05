//Damien Burks

import java.util.Scanner;
public class Coffee
{
	private static int selection;
	private static double price;
	private static double total;
	
	public static void main (String[] args) {
    	Coffee input = new Coffee();
    	Coffee.input();
    }
    public static void input()
    {
    	int count = 0;
    	Scanner in = new Scanner(System.in);
    	System.out.println ("-------------------------");
    	System.out.println ("(1)American\t1.99");
    	System.out.println ("(2)Espresso\t2.50");
    	System.out.println ("(3)Latte\t2.15");
    	System.out.println ("-------------------------");
    	System.out.println ("What would you like to have today?");
    	selection = in.nextInt();
    	while(count < 2 && selection != 0)
    	{
	    	System.out.println ("-------------------------");
	    	System.out.println ("(1)American\t1.99");
	    	System.out.println ("(2)Espresso\t2.50");
	    	System.out.println ("(3)Latte\t2.15");
	    	System.out.println ("-------------------------");
    		System.out.println ("Anything else?");
    		selection = in.nextInt();
    		count++;
    		
    		if(selection == 1)
    			price = 1.99;
    		else if(selection == 2)
    			price = 2.50;
    		else if(selection == 3)
    			price = 2.15;
    		total = total + price;
    	}
    	System.out.println ("Your total of " + count + " items came up to be " + total);
    }
}