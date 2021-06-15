class Solution {
    public String decodeString(String s)
    {
        //to hold count
        Stack<Integer> is = new Stack<>();
        //to hold string whicg is to be repeated
        Stack<String> ss = new Stack<>();
        int index = 0;
       String cur = "";
 
      for(int i=0;i<s.length();i++)
      {   
           char ch = s.charAt(i);
            if(Character.isDigit(ch))
            {    
                 int num = 0;
                 while(Character.isDigit(s.charAt(i)))
                 {
                        num = num*10 + s.charAt(i)-'0';
                     i++;
                
                 }
                 i=i-1;
                is.push(num);
            }
            else if(ch=='[')
            {
               ss.push(cur);
                cur = "";
            }
            else if(ch==']')
            {
                int count= is.pop();
                String temp = ss.pop();
                for(int c=0;c<count;c++)
                {
                    temp +=cur;
                }
                cur = temp;
              
            }
            else
            {
                cur +=ch;
            }
        }
       
       return cur; 
    }
}
