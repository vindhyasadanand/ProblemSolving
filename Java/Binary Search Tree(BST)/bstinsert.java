import java.util.Scanner;
class Node
    {
        Node left,right;
        
        int data;
        Node(int data)
        {
            this.data=data;
            left = right = null;
        }
    }
public class Main
{
     static Node insert(Node root,int key)
    {
        if(root==null)
        {
            return new Node(key);
        }
        else if(root.data>key)
        {
            root.left = insert(root.left,key);
        }
        else if(root.data<key)
        {
            root.right = insert(root.right,key);
        }
        return root;
    }
    static void inorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
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
}
