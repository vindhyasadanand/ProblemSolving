class Solution {
    public boolean isValid(String s) 
    {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
             char cur = s.charAt(i);
            if(cur=='('||cur=='{'||cur=='[')
            {
                st.push(cur);
                
            }
            else
            {
                if(st.isEmpty())
                {
                    return false;
                }
                char top = st.peek();
                if(top=='('&&cur==')'||top=='{'&&cur=='}'|| top=='['&&cur==']')
                {
                    st.pop();
                }
                else
                {
                    return false;
                }

                
            }
        }
        if(st.isEmpty())
        {
            return true;
        }
        else
       return false;
    }
}
