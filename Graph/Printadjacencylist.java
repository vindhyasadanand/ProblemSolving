class Adjacency 
{
    static void printGraph(ArrayList<ArrayList<Integer>> adj, int V)
	{
	    for(int i =0;i<V; i++){
            ArrayList<Integer> temp = adj.get(i);
            System.out.print(i);
            for(int j = 0; j<temp.size(); j++){
                System.out.print("-> "+temp.get(j));
            }
            System.out.println();
        }
	}
}
