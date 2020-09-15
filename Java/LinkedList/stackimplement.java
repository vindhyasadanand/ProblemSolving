class MyStack {
    // Note that top is by default null
    // in Java
    StackNode top;
    void push(int a) {
        
        //StackNode temp = top;
        StackNode newnode = new StackNode(a);
        newnode.next = top;
        top = newnode;
    }
    int pop() {
       
        if(top == null)
            return -1;
        else{
            StackNode del = top;
            int val = top.data;
            top = top.next;
            del.next = null;
            return val;
        }
    }
}