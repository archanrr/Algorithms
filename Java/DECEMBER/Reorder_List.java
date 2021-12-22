/*
You are given the head of a singly linked-list. The list can be represented as:

L0 → L1 → … → Ln - 1 → Ln
Reorder the list to be on the following form:

L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …
You may not modify the values in the list's nodes. Only nodes themselves may be changed.
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
class Reorder_List {
    public void reorderList(ListNode head) {
        ListNode ptr = head;
        ListNode prev = head;
        Stack<ListNode> stack = new Stack<ListNode>();
        
        while(ptr!=null){
            stack.push(ptr);
            prev = ptr;
            ptr = ptr.next;
        }
        ListNode start = head;
        
        start = head;
        ptr = stack.pop();
        int count = 0;
        while(!stack.isEmpty()){
            count++;
            ptr.next = start.next;
            start.next = ptr;
            start = start.next.next;
            System.out.println("start "+start.val+" old ptr "+ptr.val);
            ptr = stack.pop();
            ptr.next = null;
            System.out.println("start "+start.val+" new ptr "+ptr.val);
        }
        start.next = null;
        ptr = head;
        while(ptr!=null && ptr.val!=-100){
            System.out.print("->"+ptr.val);
            ptr = ptr.next;
        }
    }
}
