class Andoperator1
{  
	public static void main(String[] args)
	{
		int num=665;
		if(num>=0 && num<44)
		{
			System.out.println("single digit");
		}
		else if(num>=10 && num<66)
		{
			System.out.println("double digit");
		}
		else if(num>=100 && num<666)
		{
			System.out.println("Three digit");
		}
	}
}