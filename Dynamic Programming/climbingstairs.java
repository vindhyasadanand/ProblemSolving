class Solution {
    public int climbStairs(int n) 
    {
        int memo[] = new int[n+1];
        Arrays.fill(memo,-1);
        return countways(n,memo);
    }
    int countways(int n,int memo[])
    {
        if(n<0)
        {
            return 0;
        }
        else if(n==0)
        {
            return 1;
        }
        else if(memo[n]>-1)
        {
            return memo[n];
        }
        else
        {
            memo[n] = countways(n-1,memo) + countways(n-2,memo);
        
        }
        return memo[n];
    }
}
