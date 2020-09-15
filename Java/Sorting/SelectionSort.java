import java.util.Scanner;

/*
 * Algorithm
 * -> first we will find minimum element in the Array
 * ->Swap smallest Element by element at the zeroth index for first time
 * ->repeat above Process
 */
/*
 * time complexity O(N^2)
 * Space complexity O(1)
 */
public class SelectionSort
{
	public static void PrintArray(int a[],int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i] + " ");
		}
	}
	public static void Sort(int a[],int n)
	{
		
		for(int i=0;i<n-1;i++)
		{
			int imin = i;
			for(int j=i+1;j<n;j++)
			{
				if(a[j]<a[imin])
				{
					imin = j;
				}
			}
			int temp = a[i];
			a[i]=a[imin];
			a[imin]=temp;
			
		}
		PrintArray(a,n);
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements of the array");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter array Elements");
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		Sort(a,n);
	}
	

}
