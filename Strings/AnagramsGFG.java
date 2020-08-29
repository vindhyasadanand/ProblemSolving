import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void isAnagram(String s,String t)
    {
        //if lenght of strings are not equal then it is not an anagram
        if(s.length()!=t.length())
        {
            System.out.println("NO");
            return;
            
        }
        int flag = 1;
        int count[] = new int[256];
        int val;
        for(int i=0;i<s.length();i++)
        {
            val = s.charAt(i);
            count[val]++;
        }
        for(int j=0;j<t.length();j++)
        {
            val = t.charAt(j);
            count[val]--;
        }
        for(int i=0;i<256;i++)
        {
            if(count[i] != 0)
            {
                flag =0;
                
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("NO");
        }
        else
        {
             System.out.println("YES");
        }
    }
	public static void main (String[] args)
	{
	  Scanner sc = new Scanner(System.in);
	  int tc = sc.nextInt();
	  for(int i=0;i<tc;i++)
	  {
	      String str = sc.next();
	      String t = sc.next();
	      isAnagram(str,t);
	  }
	}
}
