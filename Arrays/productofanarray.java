class Solution {
    public int[] productExceptSelf(int[] nums) 
    {
        int len = nums.length;
        int res[] = new int[len];
        
        
        //to calculate the cumilative multiplication
        int product = 1;
        for(int i=0;i<len;i++)
        {
            product = product*nums[i];
            res[i] = product;
        }
        
        //to calculate the actual product we start from the end
        product = 1;
        for(int i=len-1;i>0;i--)
        {
            res[i] = res[i-1]*product;
            product = product*nums[i];
        }
        res[0] = product;
        return res;
    }
}
