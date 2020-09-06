public class Solution {

    
    // Complete the matchingStrings function below.
    static int[] matchingStrings(String[] strings, String[] queries) 
    {
        int result[] = new int[queries.length];
        Map<String,Integer> map = new HashMap<>();
        for(int i=0;i<strings.length;i++)
        {
            String cur= strings[i];
            if(map.containsKey(cur))
            {
                int prevcount = map.get(cur);
                map.put(cur,prevcount+1);
            }
            else
            {
                map.put(cur,1);
            }
        }
        for(int i=0;i<queries.length;i++)
        {
            String curstr = queries[i];
            if(map.containsKey(curstr))
            {
                int count = map.get(curstr);
                result[i] = count;

            }
        }
        return result;

    }
