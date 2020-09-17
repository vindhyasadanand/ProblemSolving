import java.util.*;
import java.lang.*;
import java.io.*;

class GFG
{
    static void addedge(int s,int d,ArrayList<ArrayList<Integer>>adj)
    {
        adj.get(s).add(d);
        adj.get(d).add(s);
    }
	public static void main (String[] args)
	{
	      Scanner sc = new Scanner(System.in);
	      
	      int tc = sc.nextInt();
	      for(int k=0;k<tc;k++)
	      {
	             int V = sc.nextInt();
	             int E = sc.nextInt();
	             ArrayList<ArrayList<Integer>> list = new ArrayList<>();
	             for(int i=0;i<V;i++)
	            {
	                list.add(new ArrayList<Integer>());
	             }
	             for(int i=0;i<E;i++)
	           {
	                 int s = sc.nextInt();
	                int d = sc.nextInt();
	                addedge(s,d,list);
	            }
	            print(list,V);
	      } 
	}
	 static void print(ArrayList<ArrayList<Integer>>adj,int V)
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
