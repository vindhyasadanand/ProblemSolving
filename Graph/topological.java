class TopologicalSort 
{
    static int[] topoSort(ArrayList<ArrayList<Integer>> adj, int N)
    {
        int indeg[] = new int[N];
        Queue<Integer> q = new LinkedList<>();
        int a[] =new int[N];
        int k=0;
        for(int i=0;i<adj.size();i++)
        {
            for(int j=0;j<adj.get(i).size();j++)
            {
                int cur = adj.get(i).get(j);
               // System.out.println(cur);
                indeg[cur]++;
            }
        }
        //printindeg(indeg,v);
        
        for(int i=0;i<indeg.length;i++)
        {
            if(indeg[i]==0)
            {
                q.add(i);
            }
        }
        while(q.isEmpty()==false)
        {
            int cur = q.poll();
            a[k] = cur;
            k++;
            for(int next: adj.get(cur))
            {
                indeg[next]--;
                if(indeg[next]==0)
                {
                    q.add(next);
                }
            }
        }
        return a;
    }
}
