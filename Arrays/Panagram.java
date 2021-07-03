 public static String pangrams(String s) 
    {
        if(s.length()<26)
        {
            return "not pangram" ;
        }
        else
        {
            String str = s.toLowerCase();
             for(char ch='a';ch<='z';ch++)
             {
                 if(str.indexOf(ch)<0)
                 {
                     return "not pangram";
                 }
             } 
        }  
      return "pangram";
    }
