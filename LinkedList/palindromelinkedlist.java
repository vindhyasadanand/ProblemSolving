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
class Solution {
   
    public boolean isPalindrome(ListNode head)
    {
        
        //to find middle node of linkedlist
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        //to reverse the second part of linkedlist
         slow = reverse(slow);
        //move slow to right half
        fast = head;
        //to check left and right half are equal or not
        while(slow!=null)
        {
            if(fast.val!=slow.val)
            {
               return false;
            }
           slow = slow.next;
        fast = fast.next;
        }
        return true;
    }
     public ListNode reverse(ListNode head)
    {
        ListNode prev = null;
        ListNode cur = head;
        while(cur!=null)
        {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur  = next;
        }
        return prev;
        
    }
    
}
