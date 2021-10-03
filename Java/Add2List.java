/**
 * Definition for singly-linked list.
 */
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
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
        ListNode test = result;
        while(result!=null) {
			System.out.print(result.val);
			result=result.next;
		}
        result = test;
        System.out.println("---------------------");
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
public class Add2List {

	public static void main(String[] args) {//52346+52346 = 056821
		// TODO Auto-generated method stub
		ListNode l1 = new ListNode(5,null);
		l1.next = new ListNode(2,null);
		l1.next.next = new ListNode(3,null);
		l1.next.next.next = new ListNode(4,null);
		l1.next.next.next.next = new ListNode(6,null);
		 ListNode test = l1;
	        while(l1!=null) {
				System.out.print(l1.val);
				l1=l1.next;
			}
	        l1 = test;
	        System.out.println("-");
		ListNode l2 = new ListNode(5,null);
		l2.next = new ListNode(2,null);
		l2.next.next = new ListNode(3,null);
		l2.next.next.next = new ListNode(4,null);
		l2.next.next.next.next = new ListNode(6,null);
		ListNode test1 = l2;
        while(l1!=null) {
			System.out.print(l1.val);
			l1=l1.next;
		}
        l1 = test1;
        System.out.println("-");
		ListNode result = new Solution().addTwoNumbers(l1, l2);
		while(result!=null) {
			System.out.print(result.val);
			result=result.next;
		}
	}

}
