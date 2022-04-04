/*

4/4/2022 : 1721. Swapping Nodes in a Linked List

You are given the head of a linked list, and an integer k.

Return the head of the linked list after swapping the values of the kth node from the beginning and the kth node from the end (the list is 1-indexed).
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
class Swap2NodesLinklist {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp=head,temp2,frameStart=head;
        for(int i=0;i<k-1;i++){
           temp = temp.next; 
        }
        temp2=temp;
        while(temp.next!=null)
        {
            temp = temp.next;
            frameStart=frameStart.next;
        }
        int x = temp2.val;
        temp2.val = frameStart.val;
        frameStart.val = x;
        return head;
    }
}
