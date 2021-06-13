class Solution {
    public String reverseWords(String s) 
    {
        StringBuffer sb = new StringBuffer();
        int i = s.length()-1;
        int j;
        while(i>=0)
        {
            if(s.charAt(i)==' ')
            {
                i--;
            }
            else
            {
                j=i;
                while(i>=0&&s.charAt(i)!=' ')
                {
                   i--;
                }
                if(sb.length()>0)
                {
                    sb.append(' ');
                }
               for(int k=i+1;k<=j;k++)
               {
                   sb.append(s.charAt(k));
               }
            }   
        }
        return sb.toString();
    }
}
