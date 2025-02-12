import java.util.Scanner;

public class avgarray
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[4];
		System.out.println("Enter the elements in the array:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		double avg = (double)sum/arr.length; 
		System.out.println("The average of the elements in the array is"+avg);
	}
}
		
