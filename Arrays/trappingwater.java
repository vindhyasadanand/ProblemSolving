class Solution {
    public int trap(int[] height)
    {
        
        int n = height.length;
        if(n==0)
        {
            return 0;
        }
        //this is maximum amount that can occupy
        int res = 0;  
        int l_max[] = new int[n];
        int r_max[] = new int[n];
        //to find l_max elements
        //we consider first ement as left max
        l_max[0] = height[0];
        for(int i=1;i<n;i++)
        {
            l_max[i] = Math.max(l_max[i-1],height[i]);
        }
        //we initialie last elemnt as right max element
        r_max[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--)
        {
            r_max[i] = Math.max(r_max[i+1],height[i]);
        }
        //now to calculate the amount of water
        for(int i=0;i<n;i++)
        {
            res +=Math.min(r_max[i],l_max[i]) - height[i];
        }
        return res;
    }
}
