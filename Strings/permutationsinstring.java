class Solution {
    public boolean checkInclusion(String s1, String s2)
    {
        int len1 = s1.length();
        int len2 = s2.length();
        
        if(len1>len2||len2==0)
        {
            return false;
        }
        if (len1==0)
        {
            return true;
        }
        int arr1[] = new int[26];
        int arr2[] = new int[26];
        for(int i=0;i<len1;i++)
        {
            arr1[s1.charAt(i)-'a']++;
            arr2[s2.charAt(i)-'a']++;
        }
        for(int i=len1;i<len2;i++)
        {
            if(Arrays.equals(arr1,arr2))
            {
                return true;
            }
            arr2[s2.charAt(i-len1)-'a']--;
            arr2[s2.charAt(i)-'a']++;
            
        }
        if(Arrays.equals(arr1,arr2))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
