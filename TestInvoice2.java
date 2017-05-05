//Damien Burks

public class TestInvoice2
{
	public static void main (String[] args) {
    	Invoice2 test1 = new Invoice2(6078,2500.34,3,9,2015);
    	Invoice2 test2 = new Invoice2(978,2500.34,3,32,2011);
    	Invoice2 test3 = new Invoice2(4590, 0.94, 13, 0, 1977);
    	Invoice2 test4 = new Invoice2(10000, 25695.87, 2, 30,2017);
    	test1.displayData2();
    	test2.displayData2();
    	test3.displayData2();
    	test4.displayData2();
    }
}