class Solution 
{
    public void swap(int index,int i,int nums[])
    {
        int temp = nums[i];
        nums[i] = nums[index];
        nums[index] = temp;
        
    }
    public void recpermutate(int index,int nums[],List<List<Integer>> list)
    {
        if(index==nums.length)
        {
            List<Integer>l1 = new ArrayList<>();
            for(int i=0;i<nums.length;i++)
            {
                l1.add(nums[i]);
            }
            list.add(l1);
            return;
        }
        for(int i=index;i<nums.length;i++)
        {
            swap(i,index,nums);
            recpermutate(index+1,nums,list);
             swap(i,index,nums);
        }
        
    }
    public List<List<Integer>> permute(int[] nums)
    {
        List<List<Integer>> list = new ArrayList<>();
         recpermutate(0,nums,list);
        return list;
    }
}
