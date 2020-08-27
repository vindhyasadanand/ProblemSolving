import java.util.Scanner;
class Node
{
	int data;
	Node left;
	Node right;
	Node(int data)
	{
		this.data = data;
		left = right = null;
	}
}
public class IterativeInsert
{

	public static void main(String[] args) 
	{
		 Node root = null;
		    Scanner sc = new Scanner(System.in);
		   
		    while(true)
		    {
		         System.out.println("Enter the choice");
		        System.out.println("1.Insert"+"\n" + "2.Display");
		        int ch = sc.nextInt();
		        switch(ch)
		        {
		            case 1:  System.out.println("Enter the value to be inserted");
		                     int val = sc.nextInt();
		                      root =  insert(root,val);
		                      break;
		            case 2:  System.out.println("Tree traversal is");
		                    inorder(root);
		                    System.out.println();
		                    break;
		            
		        }     
		    }    		
	}

	private static void inorder(Node root)
	{
		if(root==null)
		{
			return;
		}
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}

	private static Node insert(Node root, int val) {
		Node current = root;
		Node parent=null;
		Node temp = new Node(val);
		if(root==null)
		{
			return temp;
		}
		while(current!=null)
		{
			parent = current;
			if(current.data>val)
			{
				current = current.left;
			}
			else if(current.data<val)
			{
				current = current.right;
			}
		}
		if(parent.data>val)
		{
			parent.left = temp;
		}
		else
		{
			parent.right = temp;
		}
		return root;
	}

}
