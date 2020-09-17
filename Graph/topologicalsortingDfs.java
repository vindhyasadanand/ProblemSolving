class TopologicalSort 
{
    static void dfs(ArrayList<ArrayList<Integer>> adj,
    boolean visited[],Stack<Integer> st,int s)
    {
        visited[s] = true;
        for(int next:adj.get(s))
        {
            if(visited[next]==false)
            {
                dfs(adj,visited,st,next);
            }
        }
        st.push(s);
    }
    static int[] topoSort(ArrayList<ArrayList<Integer>> adj, int N)
    {
         boolean visited[] = new boolean[N];
         Stack<Integer>st = new Stack<>();
         int res[] = new int[N];
         for(int i=0;i<N;i++)
         {
             if(visited[i]==false)
             {
                 dfs(adj,visited,st,i);
             }     
         } 
         int k=0;
         while(st.isEmpty()==false)
         {
             res[k] = st.pop();
             k++;
         }
         return res;
    }
}
