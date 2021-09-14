import java.util.*;
public class Main
{
    
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the number");
	    int num = sc.nextInt();
	    int t1 = num;
	    
	    int len=0;
	    while(t1!=0)
	    {
	       int rem = t1%10;
	        t1 = t1/10;
	        len++;
	    }
	   int t2 = num;
	   int amst = 0;
	   while(t2!=0)
	   {
	      int rem = t2%10;
	       int mul =1;
	       for(int i=0;i<len;i++)
	       {
	           mul = mul * rem;
	       }
	       amst +=mul;
	       t2 = t2/10;
	   }
	   System.out.println(amst);
	 if(amst==num)
	 {
	     System.out.println("Amstrong number");
	 }
	 else{
	     System.out.println("Not an amstrong number");
	 }
	   
	}
}
