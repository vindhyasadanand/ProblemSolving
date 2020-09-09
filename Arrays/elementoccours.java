import java.util.*;
import java.lang.*;
import java.io.*;

class GFG
{
    static void count(int a[],int n)
    {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(a[i]))
            {
                map.put(a[i],map.getOrDefault(a[i],0)+1);
            }
            else
            {
                map.put(a[i],1);
            }
        }
        //to get key with value one
        for(Map.Entry<Integer,Integer>entry : map.entrySet())
        {
            if(entry.getValue()==1)
            {
                System.out.println(entry.getKey());
                return;
            }
        }
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
