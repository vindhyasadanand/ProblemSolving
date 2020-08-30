import java.util.*;
import java.lang.*;
import java.io.*;

class GFG
{
    static void reverse(String s)
    {
        int low =0;
       int high = s.length()-1;
        char temp;
        char[] str = s.toCharArray();
        while(low<high)
        {
            temp = str[low];
            str[low] = str[high];
            str[high]  = temp;
            low++;
            high--;
        }
        System.out.println(new String(str) );
    }
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
	    int tc = sc.nextInt();
	    for(int i=0;i<tc;i++)
	    {
	        String s = sc.next();
	        
	        reverse(s);
	    }
	}
}
