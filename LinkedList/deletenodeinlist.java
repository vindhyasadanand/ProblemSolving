class Solution {
    public void deleteNode(ListNode node)
    {
        //we are given reference to th node which should be deleted
        int nextval = node.next.val;
        node.val = node.next.val;
        node.next = node.next.next;
        
    }
}
