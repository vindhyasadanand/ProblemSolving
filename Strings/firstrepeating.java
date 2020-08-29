import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static void findReap(String s)
    {
        char str [] = s.toCharArray();
        HashSet<Character> set = new HashSet<>();
        int i=0;
        while(i<str.length)
        {
            if(set.contains(str[i]))
            {
               System.out.println(str[i]);
               return;
            }
            else
            {
                set.add(str[i]);
            }
            i++;
        }
        System.out.println("-1");
    }
	public static void main (String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    int tc = sc.nextInt();
	    for(int i=0;i<tc;i++)
	    {
	        String s = sc.next();
	        findReap(s);
	    }
	}
}
