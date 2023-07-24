import java.util.Scanner;
public class Addition
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the value of a :");
int a = sc.nextInt();
System.out.println("Enter the value of b:");
int b = sc.nextInt();
int c = a+b;
System.out.println("The sum is :"+" "+c);
}
}