class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/
class Level_order_traversal
{
    //You are required to complete this method
    static ArrayList <Integer> levelOrder(Node node) 
    {
        
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        while(!q.isEmpty())
        {
            node = q.poll();
            list.add(node.data);
            if(node.left!=null)
            {
                q.add(node.left);
            }
            if(node.right!=null)
            {
                q.add(node.right);
            }
            
        }
        return list;
    }
}





