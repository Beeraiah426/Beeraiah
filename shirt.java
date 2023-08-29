public class shirt
{
	public static void main(String[] args) {
	String name="shirt";
	System.out.println("name="+name);
	String brand="VeBNoR";
	System.out.println("brand="+brand);
	String color="Dusty_blue";
	System.out.println("color="+color);
        double actual_price=1849;
        double discount=84;
        discount=discount/100.0*actual_price;
        System.out.println("discount="+discount);
        actual_price=actual_price-discount;
        System.out.println("actual_price="+actual_price);
        double bank_offer=10;
        bank_offer=bank_offer/100.0*actual_price;
        System.out.println("bank_offer="+bank_offer);
        actual_price=actual_price-bank_offer;
        System.out.println("actual_price="+actual_price);
	double delivery_charges=55;
	delivery_charges=actual_price+delivery_charges;
	System.out.println("actual_price="+delivery_charges);
	
	}
}
