public class FahrenheitToCelsius
{
	public static void main (String[] args) {
		int F = 160;
		double C;
		
		C = F - 32;
		C = C * 5/9;
		
		System.out.println ("Fahrenheit = " + F + "*F");
		System.out.println ("Celcius = " + C + "*C");
    }
}