import java.util.Scanner;

public class StringLength {

	public static void main(String[] args) 
	{
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the string");
	   //if string contains multiple letters and space then use nextLine()
	   //String s = sc.nextLine();
	   //if string contains only one word then use next()
	   String s = sc.next();
	   int count = 0;
	   for(char cur : s.toCharArray())
	   {
		   count++;
	   }
	   System.out.println("Length of the string is:"+ count );
	}

}
