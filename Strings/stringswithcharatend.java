import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
   
	public static void main (String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for(int j=0;j<tc;j++)
		{
		    String s = sc.next();
		    
		     
	        String s1 = "";
	        int len = s.length();
	        
	        for(int i =len-1;i>=0;i--)
	        {
	            int cur = s.charAt(i);
	            if(cur>= 48 && cur <= 57)
	            {
	                
	            }
	            else
	            {
	                s1 += s.substring(i+1,len);
	                break;
	            }
	        }
	        int x = Integer.valueOf(s1);
	        if(len-s1.length() == x)
	            System.out.println("1");
	        else
	            System.out.println("0");
	    }
		
	}
}
