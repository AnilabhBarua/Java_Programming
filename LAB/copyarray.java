import java.util.Scanner;

public class copyarray
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int size;
		System.out.println("Enter the size of the array:");
		size=sc.nextInt();
		int []arr1=new int[size];
		int []arr2=new int[size];
		System.out.println("Enter the numbers in the array:");
		for(int i=0;i<size;i++)
		{
			arr1[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			arr2[i]=arr1[i];
		}
		System.out.println("The copied elements in the new array are:");
		for(int i=0;i<size;i++)
		{
			System.out.println(arr2[i]);
		}
	}
}
		
