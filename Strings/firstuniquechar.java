class Solution {
    public int firstUniqChar(String s) 
    {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char cur = s.charAt(i);
            if(map.containsKey(cur))
            {
                map.put(cur,map.getOrDefault(cur,0)+1);
            }
            else
            {
                map.put(cur,1);
            }
        }
        int index=-1;
        for(int i=0;i<s.length();i++)
        {
            if(map.get(s.charAt(i))==1)
            {
                index=i;
                break;
            }
        }
        return index;
    }
}
