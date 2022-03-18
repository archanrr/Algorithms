/*
18/3/2022 : 160. Intersection of Two Linked Lists
Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect. If the two linked lists have no intersection at all, return null.
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Intersection2Lit {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA=headA,tempB=headB;
        HashSet<ListNode> het = new HashSet<ListNode>();
        while(tempA!=null){
            het.add(tempA);
            tempA=tempA.next;
        }
        while(tempB!=null){
            if(het.contains(tempB)){
                return tempB;
            }
            tempB=tempB.next;
        }
        return null;
    }
}
