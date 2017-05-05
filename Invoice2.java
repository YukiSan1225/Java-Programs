public class Invoice2
{
	private int Invoice2Number;
	private double balance2;
	private int d2, m2;
	private int y2;
	
	public Invoice2(int INum2, double balanceDue2, int month2, int day2, int year2)
	{
		if(INum2 < 1000)
			INum2 = 0;
		if(month2 >= 1 && month2 <= 12)
		{
			if(month2 == 1)
			{
				if(day2 < 1)
					day2 = 1;
				else if(day2 > 31)
					day2 = 31;
			}
			if(month2 == 2)
			{
				if(day2 < 1)
					day2 = 1;
				else if(day2 > 29)
					day2 = 29;
			}
			if(month2 == 3)
			{
				if(day2 < 1)
					day2 = 1;
				else if(day2 > 31)
					day2 = 31;
			}
			if(month2 == 4)
			{
				if(day2 < 1)
					day2 = 1;
				else if(day2 > 31)
					day2 = 31;
			}
			if(month2 == 5)
			{
				if(day2 < 1)
					day2 = 1;
				else if(day2 > 30)
					day2 = 30;	
			}
			if(month2 == 6)
			{
				if(day2 < 1)
					day2 = 1;
				else if(day2 > 30)
					day2 = 30;
			}
			if(month2 == 7)
			{
				if(day2 < 1)
					day2 = 1;
				else if(day2 > 31)
					day2 = 31;
			}
			if(month2 == 8)
			{
				if(day2 < 1)
					day2 = 1;
				else if(day2 > 31)
					day2 = 31;
			}
			if(month2 == 9)
			{				
				if(day2 < 1)
					day2 = 1;
				else if(day2 > 30)
					day2 = 30;
			}
			if(month2 == 10)
			{
				if(day2 < 1)
					day2 = 1;
				else if(day2 > 31)
					day2 = 31;
			}
			if(month2 == 11)
			{
				if(day2 < 1)
					day2 = 1;
				else if(day2 > 30)
					day2 = 30;
			}
			if(month2 == 12)
			{
				if(day2 < 1)
					day2 = 1;
				else if(day2 > 31)
					day2 = 31;
			}
		}
		else if(month2 > 12 || month2 < 1)
			month2 = 0;
		if(year2 <= 2011 || year2 >= 2017)
			year2 = 0;
			
		Invoice2Number = INum2;
		balance2 = balanceDue2;
		m2 = month2;
		d2 = day2;
		y2 = year2;
	}
	public void displayData2()
	{
		System.out.println ("Invoice number: " + Invoice2Number);
		System.out.println ("Balance Due: " + balance2);
		System.out.println ("Month: " + m2);
		System.out.println ("Day: " + d2);
		System.out.println ("Year: " + y2);
		System.out.println ();
	}
}