/*
9/03/2022: 61. Rotate List
Given the head of a linked list, rotate the list to the right by k places
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
class RotateRightLinklist {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null) return null;
		int l=0;ListNode h=head;
		ListNode last=null;
		while(h!=null){
			last=h;
			h=h.next;l++;
		}
		k=k%l;
		k=l-k;
		h=head;
		while(k-->1){
			h=h.next;
		}
		last.next=head;
		head=h.next;
		h.next=null;
		return head;
    }
}
