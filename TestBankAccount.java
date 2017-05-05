import java.util.Scanner;

public class TestBankAccount
{
	private static double deduct;
	public static void main (String[] args) {
		BankAccount money, accountNum, n;
		money = getData1();
		accountNum = getData2();
		n = getData3();
		showValues(money,accountNum,n);
    }
    public static BankAccount getData1(){
    	double balance;
    	BankAccount mm = new BankAccount();
    	Scanner m = new Scanner(System.in);
    	System.out.println ("Enter your funds: ");
    	balance = m.nextDouble();
    	mm.setBalance(balance);
    	deduct = mm.deductMonthlyFee(balance);
    	return mm;
    }
    public static BankAccount getData2(){
    	int accountNumber;
    	BankAccount aa = new BankAccount();
    	Scanner a = new Scanner(System.in);
    	System.out.println ("Enter your account number: ");
    	accountNumber = a.nextInt();
    	aa.setAccountNum(accountNumber);
    	return aa;
    }
    public static BankAccount getData3(){
    	String name;
    	BankAccount nn = new BankAccount();
    	Scanner naze = new Scanner(System.in);
    	System.out.println ("Enter your name: ");
    	name = naze.nextLine();
    	nn.setName(name);
    	return nn;
    }
    public static void showValues(BankAccount my, BankAccount an, BankAccount ne)
    {
    	System.out.println ("Balance: " + my.getBalance());
    	System.out.println ("Account Number: " + an.getAccountNum());
    	System.out.println ("Name: " + ne.getName());
    	System.out.println ("Every moth, we deduct about 4 dollars from your account.");
    	System.out.println ("Updated account information: " + deduct);
    }
}