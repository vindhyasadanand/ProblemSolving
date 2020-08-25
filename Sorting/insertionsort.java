import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		Sort(arr,n);
	}

	private static void Sort(int[] arr, int n) 
	{
		for(int i=1;i<n;i++)
		{
			int value = arr[i];
			int hole = i;
			while(hole>0&&arr[hole-1]>value)
			{
				arr[hole] = arr[hole-1];
				hole = hole-1;
				
			}
			arr[hole] = value;
		}
		print(arr,n);
	}

	private static void print(int[] arr, int n) 
	{
		System.out.println("Array elements are");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}

}
/*
 Insertion sort 
 ->It is very useful when we feel list is almost sorted
 ->here array is divided into sorted and unsortedsublist
 
*/
