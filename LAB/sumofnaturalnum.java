import java.util.Scanner;

public class sumofnaturalnum
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n,sum=0;
		System.out.println("Enter the number to print the sum of natural numbers:");
		n=sc.nextInt();
		for(int i=0;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println("The sum of first "+n+" natural numbers is "+sum);
	}
}
