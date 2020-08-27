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
        //if root is empty or element dosen't exist
	    if(root==null)
	    
	        return false;
	    
	    if(root.data==x)
	    
	        return true;
	    
	    else if(root.data>x)
        
           return search(root.left,x); 
        
        else 
        
           return search(root.right,x);
        
     
    }
    
}
