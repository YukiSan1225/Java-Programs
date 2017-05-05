public class Sandwich
{
	private String ingredient, bread;
	private double price;
	
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