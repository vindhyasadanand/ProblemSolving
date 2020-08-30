import java.util.*;
import java.lang.*;
import java.io.*;

class GFG 
{
    static void print(int arr[],int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void moveZeros(int arr[],int n)
    {
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                arr[count] = arr[i];
                count++;
            }
            
        }
        while(count<n)
        {
            arr[count]=0;
            count++;
        }
        print(arr,n);
    }
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for(int i=0;i<tc;i++)
		{
		    int n = sc.nextInt();
		    int arr[] = new int[n];
		    for(int j=0;j<n;j++)
		    {
		        arr[j] = sc.nextInt();
		    }
		    moveZeros(arr,n);
		}
	}
}
