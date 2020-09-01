import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void maxdiff(int a[],int n)
    {
       int max_diff = a[1]-a[0];
       int min_ele = a[0];
       for(int j=1;j<n;j++)
       {
           max_diff = Math.max(max_diff, a[j]- min_ele );
           min_ele = Math.min(min_ele,a[j]);
       }
       System.out.println(max_diff);
    }
	public static void main (String[] args) 
	{
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the test cases");
	   int tc = sc.nextInt();
	   for(int i=0;i<tc;i++)
	   {
	       int n = sc.nextInt();
	       int a[] = new int[n];
	       for(int j=0;j<n;j++)
	       {
	           a[j] = sc.nextInt();
	          
	       }
	        maxdiff(a,n);
	   }
	}
}
