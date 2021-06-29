class Solution {
    public int characterReplacement(String s, int k) 
    {
        HashMap<Character,Integer> map = new HashMap<>();
        int maxlength = 0;
        int left=0;
        int mostrepeated = 0;
        for(int right=0;right<s.length();right++)
        {
            char rightchar = s.charAt(right);
            map.put(rightchar,map.getOrDefault(rightchar,0)+1);
             mostrepeated = Math.max(map.get(rightchar),mostrepeated);
            if(right-left+1-mostrepeated>k)
            {
                char begin = s.charAt(left);
                map.put(begin,map.get(begin)-1);
                left++;
            }
            maxlength = Math.max(maxlength,right-left+1);
            
        }
        return  maxlength;
    }
}
