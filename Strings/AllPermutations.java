import java.util.Scanner;

public class Permutations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.next();
		int n = str.length();
		calculatePermutation(str,0,n-1);
		

	}

	private static void calculatePermutation(String str, int left, int right)
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
				
				calculatePermutation(swapped,left+1,right);
			}
		}
		
	}

	private static String swap(String str, int left, int right) {
		char temp;
		char []charArray = str.toCharArray();
		temp = charArray[left];
		charArray[left] = charArray[right];
		charArray[right] = temp;
		return String.valueOf(charArray);
		
	}


}
