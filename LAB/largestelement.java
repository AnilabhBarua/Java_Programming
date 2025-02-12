import java.util.Scanner;

class largestelement
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the size of the array:");
		n=sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements in the array:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
			else
			{
				max=arr[0];
			}
		}
		System.out.println("The largest element in the array is"+max);
	}
}
		
