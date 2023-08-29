class Application
{
	public static void main(String[] args)
	{
		string store="Beeraiah";
		string name="realme";
		double actual_price=15999;
		double bank_offer=16;
		if(actual_price>20000)
		{
			bank_offer=16.0/100*actual_price;
			actual_price=actual_price-bank_offer;
			System.out.println("actual_price="+actual_price);
		}	
		else
		{
			discount=5.0/100*1500;
			System.out.println("actual_price=" +actual_price);
		}
	}
}