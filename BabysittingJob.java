//Damien Burks
import java.text.DecimalFormat;
public class BabysittingJob
{
	int jNum, year, seq, Code, numberOfChild, Hours, fee;
	String name;
	
	public BabysittingJob(int number, int code, int numChild, int hourS)
	{
		jNum = number;
		Code = code;
		numberOfChild = numChild;
		Hours = hourS; 	
	}
	
	public void setYear(int y)
	{
		year = y;
	}
	public void setFees(int f)
	{
		fee = f;
	}
	public void setName(String n)
	{
		name = n;
	}
	public String getName(){
		return name;
	}
	public int getFees()
	{
		return fee;
	}
	public int getYear()
	{
		return year;
	}
	public void display()
	{
		DecimalFormat df = new DecimalFormat("0000");
		System.out.println ("Babysitter: " + getName());
		System.out.println ("Year: " + 20 + getYear());
		System.out.println ("Job Number: "+ year + df.format(jNum));
		System.out.println ("Total Fees: " + getFees());
		System.out.println ("Number of Children: " + numberOfChild);
	}
}