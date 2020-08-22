import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static String swap(String str,int left,int right)
    {
        char temp;
        char charArray[] = str.toCharArray();
        temp = charArray[left];
        charArray[left] = charArray[right];
        charArray[right] = temp;
        return String.valueOf(charArray);
    }
    public static void calculate(String str,int left,int right)
    {
    	
        if(left==right)
        {
            System.out.println(str);
            
        }
        else
        {
            for(int i=left;i<=right;i++)
            {
                String swapped = swap(str,left,i);
                calculate(swapped,left+1,right);
            }
        }
    }
	public static void main (String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    System.out.println("enter test cases");
	    int ts = sc.nextInt();
	    for(int i=0;i<ts;i++)
	    {
	    	  System.out.println("enter the string");
	        String str = sc.next();
	        calculate(str,0,str.length()-1);
	        
	    }
	}
	
}
