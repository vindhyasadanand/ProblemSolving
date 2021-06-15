class Solution {
    public int lengthOfLastWord(String s) 
    {
        String cur = s.trim();
        int count=0;
        for(int i=cur.length()-1;i>=0;i--)
        {
            if(cur.charAt(i)!=' ')
            {
                count++;
            }
            else
            {
                break;
            }
        }
        return count;
    }
}
