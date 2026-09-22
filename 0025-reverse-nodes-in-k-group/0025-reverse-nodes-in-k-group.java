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
    public ListNode reverseKGroup(ListNode head, int K) {

        if (head == null && K == 1)
        return head;
        ListNode temp = new ListNode(-1);
        temp.next = head;
        ListNode prevgpend = temp;
        int i;
        while (true) {
            ListNode Kth = prevgpend;
            for (i = 1; i<=K && Kth!= null;i++)
            Kth = Kth.next;
            if (Kth == null)
            break;
            ListNode gpstart = prevgpend.next;
            ListNode nextgpstart = Kth.next;
            ListNode current = gpstart;
            ListNode prev = nextgpstart;
            ListNode nextnode = null;
            while (current!=nextgpstart) {
                nextnode = current.next;
                current.next = prev;
                prev = current;
                current = nextnode;

            }

            prevgpend.next = Kth;
            prevgpend = gpstart;

            
        } 

        return temp.next;
        
    }

}