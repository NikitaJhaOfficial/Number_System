import java.util.Scanner;
public class Perfect
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int Sum = 0;
		for(int i=1; i<n; i++)
		{
			if(n%i==0)
			{
				Sum=Sum+i;
				}
				}
				if(Sum==n)
				{
				System.out.println("The number is perfect");
				}
					else
					{
						System.out.println("The number is not perfect");
						}
	}
}