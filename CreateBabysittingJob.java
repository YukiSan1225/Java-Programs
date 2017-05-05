//Damien Burks

import java.util.Scanner;
public class CreateBabysittingJob
{
	public static void main (String[] args) {
    	int codes, jobNum, year, hours, fees, numberOfChildren;
    	String name;
    	
    	Scanner in = new Scanner(System.in);
    	System.out.println ("Enter the year please (last two digits): ");
    	year = in.nextInt();
    	System.out.println ("Please enter the job number: ");
    	jobNum = in.nextInt();
    	System.out.println ("Enter the amount of hours: ");
    	hours = in.nextInt();
    	System.out.println ("Please enter the number of the babysitter (numbers 1 - 3: ");
    	codes = in.nextInt();
    	System.out.println ("Enter the number of children (1-9): ");
    	numberOfChildren = in.nextInt();
    	
    	BabysittingJob tester = new BabysittingJob(jobNum, codes, numberOfChildren, hours);
    	//Babysitter Code Logic and Fees
    	if(codes < 1 || codes > 3){
			System.out.println ("Your code is invalid. Please try again.");
			System.exit(0);
		}
		else
		{
			fees = 0;
			int count = 0;
			name = "";
			if(codes == 1)
			{
				name = "Cindy";
				for(int i = 1; i <= hours; i++)
				{
					fees = 7;
					fees = i * fees;
				}
			}
			else if(codes == 2)
			{
				int totalG = 0;
				name = "Greg";
				for(int i = 1; i <= hours; i++)
				{
					fees = 9;
					fees = fees * i;
					while(numberOfChildren > 1 && count != numberOfChildren)
					{
						totalG = totalG + 4;
						count++;
					}
				}
				fees = fees + totalG;
			}
			else if(codes == 3)
			{
				int totalG = 0;
				name = "Marcia";
				for(int i = 1; i <= hours; i++)
				{
					fees = 9;
					fees = fees * i;
					while(numberOfChildren > 1 && count != numberOfChildren)
					{
						totalG = totalG + 4;
						count++;
					}
				}
				fees = fees + totalG;
			}
			tester.setFees(fees);
			tester.setName(name);
		}
		
		//Children Code Logic
		if(numberOfChildren < 1 || numberOfChildren > 9)
		{
			System.out.println ("Too Many or too few children. Please try again later.");
			System.exit(0);
		}
		
		//Job Number: Sequence
		if(jobNum < 1 && jobNum > 9999)
		{
			System.out.println ("Too few or too many jobs. Try again.");
			System.exit(0);
		}
		//Number of Hours
		
		if(hours < 1 || hours > 12)
		{
			System.out.println ("Not enough or too many hours. Contact employer.");
			System.exit(0);
		}
		
		tester.setYear(year);
		tester.display();
    }
}