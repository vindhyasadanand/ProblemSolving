import java.util.Arrays;

public class Triplet {

	public static void main(String[] args)
	{
		int arr[] = {0, -1, 2, -3, 1};
		// TODO Auto-generated method stub
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			int start = i+1;
			int end = arr.length-1;
			while(start<end)
			{
				if(arr[i]+arr[start]+arr[end]==0)
				{
					System.out.println("True");
					System.exit(0);
				}
				else if(arr[i]+arr[start]+arr[end]<0)
				{
					start++;
				}
				else
				{
					end--;
				}
			}
		}

	}

}

