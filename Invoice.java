//Damien Burks

public class Invoice
{
	private int InvoiceNumber;
	private double balance;
	private int d, m;
	private int y;
	
	public Invoice(int INum, double balanceDue, int month, int day, int year)
	{
		
		if(INum < 1000)
			INum = 0;
		if(month < 1 || month > 12)
			month = 0;
		if(day < 1 || day > 31)
			day = 0;
		if(year < 2011 || year > 2017)
			year = 0;
			
		InvoiceNumber = INum;
		balance = balanceDue;
		m = month;
		d = day;
		y = year;
	}
	public void displayData()
	{
		System.out.println ("Invoice number: " + InvoiceNumber);
		System.out.println ("Balance Due: " + balance);
		System.out.println ("Month: " + m);
		System.out.println ("Day: " + d);
		System.out.println ("Year: " + y);
	}
}