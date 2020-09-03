import java.util.*;
import java.lang.*;
import java.io.*;

class GFG 
{
    static void findMajority(int a[],int n)
    {
        int count = 1;
        int majority = a[0];
        for(int i=1;i<n;i++)
        {
            if(a[i]==majority)
            {
                count++;
            }
            else
            {
                count--;
            }
            if(count==0)
            {
                majority = a[i];
                count = 1;
            }
        }
        isMajority(a,majority,n);
        
    }
    static void isMajority(int a[],int majority,int n)
    {
        int count = 0;
        for(int i=0;i<n;i++)
        {
            if(a[i]==majority)
            {
                count++;
            }
        }
        int check = n/2;
        if(count>check)
        {
            System.out.println(majority);
        }
        else
        {
             System.out.println(-1);
        }
    }
	public static void main (String[] args) {
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
		    findMajority(a,n);
		}
	}
}
