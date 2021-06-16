class Solution {
    public int longestkSubstr(String s, int k) {
        
        //check for string is null and also for length of string is zero
        //and to check length of string less than window size
        if(s==null || s.length()==0||s.length()<k )
        {
            return -1;
        }
        Map<Character,Integer> map = new HashMap<>();
        int maxlength = 0;
        int wstart = 0;
        for(int wend=0;wend<s.length();wend++)
        {
            char rightchar = s.charAt(wend);
            //untill map size becomes grater than k we need to add 
            map.put(rightchar,map.getOrDefault((rightchar),0)+1 );
            //when size of window becomes grater than k
            while(map.size()>k&&wstart<s.length())
            {
                char leftchar = s.charAt(wstart);
                map.put(leftchar,map.get(leftchar)-1);
                if(map.get(leftchar)==0)
                {
                    map.remove(leftchar);
                }
                wstart++;
            }
            
            
           maxlength = Math.max(maxlength,wend-wstart+1);
           
            
        }
       if(map.size()==k)
       {
           return maxlength;
       }
       return -1;
    }
}
