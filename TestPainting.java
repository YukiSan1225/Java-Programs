import java.util.Scanner;
public class TestPainting
{
	public static void main (String[] args) {
    	Painting paintLife;
 		paintLife = getData();
    	displayPainting(paintLife);
    }
    public static Painting getData(){
    	Painting tPaint = new Painting();
    	String title, artist;
    	Scanner in = new Scanner(System.in);
    	System.out.println ("Enter the artist name: ");
    	artist = in.nextLine();
    	tPaint.setArtist(artist);
    	System.out.println ("Enter the title: ");
    	title = in.nextLine();
    	tPaint.setTitle(title);
    	return tPaint;
    }
	public static void displayPainting(Painting myP){
		System.out.println ("The creator of the painting " + myP.getTitle());
		System.out.println ("The title of the painting " + myP.getArtist());
	}
}