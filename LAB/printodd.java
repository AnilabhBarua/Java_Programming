import java.util.Scanner;

class printodd
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
		System.out.println("The elements in odd position are:");
		for(int i=0;i<n;i++)
		{
			if(i%2==1)
			{
				System.out.println(arr[i]);
			}
		}
	}
}
		
