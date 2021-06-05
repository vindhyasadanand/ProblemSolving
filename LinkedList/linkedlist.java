public class Solution {
    public ListNode detectCycle(ListNode head) 
    {
         ListNode slow = head;
        ListNode fast = head;
        boolean iscycle=false;
        while(fast!=null&&fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast)
            {
                iscycle=true;
                break;
            }
        }
        if(iscycle)
        {
            ListNode s = head;
            while(s!=slow)
            {
                s = s.next;
                slow = slow.next;
            }
            return s;
        }
        return null;
    }
}
