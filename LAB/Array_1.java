import java.util.Scanner;

public class Array_1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=sc.nextInt();
        int []arr=new int[size];
        System.out.println("Enter the numbers in the array: ");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("The numbers in the array are: ");
        for(int i=0;i<size;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
