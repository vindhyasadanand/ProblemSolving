class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int res[] = new int[2];
        for(int i=0;i<numbers.length;i++)
        {
            int cursum = target - numbers[i];
            if(map.containsKey(cursum))
            {
                
                res[0] = map.get(cursum) + 1;
                res[1] = i+1;
            }
            else
            {
                map.put(numbers[i],i);
            }
        }
        return res;
    }
}
