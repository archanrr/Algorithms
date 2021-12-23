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
        ListNode start = head;
        Stack<ListNode> stack = new Stack<ListNode>();
        
        while(ptr!=null){
            stack.push(ptr);
            ptr = ptr.next;
        }
        
        start = head;
        int size = (stack.size()-1)/2;
        while(size-- >0){
            ptr = stack.pop();
            ListNode temp = start.next;
            start.next = ptr;
            ptr.next = temp;
            start = temp;
        }
        stack.pop().next = null;
    }
}
