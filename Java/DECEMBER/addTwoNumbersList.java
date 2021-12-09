/**
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.


 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class addTwoNumbersList {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int remainder=0;
        ListNode result=null,temp=null;
        while(l1!= null && l2!= null){
            int sum = l1.val+l2.val+remainder;
            l1 = l1.next;
            l2 = l2.next;
            remainder = sum/10;
            if(result == null && temp==null) {
                result = new ListNode(sum%10,null);
                temp = result;
            } else {
                temp.next = new ListNode(sum%10,null);
                temp = temp.next;
            }
        }
        /*ListNode test = result;
        while(result!=null) {
			System.out.print(result.val);
			result=result.next;
		}
        result = test;
        System.out.println("---------------------");*/
        while(l1!=null){
            int sum = l1.val+remainder;
            l1 = l1.next;
            remainder = sum/10;
            temp.next = new ListNode(sum%10,null);
            temp = temp.next;
        }
        while(l2!=null){
            int sum = l2.val+remainder;
            l2 = l2.next;
            remainder = sum/10;
            temp.next = new ListNode(sum%10,null);
            temp = temp.next;
        }
        if(remainder>0){
            temp.next = new ListNode(remainder,null);
            temp = temp.next;
        }
        return result;
    }
}
