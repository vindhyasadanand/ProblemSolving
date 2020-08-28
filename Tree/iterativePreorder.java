// class Node{
//     int data;
//     Node left,right;
//     Node(int d){
//         data=d;
//         left=right=null;
//     }
// }

class BinaryTree
{
    /* Computes the number of nodes in a tree. */
    static ArrayList<Integer> preorder(Node root)
    {
       ArrayList<Integer> list  = new ArrayList<>();
       if(root==null)
       {
           return null;
       }
       Stack<Node> s = new Stack<>();
      s.add(root);
      while(!s.isEmpty())
      {
          root = s.pop();
          list.add(root.data);
          if(root.right!=null)
          {
              s.push(root.right);
          }
          if(root.left!=null)
          {
              s.push(root.left);
          }
      }
      return list;
    }

}