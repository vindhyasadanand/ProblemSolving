class Traversal 
{
    static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> g, int N) 
    {
         Queue<Integer> q = new LinkedList<>();
        boolean visited[] = new boolean[N+1];
        ArrayList<Integer> list = new ArrayList<>();
        int s = 0;
    	visited[0] = true;
	    q.add(s);
		while(q.isEmpty()==false)
		{
		    int u = q.poll();
		   list.add(u);
		    for(int v : g.get(u))
		    {
		        if(visited[v]==false)
		        {
		            visited[v] =true;
		            q.add(v);
		        }
		    }
		    
		}
		return list;
    }
}
