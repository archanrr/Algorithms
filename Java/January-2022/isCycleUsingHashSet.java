/*
Given head, the head of a linked list, determine if the linked list has a cycle in it.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.

Return true if there is a cycle in the linked list. Otherwise, return false.
*/
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class isCycleUsingHashSet {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> hset = new HashSet<ListNode>();
        if(head == null || head.next == null) return false;
        ListNode slow = head;
        while(slow!=null){
            if(hset.contains(slow)) return true;
            else hset.add(slow);
            slow = slow.next;
        }
        return false;
    }
}
