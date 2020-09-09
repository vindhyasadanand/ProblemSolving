import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    
    static void count(int a[],int n)
    {
        int ct =0;
        
        for(int i=0;i<n-1;i++)
        {
            ct = 0;
            for(int j = i+1;j<n;j++)
            {
                if(a[i]>a[j])
                {
                    ct++;
                }
            }
            System.out.print(ct+" ");
        }
        System.out.print("0"+" ");
        System.out.println();
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
		    count(a,n);
		}
	}
}
