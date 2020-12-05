static boolean findsum(int arr[],int n)
{
    //Your code here
   Set<Integer> set = new HashSet<>();
    int sum = 0;
    for(int i=0;i<n;i++)
    {
        sum = sum + arr[i];
        if(sum==0||arr[i]==0||set.contains(sum))
        {
            return true;
        }
        set.add(sum);
    }
    return false;
}
