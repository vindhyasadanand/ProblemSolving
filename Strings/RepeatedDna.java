class Solution {
    public List<String> findRepeatedDnaSequences(String s) 
    {
       HashSet<String> seen = new HashSet<>();
        HashSet<String> repeated = new HashSet<>();
        for(int i=0;i<s.length()-9;i++)
        {
            String cur = s.substring(i,i+10);
            if(seen.contains(cur))
            {
                repeated.add(cur);
            }
            else
            {
                seen.add(cur);
            }
        }
        return new ArrayList(repeated);
    }
}
