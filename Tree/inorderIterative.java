/* A Binary Tree node 

class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */
class Tree
{
    // Return a list containing the inorder traversal of the given tree
    ArrayList<Integer> inOrder(Node root)
    {
        /*if(root==null)
        {
            return;
        }*/
        Stack<Node> s = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        Node cur = root;
       
        while(true)
        {
            if(cur!=null)
            {
                s.push(cur);
                cur = cur.left;
            }
            else
            {
                if(s.isEmpty()==true)
                {
                    break;
                }
                cur = s.pop();
              
               list.add(cur.data);
                cur = cur.right;
            }
        }
        return list;
    }
    
    
}
