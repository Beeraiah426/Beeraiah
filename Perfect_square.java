class Perfect_square
{
	public static void main(String[] args)
	{
		int a=27;
		double b=Math.sqrt(a);
		System.out.println(b);
		if(a%b==0)
		{
			System.out.println("it is a perfect square");
		}	
		else
		{
			System.out.println("it is not a perfect square");
		}
	}
}