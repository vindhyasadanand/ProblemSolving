class Solution {
    public int[] twoSum(int[] nums, int target)
    {
        int i,req_sum;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for( i=0;i<nums.length;i++)
        {
            req_sum = target - nums[i];
            if(map.containsKey(req_sum))
            {
               return new int[]{i,map.get(req_sum)}; 
            }
            else
            {
                map.put(nums[i],i);
            }
        }
       throw new IllegalArgumentException("No two sum solution");
    }
}
