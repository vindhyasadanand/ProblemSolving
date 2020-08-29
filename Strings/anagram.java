import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {

	    static void isAnagram(String s,String t)
        {
        //if lenght of strings are not equal then it is not an anagram
        if(s.length() != t.length())
        {
            System.out.println("NO");
            return;
            
        }
        s = s.replace("  ","");
        t = t.replace("  ","");
        s = s.toLowerCase();
        t = t.toLowerCase();
        char s1[] = s.toCharArray();
        char s2[] = t.toCharArray();
       
        Arrays.sort(s1);
        Arrays.sort(s2);
        boolean b = Arrays.equals(s1,s2);
      if(b==true)
      {
          System.out.println("YES");
          
      }
      else
      {
           System.out.println("NO");
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
