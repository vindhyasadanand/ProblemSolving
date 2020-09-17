class DetectCycle
{
    static boolean isCyclic(ArrayList<ArrayList<Integer>> list, int V)
    {
        // add your code here
    int indegree[] = new int[V];

    for(int i = 0; i < V; i++)
    {
        for(int node : list.get(i))
        {
            indegree[node]++;
        }
    }

    Queue<Integer> q = new LinkedList<Integer>();
    for(int i = 0;i < V; i++)
    {
        if(indegree[i]==0)
        q.add(i);
    }

    int cnt = 0;

    while(!q.isEmpty())
    {
        int u=q.poll();

    for(int node : list.get(u))
    {
        // If in-degree becomes zero, add it to queue
         indegree[node]--;
         if(indegree[node] == 0)
         q.add(node);
    }
     cnt++;
    }

    return cnt != V;

    }
}
