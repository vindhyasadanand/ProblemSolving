class Solution 
{
    public List<List<Integer>> threeSum(int[] nums)
    {
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet();
        for(int i=0;i<nums.length;i++)
        {
            int start = i+1;
            int end = nums.length-1;
            while(start<end)
            {
                int sum = nums[start]+nums[i]+nums[end];
                if(sum==0)
                {
                    //it is going to return a fixed list
                    //this method will append a list to our output array
                    set.add(Arrays.asList(nums[start++],nums[i],nums[end--]));
                }
                else if(sum<0)
                {
                    start++;
                }
                else
                {
                    end--;
                }
            }
            
        }
        //it was hash set but return type is ArrayList
        //so we are creating an instance of ArrayList and we are passing inside set
        //so inorder to convert Set<List<Integer>> to List<List<Integer>>
        return new ArrayList(set);
    }
}