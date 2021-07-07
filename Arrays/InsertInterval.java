class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) 
    {
       ArrayList<int[]> result = new ArrayList<>();
        for(int []slots:intervals)
        {
            //if newInterval is smaller than current one
            if(slots[0]>newInterval[1])
            {
                result.add(newInterval);
                newInterval = slots;
            }
            //if newinterval is grater than current slot
            else if(slots[1]<newInterval[0])
            {
               result.add(slots); 
            }
            else
            {
                //means it is now overlapping
                newInterval[0] = Math.min(newInterval[0],slots[0]);
                newInterval[1] = Math.max(newInterval[1],slots[1]);
                
            }
            
        }
        result.add(newInterval);
        return result.toArray(new int[result.size()][]);
        
    }
}
