import java.util.Scanner;

public class bubblesort{
	public static void main(String[] argv){
		Scanner sc = new Scanner(System.in);
		int n,temp;
		System.out.println("Enter the size of the array:");
		n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the numbers in the array:");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n-1;i++){
			for(int j=i+1;j<n;j++){
				if(arr[i]>arr[j]){
					temp=arr[i];	
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
			
		System.out.println("The array after bubblesorting:");	
		for(int i=0;i<n;i++){
			System.out.println(arr[i]);
		}
		
		sc.close();
	}
}
