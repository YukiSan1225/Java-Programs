public class TestSandwich
{
	private String ingredient, bread;
	private double price;
	
	public static void main (String[] args) {
		TestSandwich mainIn = new TestSandwich();
		TestSandwich typeOfBread = new TestSandwich();
		TestSandwich dPrice = new TestSandwich();
		
		mainIn.setIngredient("Cheese");
		typeOfBread.setBread("White");
		dPrice.setPrice(5.29);
		
		System.out.println ("You have a " + mainIn.getIngredient() + " with " + typeOfBread.getBread() + " bread sandwich and the cost of it is " + dPrice.getPrice());
    }
	public void setIngredient(String in){
		ingredient = in;
	}
	public void setBread(String br){
		bread = br;
	}
	public void setPrice(double p){
		price = p;
	}
	public String getIngredient()
	{
		return ingredient;
	}
	public String getBread()
	{
		return bread;
	}
	public double getPrice()
	{
		return price;
	}
} 