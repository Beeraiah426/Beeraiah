class Greater
{
	public static void main(String[] args)
	{
		double a=1500,b=500,discount=10;
		if(a>b)
		{
			discount=10.0/100*a;
			System.out.println(discount);
		}	
		else
		{
			System.out.println("discount=" +discount);
		}
	}
}