import java.util.*;
import java.lang.*;
import java.io.*;
class GFG 
{
       static void findLargest(int arr[],int n)
      {
        int largest = 0;
        int result = -1;
        for(int i=1;i<n;i++)
        {
            if(arr[i]>arr[largest])
            {
                 result = largest;
                largest = i;
               
            }
            else if(arr[i]!=arr[largest])
            {
                if(result ==-1 || arr[i]>arr[result])
                {
                   result = i;
                }
            }
        }
        if(result!=-1)
        {
            System.out.println(arr[result]);
        }
        else
        {
            System.out.println("-1");
        }
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
	        findLargest(arr,n);
	    }
	   	
	}
}
