class Spy
{
	public static void main(String args[])
	{
		int num=123;
		int sum=0, rem,mul=1;	
		while (num>0)
		{
			rem=num%10;
			sum=sum+rem;
			mul = mul * rem;
        			num = num / 10;
		}
		if (sum==mul)
			System.out.println("Spy Number");
		else
			System.out.println("Not Spy");
	}
}