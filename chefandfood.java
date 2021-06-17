import java.util.*;
class Codechef
{
public static void main (String[] args) throws java.lang.Exception
{
Scanner scan = new Scanner(System.in);
int t = scan.nextInt();

	for(int z=0;z<t;z++){
	    int n = scan.nextInt();
	    int biggest = 0;
	    for(int i=0;i<n;i++){
	         int s = scan.nextInt();
	         int p = scan.nextInt();
	         int v = scan.nextInt();
	         int cost = 0;
	         cost = (p/(s+1))*v;
	         biggest = Math.max(cost,biggest);
	    }
	    System.out.println(biggest);
	}
}
}
