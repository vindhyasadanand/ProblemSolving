/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution
{
    public ListNode reverseBetween(ListNode head, int m, int n)
    {
        //if the list is empty
        if(head==null)
        {
            return null;
        }
        //check p==q
        if(m==n)
        {
            return head;
        }
        ListNode cur = head;
        ListNode prev = null;
       //traverse till (p-1)th node
        for(int i=0;i<m-1 && cur!=null;i++)
        {
            prev = cur;
            cur = cur.next;
        }
        ListNode lastnodeoffirst = prev;
        ListNode lastnodeofsublist =  cur;
        
       //traverse from pth node 
        for(int i=0;i<n-m+1&&cur!=null;i++)
        {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
            
        }
        if(lastnodeoffirst!=null)
        {
             lastnodeoffirst.next = prev;
        }
        else
        {
            //means our p is starting from zero and we dont have anything at left
            head = prev;
        }
        
        lastnodeofsublist.next = cur;
        return head;
        
        
        
        
        
            
    }
}
    
    
    
    
    
