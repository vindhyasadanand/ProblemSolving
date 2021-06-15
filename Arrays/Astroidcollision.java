class Solution 
{
    public int[] asteroidCollision(int[] asteroids)
    {
        Stack<Integer>st = new Stack<>();
        for(int i=0;i<asteroids.length;i++)
        {
            //if element is positive then we can directly added it to stack
            if(asteroids[i]>0)
            {
                st.push(asteroids[i]);
            }
            else
            {
                //if element is negative and its magnitude is grater than top element
                while(!st.isEmpty()&&st.peek()>0&&Math.abs(asteroids[i])>st.peek())
                {
                    st.pop();
                }
                if(st.isEmpty()||st.peek()<0)
                {
                    st.push(asteroids[i]);
                }
                
                if(st.peek()==Math.abs(asteroids[i]))
                {
                    st.pop();
                }
            }
        }
        int len = st.size();
        int res[] = new int[len];
        int j = len-1;
        while(!st.isEmpty())
        {
            res[j--] = st.pop();
        }
        return res;
    }
}
