//Damien Burks

public class Purchase
{
	private int invoice;
	private double sale;
	private double salesTax;
	
	public void setInvoice(int INUM)
	{
		invoice = INUM;
	}
	public void setSale(double s)
	{
		sale = s;
	}
	public void setSalesTax(double st)
	{
		st = st * .05;
		salesTax = st;
	}
	public int getInvoice()
	{
		return invoice;
	}
	public double getSale()
	{
		return sale;
	}
	public double getSalesTax()
	{
		return salesTax;
	}
	public void display()
	{
		System.out.println ("Invoice Number: " + invoice);
		System.out.println ("Sales: " + sale);
		System.out.println ("Sales Tax: " + salesTax);
	}
}