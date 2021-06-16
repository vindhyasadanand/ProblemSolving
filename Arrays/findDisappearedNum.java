class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) 
    {
        //1.iterate through array and whenever we get a particular number
        //2.go to that index and make it as negate
        //3.Iterate through the entire Array and  which element indicaes are 
        //still positive and those indeces
        for(int i=0;i<nums.length;i++)
        {
           int cur = .abs(nums[i]);
           nums[cur-1] = -(.abs(nums[cur-1]));
            
        }
         ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
           if(nums[i]>0)
           {
               list.add(i+1);
           }
            
        }
        return list;
    }
}
