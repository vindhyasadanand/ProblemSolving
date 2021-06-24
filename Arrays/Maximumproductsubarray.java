class Solution {
    public int maxProduct(int[] nums)
    {
       int maxproduct = nums[0];
        int minproduct = nums[0];
        int ans= nums[0];
        int choice1,choice2;
        for(int i=1;i<nums.length;i++)
        {
            choice1 = maxproduct*nums[i];
            choice2 = minproduct*nums[i];
             maxproduct = Math.max(nums[i],Math.max(choice1,choice2));
            minproduct = Math.min(nums[i],Math.min(choice1,choice2));
            ans = Math.max(ans,maxproduct);
        }
        return ans;
    }
}
