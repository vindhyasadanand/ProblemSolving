class Solution {
    public int totalFruit(int[] tree) 
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        int maxlength = 0;
        int start = 0;
        for(int i=0;i<tree.length;i++)
        {
           map.put(tree[i],map.getOrDefault(tree[i],0)+1);
           while(map.size()>2)
           {
                map.put(tree[start],map.get(tree[start])-1);
               if(map.get(tree[start])==0)
               {
                   map.remove(tree[start]);
                   
               }
               start++;
           }
            maxlength = Math.max(maxlength,i-start+1);
        }
        return maxlength;
    }
}
