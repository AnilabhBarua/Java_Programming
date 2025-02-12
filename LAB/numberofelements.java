import java.util.Scanner;

class numberofelements
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
		System.out.println("The number of elements in the array is"+arr.length);
	}
}
		
