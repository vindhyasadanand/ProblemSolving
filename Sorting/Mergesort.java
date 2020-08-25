import java.util.Scanner;
class MergeSort 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter no of elements");
		int n=scan.nextInt();
		int[] a=new int[n];
		System.out.println("Enter the elements of Array");
       for(int i=0;i<n;i++)
       {
    	   a[i] = scan.nextInt();
       }
		Mergesort(a,0,n-1);
		// recording the end time
		
		display(a);


	}// end main
		
	private static void display(int[] a)
	{
		// TODO Auto-generated method stub
		System.out.println("the sorted array is");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		
	}//end dispaly

	//function o divide the array
	public static void Mergesort(int[] a, int low, int high)
	{
		int mid;
		if(low<high)// array contains more than one element
		{
			mid=(low+high)/2;// dividing the array in to two sub arrays
			Mergesort(a, low, mid);// sorting sub arrays
			Mergesort(a, mid+1, high);
			Merge(a,low,mid,high);// combining or merging the sorted arrays
		}
	}// end Mergesort

	//function to merge two sorted arrays
	public static void Merge(int[] arr,int low,int mid,int high) 
	{
		int k,h=low,i=low,j=mid+1;
		int[] b=new int[arr.length];
		while(h<=mid && j<=high)
		{
			if(arr[h]<=arr[j])
			{
				b[i]=arr[h];
				h++;
			}
			else
			{
				b[i]=arr[j];
				j++;
			}
			i++;
		}// end while
		if(h>mid) // for remaining elements in upper half
		{
			for(k=j;k<=high;k++)
			{
				b[i]=arr[k];
				i++;
			}
		}
		else // for remaining elements in lower half
		{
			for(k=h;k<=mid;k++)
			{
				b[i]=arr[k];
				i++;
			}		
		}
		//copy the contents from auxiliary array i.e. from b to arr 
		for(k=low;k<=high;k++)
			arr[k]=b[k];
	}// end merge
}// end MergeSort class


