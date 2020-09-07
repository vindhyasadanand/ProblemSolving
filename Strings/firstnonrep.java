class Solution 
{
    public int firstUniqChar(String s) 
    {
        int count[] = new int[256];
		for(int i=0;i<256;i++)
		{
			count[i] = -1;
		}
		char s1[] = s.toCharArray();
		for(int i=0;i<s1.length;i++)
		{
			int cur = s1[i];
			if(count[cur]==-1)
			{
				count[cur] = i;
			}
			else
			{
				count[cur] = -2;
			}
		}
		int res = Integer.MAX_VALUE;
		for(int i=0;i<256;i++)
		{
			if(count[i]>=0)
			{
				res = Math.min(res, count[i]);
			}
		}
		return (res==Integer.MAX_VALUE)? -1 : res;
	}

    
}
