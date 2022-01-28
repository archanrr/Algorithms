/*
18/1/2022:
237. Delete Node in a Linked List

Write a function to delete a node in a singly-linked list. You will not be given access to the head of the list, instead you will be given access to the node to be deleted directly.

It is guaranteed that the node to be deleted is not a tail node in the list.
*/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class DeleteNodeWithoutHead {
    public void deleteNode(ListNode node) {
        /*ListNode temp = node;
        ListNode prev = node;
        while(temp.next!=null){
            temp.val = temp.next.val;
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;*/
        node.val = node.next.val;
        node.next = node.next.next;
        return;
    }
}
/*
temp.val = temp.next.val;
           temp.next = temp.next.next;
            temp = temp.next;
*/
