//Damien Burks

import java.util.Scanner;

public class CondoSales2
{
	private static int selection;
	private static int garageSelection;
	private static int price;
	
	public static void main (String[] args) {
		CondoSales2 input = new CondoSales2();
		CondoSales2 output = new CondoSales2();
		CondoSales2.input();
		CondoSales2.output();
    }
    public static void input(){
    	Scanner in = new Scanner(System.in);
    	System.out.println ("Select your Condo: ");
    	System.out.println ("1. Park View Condo");
    	System.out.println ("2. Golf Course View Condo");
    	System.out.println ("3. Lake View Condo");
    	selection = in.nextInt();
    	if(selection <= 3 && selection >= 1)
    	{
    		System.out.println ("Would you like a condo with a garage or a parking space?");
	    	System.out.println ("1. Garage");
	    	System.out.println ("2. Parking Space");
	    	garageSelection = in.nextInt();
    	}
    }
    public static void output(){
    	if(selection == 1)
    	{
    		price = 150000;
    		if(garageSelection == 1)
    		{
    			price = price + 5000;
    			System.out.println ("You chose Park View Condo with a garage. \nPrice: " + price);
    		}
    		else
    			System.out.println ("You chose Park View Condo with a parking space. \nPrice: "+ price);
    	}
    	else if(selection == 2)
    	{
    		price = 170000;
    		if(garageSelection == 1)
    		{
    			price = price + 5000;
    			System.out.println ("You chose Golf Course View Condo with a garage.\nPrice: "+ price);
    		}
    		else
    			System.out.println ("You chose Golf Course view Condo with a parking space.\nPrice: " + price);
    	}
    	else if(selection == 3)
    	{
    		price = 210000;
    		if(garageSelection == 1)
    		{
    			price = price + 5000;
    			System.out.println ("You chose the Lake View Condo with a garage.\nPrice: " + price);
    		}
    		else
    			System.out.println ("You chose the Lake View Condo with a parking space.\nPrice: " + price);
    	}
    	else
    		System.out.println ("You've entered an invalid selection. Please try again. \nPrice: + price");
    }
}