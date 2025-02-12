import java.util.Scanner;

public class posneg
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int number;
		System.out.println("Enter the number:");
		number=sc.nextInt();
		if(number>0)
		{
			System.out.println("The number is positive");
		}
		else if(number<0)
		{
			System.out.println("The number is negative");
		}
		else
		{
			System.out.println("The number is neither positive nor negative");
		}
	}
}
