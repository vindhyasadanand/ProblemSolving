class Solution {
    public int[] sortedSquares(int[] nums)
    {
        int left = 0;
        int res[] = new int[nums.length];
        int right = nums.length-1;
        int count=nums.length-1;
        while(left<=right)
        {
             int lsq = nums[left]*nums[left];
            int rsq = nums[right]*nums[right];
            if(lsq>rsq)
            {
                res[count] = lsq;
                left++;
            }
            else
            {
                res[count] = rsq;
                right--;
            }
            count--;
        }
        return res;
    }
}
