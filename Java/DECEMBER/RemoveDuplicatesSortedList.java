/*
83. Remove Duplicates from Sorted List

Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.

Input: head = [1,1,2,3,3]
Output: [1,2,3]
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
class RemoveDuplicatesSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode nextPtr = head.next;
        ListNode ptr = head;
        while(nextPtr!=null){
            if(ptr.val==nextPtr.val){
                ptr.next = nextPtr.next;
                nextPtr = nextPtr.next;
                continue;
            }
            ptr = ptr.next;
            nextPtr = nextPtr.next;
        }
        return head;
    }
}
