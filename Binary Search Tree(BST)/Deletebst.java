//User function Template for Java

/*
Structure of a Node is as follows:-
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/

class Tree
{
    // Return the root of the modified BST after deleting the node with value X
	public static Node deleteNode(Node root, int X)
	{
	    //to reach where deleted node is present
		if(root==null)
		{
		    return null;
		}
		else if(root.data<X)
		{
		    root.right =  deleteNode(root.right,X);
		}
		else if(root.data>X)
		{
		    root.left = deleteNode(root.left,X);
		}
		else
		{
		    //code to delete the node
		    if(root.left==null)
		    {
		        return root.right;
		    }
		    else if(root.right==null)
		    {
		        return root.left;
		    }
		    else
		    {
		        //to find successor
		        Node cur = root.right;
		        while(cur!=null && cur.left!=null)
		        {
		            cur = cur.left;
		        }
		      Node suc = cur;
		      root.data = suc.data;
		      root.right= deleteNode(root.right,suc.data);
		    }
		}
		return root;
	}
}	
