public class Prime2
{
	static boolean checkPrime(int n)
	{
		if(n==0||n==1)
		{
			return false;
			}
			int count=0;
			for(int i=2; i<n; i++)
			{
				if(n % i==0)
				{
					count++;
					}
				}
				if(count==0)
				{
				return true;
				}
				return false;
				}
public static void main(String[] args)
{
	for(int i=0; i<=100; i++)
	{
		if(checkPrime(i))
		{ 
		System.out.println(i);
		}
		}
}
}
				