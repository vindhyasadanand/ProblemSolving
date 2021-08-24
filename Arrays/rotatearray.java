class Solution {
    public void rotate(int[] nums, int k) {
         k = k%nums.length;
        //to reverse entire array
        reverse(nums,0,nums.length-1);
        //to reverse left part
        reverse(nums,0,k-1);
        //to reverse right part
        reverse(nums,k,nums.length-1);
    }  
       public void reverse(int nums[],int s,int e)
        {
            while(s<e)
            {
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }
        
        
    
}
