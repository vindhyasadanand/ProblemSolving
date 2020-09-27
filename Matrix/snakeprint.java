import java.util.*;
import java.lang.*;
import java.io.*;

class GFG
{
     static void snakepatt(int mat[][],int n)
      {
          for(int i=0;i<n;i++)
          {
              if(i%2==0)
              {
                  for(int k=0;k<mat[i].length;k++)
                  {
                      System.out.print(mat[i][k] + " ");
                  }
              }
              else
              {
                  for(int j=n-1;j>=0;j--)
                  {
                      System.out.print(mat[i][j]+ " ");
                  }
              }
              System.out.println();
          }
          
      }
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for(int i=0;i<tc;i++)
		{
		    int n = sc.nextInt();
		    int mat[][] = new int[n][n];
		    for(int k=0;k<n;k++)
		    {
		        for(int j=0;j<n;j++)
		        {
		            mat[k][j] = sc.nextInt();
		        }
		    }
		    snakepatt(mat,n);
		}
		
		
	}
}
