class Solution {
    public int missingNumber(int[] nums)
    {
        //find out xor of numbers from 1 to n
        int x1 = 0;
        for(int i=1;i<=nums.length;i++)
        {
            x1 = x1^i;
        }
        //to find out xor of array elements
        int x2=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            x2 = x2^nums[i];
        }
        return x1^x2;
    }
}
