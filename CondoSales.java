//Damien Burks

import java.util.Scanner;
public class CondoSales
{
	private static int selection;
	private static int price;
	
	public static void main (String[] args) {
		CondoSales input = new CondoSales();
		CondoSales output = new CondoSales();
		CondoSales.input();
		CondoSales.output();
    }
    public static void input(){
    	Scanner in = new Scanner(System.in);
    	System.out.println ("Select your Condo: ");
    	System.out.println ("1. Park View Condo");
    	System.out.println ("2. Golf Course View Condo");
    	System.out.println ("3. Lake View Condo");
    	selection = in.nextInt();
    }
    public static void output(){
    	if(selection == 1)
    	{
    		price = 150000;
    		System.out.println("You chose Park View Condo. Price: "+ price);
    	}
    	else if(selection == 2)
    	{	
    		price = 170000;
    		System.out.println ("You chose Golf Course View Condo. Price: " + price);
    	}
    	else if(selection == 3)
    	{
    		price = 210000;
    		System.out.println ("You chose Lake View Condo. Price: "+ price);
    	}
    	else
    	{
    		price = 0;
    		System.out.println ("Your selection is invalid. Please try again. Price: " + price);
    	}
    }
}