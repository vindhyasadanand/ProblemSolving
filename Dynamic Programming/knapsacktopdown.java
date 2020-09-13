import java.util.*;
import java.lang.*;
import java.io.*;

class GFG 
{
    
    
    static void knapsack(int wt[],int val[],int w,int n)
    {
       int t[][] = new int[n+1][w+1];
       for(int i=0;i<n+1;i++)
       {
           for(int j=0;j<w+1;j++)
           {
               if(i==0||j==0)
               {
                   t[i][j] = 0;
               }
               
           }
       }
       for(int i=1;i<n+1;i++)
       {
           for(int j=1;j<w+1;j++)
           {
               if(wt[i-1]<=j)
               {
                   t[i][j] = Math.max(val[i-1]+t[i-1][j-wt[i-1]], t[i-1][j]);
               }
               else
               {
                   t[i][j] = t[i-1][j];
               }
           }
       }
	   System.out.println(t[n][w]); 
    }
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for(int i=0;i<tc;i++)
		{
		    int n = sc.nextInt();
		    int capacity = sc.nextInt();
		    int val[] = new int[n];
		    for(int j=0;j<n;j++)
		    {
		        val[j] = sc.nextInt();
		    }
		    int w[] = new int[n];
		    for(int k=0;k<n;k++)
		    {
		        w[k] = sc.nextInt();
		    }
		   
		 knapsack(w,val,capacity,n);
		}
	}
}