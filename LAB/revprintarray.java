import java.util.Scanner;

class revprintarray
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
		System.out.println("The elements in the array are:");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]+"\t");
		}
		System.out.println("The elements in the array are in reverse order:");
		for(int i=n-1;i>=0;i--)
		{
			System.out.println(arr[i]+"\t");
		}
	}
}
