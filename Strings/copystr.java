import java.util.Arrays;
import java.util.Scanner;

public class CopyString 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char s1[] = s.toCharArray();
		int length = s1.length;
		char s2[] = new char[length];
		for(int i=0;i<length;i++)
		{
			s2[i]=s1[i];
		}
		System.out.println("After copying s2 will be"+Arrays.toString(s2));
		
	}

}
