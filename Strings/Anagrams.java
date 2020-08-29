class Solution 
{
    public boolean isAnagram(String s, String t) 
    {
        if(s.length()!=t.length())
        {
            return false;
        }
        int count[] = new int[256];
        int val;
        for(int i=0;i<s.length();i++)
        {
            val = s.charAt(i);
            count[val]++;
        }
        for(int j=0;j<t.length();j++)
        {
            val = t.charAt(j);
            count[val]--;
        }
        for(int i=0;i<256;i++)
        {
            if(count[i]!=0)
            {
                return false;
            }
            
        }
        return true;
    }
}