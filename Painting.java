public class Painting
{
	private String title, artist, medium;
	private double price, commission;
	
	public Painting()
	{
		title = "";
		artist = "";
		medium = "";
		price = 0.00;
		commission = 0.20;
	}
	public void setPrice(double p){
		price = p;
	}
	public void setTitle(String t){
		title = t;
	}
	public void setArtist(String a){
		artist = a;
	}
	public void setMedium(String m){
		medium = m;
	}
	public double getPrice(){
		return price;
	}
	public String getTitle(){
		return title;
	}
	public String getArtist(){
		return artist;
	}
	public String getMedium(){
		return medium;
	}
}