class Simple_intrest
{
	public static void main(String[] args)
	{
		double p=15,t=20,r=25;
		double simple_intrest=p*t*r/100;
		System.out.println(simple_intrest);
		double a=(1+r/100);
		System.out.println(a);
		double d=Math.pow(a,t);
		System.out.println(d);
		a=d*p;
		System.out.println(a);
		double CI=a-p;
		System.out.println(CI);
	
	}
}