class Solution {
    public int[][] merge(int[][] intervals) 
    {
        if(intervals.length<2){
            return intervals;
        }
        Arrays.sort(intervals,
                    
    (arr1,arr2)->Integer.compare(arr1[0],arr2[0]));
        ArrayList<int[]> output_arr = new ArrayList();
        int cur_interval[]=intervals[0];
        output_arr.add(cur_interval);
        
        for(int interval[]:intervals)
        {
            int cur_begin=cur_interval[0];
            int cur_end =cur_interval[1];
            int next_begin=interval[0];
            int next_end = interval[1];
            if(cur_end>=next_begin){
                cur_interval[1]=Math.max(cur_end,next_end);
            }
            else
            {
                cur_interval = interval;
                output_arr.add(cur_interval);
            }
            
        }
        return output_arr.toArray(new int[output_arr.size()][]);
    }
}

/* 
Here basically we compare one interval with next interval
if 2nd lement of the first interval is grater than 1st element of second interval we merge it

*/
