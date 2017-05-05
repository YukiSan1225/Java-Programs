public class BankAccount
{
	private int accountNumber;
	private double balance;
	private String name;
	
	public BankAccount()
	{
		accountNumber = 97802345;
		balance = 0.00;
		name = "";
		
		deductMonthlyFee(balance);
	}
    public double deductMonthlyFee(double accountB)
    {
    	accountB = accountB - 4.00;
    	return accountB;
    }
    public static void explainAccountPolicy()
    {
    	System.out.println ("That 4$ service fee will be deducted each month.");
    }
    public void setAccountNum(int account)
    {
    	accountNumber = account;
    }
    public void setBalance(double bal)
    {
    	balance = bal;
    }
    public void setName(String n){
    	name = n;
    }
    public int getAccountNum(){
    	return accountNumber;
    }
    public double getBalance(){
    	return balance;
    }
    public String getName(){
    	return name;
    }
}