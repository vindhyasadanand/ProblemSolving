import java.util.Arrays;
import java.util.Scanner;

public class CopyString 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = sc.nextLine();
		char st[] = s.toCharArray();
		int left = 0;
		int right = st.length-1;
		while(left<right)
		{
			char temp = st[left];
			st[left] = st[right];
			st[right]=temp;
			left++;
			right--;
		}
		System.out.println("After reversing"+" "+ new String(st));
	}

}
