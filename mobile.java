public class mobile
{
	public static void main(String[] args) {
	String shopname="Beeraiah";
	System.out.println("shopname= "+ shopname);
	String mobilename="Realme";
	System.out.println("mobilename= "+mobilename);
	double actual_price=18000;
	double discount=10;
	discount=discount/100*actual_price;
	System.out.println("actual price= "+actual_price);
	System.out.println("discount= "+discount);
	actual_price=actual_price-discount;
	System.out.println("actual_price= "+actual_price);
	double gst=5;
	gst=gst/100*actual_price;
	System.out.println("gst= "+gst);
	actual_price=actual_price+gst;
	System.out.println("actual_price= "+actual_price);
	}
}
