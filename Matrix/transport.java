
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG 
{
    static void printmat(int mat[][])
    {
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[i].length;j++)
            {
                System.out.print(mat[i][j] + " ");
            }
        }
        System.out.println();
    }
   static void transpose(int mat[][],int n)
   {
       for(int i=0;i<n;i++)
       {
           for(int j=i+1;j<mat[i].length;j++)
           {
               int temp = mat[i][j];
               mat[i][j] = mat[j][i];
               mat[j][i] = temp;
           }
       }
       printmat(mat);
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
		    transpose(mat,n);
		}
	}
}