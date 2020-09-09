import java.util.*;
import java.lang.*;
import java.io.*;

class GFG 
{
    static void print(int a[],int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    static void rotate(int a[],int n,int d)
    {
        int i,j;
        for( i=0;i<d;i++)
        {
            int temp = a[0];
            for( j=1;j<n;j++)
            {
               a[j-1] = a[j]; 
            }
            a[j-1] = temp;
        }
        print(a,n);
    }
    
    
	public static void main (String[] args)
    {
	      Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for(int i=0;i<tc;i++)
		{
		    int n = sc.nextInt();
		    int a[] = new int[n];
		    for(int j=0;j<n;j++)
		    {
		        a[j] = sc.nextInt();
		    }
		    int d = sc.nextInt();
		    rotate(a,n,d);
		}
	}
}
