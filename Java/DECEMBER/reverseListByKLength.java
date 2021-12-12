/*
 Reverse Nodes in k-Group
 
Given a linked list, reverse the nodes of a linked list k at a time and return its modified list.

k is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of k then left-out nodes, in the end, should remain as it is.

You may not alter the values in the list's nodes, only nodes themselves may be changed.

TestCase 1:
[1,2,3,4,5,6,7,8]
3

[3,2,1,6,5,4,7,8]

TestCase 2:
[1,2,3,4,5,6,7,8]
6
[6,5,4,3,2,1,7,8]



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
class reverseListByKLength {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode start = head;
        ListNode endNode = travelTo(head,k);
        int length = 0;
        while(start!=null){
            start = start.next;
            length++;
        }
        start = head;
        ListNode prevNode = null;
        ListNode startNode = head;
        //reverseListGroup(prevNode,startNode,endNode,length);
        //printList(endNode);
        for(int i=0;i<(length/k);i++){
            //System.out.print(startNode.val+" ->");
            //printList(startNode);
            
            //System.out.println(endNode.val);
            reverseListGroup(prevNode,startNode,endNode,k);
            if(i==0) head = endNode;
            //System.out.println("Print List from head  i"+i);
            //printList(head);
            //System.out.println("Print List 1  i"+i);
            //printList(startNode);
            prevNode = startNode;
            startNode = startNode.next;
            //System.out.println("Print List 2  i"+i);
            //printList(startNode);
            endNode = travelTo(startNode,k);
            
        }
        
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
    /*void printList(ListNode head){
        while(head!=null){
            System.out.print(head.val+" -> ");
            head = head.next;
        }
        System.out.println();
    }*/
    ListNode travelTo(ListNode node,int k){
        int count = 0;
        while(node!=null){
            count++;
            if(count==k) return node;
            node = node.next;
        }
        return null;
    }
}
