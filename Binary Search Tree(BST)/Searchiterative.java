/* Node class
class Node
{
	int data;
	Node left, right;
	Node(int d)
	{
		data = d;
		left = right = null;
	}
}*/

/*You are required to complete this method*/
class BST
{
    boolean search(Node root, int x)
    {
	    Node cur = root;
	    while(cur!=null)
	    {
	        if(cur.data==x)
	        {
	            return true;
	        }
	        else if(cur.data<x)
	        {
	            cur = cur.right;
	        }
	        else if(cur.data>x)
	        {
	            cur = cur.left;
	        }
	    }
	    return false;
    }
}
