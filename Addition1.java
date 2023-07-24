import java.util.Scanner;
public class Addition1
{
	static int add(int a,int b)
	{
		int sum=a+b;
		return sum;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("first digit:");
		int a = sc.nextInt();
		System.out.print("enter the second digit:");
		int b = sc.nextInt();
		System.out.print(add(a,b));
		}
}