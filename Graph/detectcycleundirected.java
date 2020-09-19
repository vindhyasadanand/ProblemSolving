class DetectCycle
{
    static boolean isCycledfs(ArrayList<ArrayList<Integer>> g,
    boolean visited[],int parent,int s)
    {
        visited[s] = true;
        for(int next:g.get(s))
        {
            if(visited[next]==false)
            {
                if(isCycledfs(g,visited,s,next))
                {
                    return true;
                }
            }
            else if(parent!=next)
            {
                return true;
            }
        }
        return false;
    }
    static boolean isCyclic(ArrayList<ArrayList<Integer>> g, int V)
    {
        boolean visited[] = new boolean[V];
        for(int i=0;i<V;i++)
        {
            if(visited[i]==false)
            {
                if(isCycledfs(g,visited,-1,i))
                {
                    return true;
                }
            }
           
        }
        return false;
    }
}




