/*
6/3/2022: Reverse Link List Guruvayoor Trip
Given the head of a singly linked list, reverse the list, and return the reversed list.
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
class ListReverse {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode n = head.next;
            head.next = prev;
            prev = head;
            head = n;
        }
        return prev;
    }}
