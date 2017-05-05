public class Billing
{
	public static void main (String[] args) {
		double priceOfBook = 12.75;
		double quantityOfBook = 2;
		double value = .13;
		
		computeBill(priceOfBook);
		computeBill(priceOfBook, quantityOfBook);
		computeBill(priceOfBook, quantityOfBook, value);
    }
    public static void computeBill(double price){
    	double tax, total;
    	tax = price * 0.08;
    	total = price + tax;
    	System.out.println ("Price of the book is " + total);
    }
    public static void computeBill(double price, double quantity){
    	double tax, total;
    	price = price * quantity;
    	tax = price * .08;
    	total = tax + price;
    	System.out.println ("Price of the " + quantity + " book is " + total);
    }
    public static void computeBill(double price, double quantity, double value){
    	double tax, total, overall;
    	price = price * quantity;
    	tax = price * 0.08;
    	total = price + tax;
    	value = value * total;
    	total = total - value;
    	System.out.println ("Price of the " + quantity + " book with the coupon is " + total);
    }
}