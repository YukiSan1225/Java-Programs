//Damien Burks
import java.util.Scanner;
public class CreatePurchase
{
	public static void main (String[] args) {
    	int i;
    	double sa;
    	
    	Scanner in = new Scanner(System.in);
    	System.out.println ("Enter your invoice number: ");
    	i = in.nextInt();
    	if(i < 1000 || i > 8000)
    	{
    		System.out.println ("Please try again. Incorrect Number");
    		System.exit(0);
    	}
    	System.out.println ("Enter your sales: ");
    	sa = in.nextDouble();
    	
    	Purchase test = new Purchase();
    	test.setInvoice(i);
    	test.setSale(sa);
    	test.setSalesTax(sa);
    	test.display();
    }
}