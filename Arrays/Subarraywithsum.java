class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        ArrayList<Integer> list = new ArrayList<>();
        int left = 0;
        int sum = 0;
        int flag=0;
        int i;
        for(i=0;i<arr.length;i++)
        {
           if(arr[i]+sum<=s)
           {
               sum = sum + arr[i];
           }
           else
           {
               sum = sum+arr[i];
               while(sum>s)
               {
                   sum = sum - arr[left];
                   left++;
               }
           }
           if(sum==s)
           {
               list.add(left+1);
               list.add(i+1);
               return list;
           }
           
        }
        list.add(-1);
           return list;
    }
}
