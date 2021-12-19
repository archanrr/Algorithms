/*
Given the head of a singly linked list and two integers left and right where left <= right, reverse the nodes of the list from position left to position right, and return the reversed list.
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
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        int leftptr = 1;
        int rightptr = 1;
        ListNode temp = head;
        ListNode prev = temp;
        ListNode prevS = null;
        ListNode start = null;
        ListNode startptr = null;
        ListNode end = null;
        while(temp!=null){
            if(leftptr==left){
                start = temp;
                startptr = start;
                leftptr++;
            }
            if(rightptr==right){
                end = temp;
                rightptr++;
            }
            if(start==null) {
                prevS = temp;
                leftptr++;
            }
            if(end==null) rightptr++;
            else break; 
        }
        reverseListGroup(prevS,start,end,right-left);
        start = start.next;
        return head;
    }
    ListNode reverseListGroup(ListNode prevNode, ListNode startNode,ListNode endNode,int k){
        ListNode ptr = startNode;
        ListNode temp = null;
        ListNode x = null;
        ListNode nextStartNode = endNode.next;
        int count = 0;
        while(count<k){
            count++;
            x = ptr.next;
            ptr.next = temp;
            temp = ptr;
            ptr = x;
        }
        startNode.next = nextStartNode;
        if(prevNode!=null){
            prevNode.next = endNode;
        }
        return null;
    }
}
