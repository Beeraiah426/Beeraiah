class Days_inmonth
{
	publi static void main(String[] args)
	{
		int year=2000,month;
		if(month==2)
		{
			if(year%4==0)
			{
				System.out.println("Month 28 days");
			}
		}
		else if(month==1 ||month==3 || month==5 || month==7 ||month==8 ||month==10 || month==12)
		{
			System.out.println("31 days");
		}
		else
		{
			System.out.println("30 days");
		}	
	}
}