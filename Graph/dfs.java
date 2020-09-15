class Traversal
{
    static ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> g, int N)
    {
       ArrayList<Integer> al = new ArrayList<>();
	boolean[] visited = new boolean[N];
	dfsUtil(0, visited, al, g);
	 return al;
    }
    static void dfsUtil(int node, boolean visited[],ArrayList<Integer> al, ArrayList<ArrayList<Integer>> g)
	{
    	visited[node] = true;
    	al.add(node);
	    for(int i: g.get(node))
	    {
	         if(visited[i] == false)
	         {
	            dfsUtil(i, visited, al, g);
        	}
    	}
	}
}

    
