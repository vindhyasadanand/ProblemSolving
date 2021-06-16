class Solution {
    public List<Integer> findDuplicates(int[] nums) 
    {
         ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            int cur = Math.abs(nums[i]);
           if(nums[cur-1]<0)
           {
               list.add(cur);
           }
           else
           {
               nums[cur-1] =-(nums[cur-1]);
           }
        }
       
       
        return list;
    }
}
