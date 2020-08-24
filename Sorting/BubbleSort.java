import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		Sort(arr,n);
	}

	private static void Sort(int[] arr, int n) {
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		print(arr,n);
	}

	private static void print(int[] arr, int n) {
	  System.out.println("Array elements are");
	  for(int i=0;i<n;i++)
	  {
		  System.out.print(arr[i]+" ");
	  }
		
	}

}
