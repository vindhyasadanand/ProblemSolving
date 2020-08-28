class Tree
	{
	    ArrayList<Integer> postOrder(Node root)
	    {
	        
	          Node current = root;
	        Stack<Node> stack = new Stack<>();
	        ArrayList<Integer> list = new ArrayList<>();
	        while(current != null || !stack.isEmpty())
	        {
	            if(current != null)
	            {
	                stack.push(current);
	                current = current.left;
	            }
	            else
	            {
	                Node temp = stack.peek().right;
	                if (temp == null)
	                 {
	                    temp = stack.pop();
	                    list.add(temp.data);
	                    //System.out.print(temp.data + " ");
	                    while (!stack.isEmpty() && temp == stack.peek().right)
	                     {
	                        temp = stack.pop();
	                        //System.out.print(temp.data + " ");
	                         list.add(temp.data);
	                     }
	                 }     
	                 else
	                 {
	                    current = temp;
	                 }
	            }
	        }
	      return list;  
	    }
	}


