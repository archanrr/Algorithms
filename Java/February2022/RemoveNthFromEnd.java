/*
18/2/2022: 19. Remove Nth Node From End of List
Given the head of a linked list, remove the nth node from the end of the list and return its head.
*/
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
class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode end = head;
        ListNode start = null;
        int i=0;
        while(i<n && end!=null){
            end=end.next;
            i++;
        }
        while(end!=null){
            if(start!=null) start= start.next;
            else start=head;
            end = end.next;
        }
        //boundary Condition
        if(start!=null) start.next =start.next.next;
        else head = head.next;
        
        return head;
    }
}
