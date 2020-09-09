class Solution {
    public int balancedStringSplit(String s) 
    {
       int count=0;
        int lcounter = 0;
        int rcounter =0;
        for(int i=0;i<s.length();i++)
        {
            char cur = s.charAt(i);
            if(cur=='R')
            {
                rcounter++;
            }
            else if(cur=='L')
            {
                lcounter++;
            }
            if(rcounter==lcounter)
            {
                count++;
            }
        }
        return count;
    }
}
