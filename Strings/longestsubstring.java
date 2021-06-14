class Solution {
    public int lengthOfLongestSubstring(String s)
    {
        int windowstart = 0;
        int maxlength = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(int windowend =0;windowend<s.length();windowend++ )
        {
             char rightchar = s.charAt(windowend);
            if(map.containsKey(rightchar))
            {
                windowstart = Math.max(windowstart,map.get(rightchar)+1);
            }
            map.put(rightchar,windowend);
            maxlength = Math.max( maxlength,windowend-windowstart+1);
        }
        return maxlength;
    }
}
