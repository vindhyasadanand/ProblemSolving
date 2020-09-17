import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class ImplementGraph 
{
    static void addEdge(ArrayList<ArrayList<Integer>> adj , int  s , int v)
    {
    	adj.get(s).add(v);
    	adj.get(v).add(s);
    }
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
		System.out.println("Enter the number of vertices");
		int V = sc.nextInt();
		for(int i=0;i<V;i++)
		{
			
			adj.add(new ArrayList<Integer>());
			
		}
		for(int i=0;i<V;i++)
		{
			System.out.println("Enter the sourse and destination node");
			int s = sc.nextInt();
			int d = sc.nextInt();
			addEdge(adj,s,d);
		}
		//printList(adj);
		//BFS(adj,V);
		//DFS(adj,V);
	dfs(adj,V);
	}
	// recurcive DFS 
	private static void dfsrec
	(ArrayList<ArrayList<Integer>>adj,int v,boolean visited[],int s)
	{
		visited[s] = true;
		System.out.print(s + " ");
		for(int cur:adj.get(s))
		{
			if(visited[cur]==false)
			{
				dfsrec(adj,v,visited,s);
			}
		}
	}
	private static void DFS(ArrayList<ArrayList<Integer>> adj, int v)
	{
		boolean visited[] = new boolean[v];
		
		dfsrec(adj,v,visited,0);
		
		
	}
	
	/*private static void printList(ArrayList<ArrayList<Integer>> adj) 
	{
	   for(int i=0;i<adj.size();i++)
	   {
		   for(int j=0;j<adj.get(i).size();j++)
		   {
			   System.out.print(adj.get(i).get(j)+" ");
		   }
		   System.out.println();
	   }
		
	}*/
	
	/*//BFS traversal
	private static void BFS(ArrayList<ArrayList<Integer>> adj, int v) 
	{
		boolean visited[] = new boolean[v];
		Queue<Integer> q = new LinkedList<>();
		int s = 0;
		visited[s] = true;
		q.add(s);
		while(q.isEmpty()==false)
		{
			int curNode = q.poll();
			System.out.print(curNode + " " );
			for(int curValue: adj.get(curNode))
			{
				if(visited[curValue]==false)
				{
					visited[curValue] = true;
					q.add(curValue);
					
				}
			}
		}
		
	}*/
	
	//iterative dfs
	private static void dfs(ArrayList<ArrayList<Integer>> adj, int v) 
	{
		boolean visited[] = new boolean[v];
		Stack<Integer>s = new Stack<>();
		int source = 0;
		s.push(source);
		while(s.isEmpty()==false)
		{
			int cur = s.pop();
			if(visited[cur]==false)
			{
				System.out.print(cur+" ");
				visited[cur] = true;
			}
			for(int next : adj.get(cur))
			{
				if(visited[next]==false)
				{
					s.push(next);
				}
			}
		}
		
		
	}

}
