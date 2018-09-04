package linkedList;
/*
Given a linked list, rotate the list to the right by k places, where k is non-negative.

Example 1:

Input: 1->2->3->4->5->NULL, k = 2
Output: 4->5->1->2->3->NULL
Explanation:
rotate 1 steps to the right: 5->1->2->3->4->NULL
rotate 2 steps to the right: 4->5->1->2->3->NULL
Example 2:

Input: 0->1->2->NULL, k = 4
Output: 2->0->1->NULL
Explanation:
rotate 1 steps to the right: 2->0->1->NULL
rotate 2 steps to the right: 1->2->0->NULL
rotate 3 steps to the right: 0->1->2->NULL
rotate 4 steps to the right: 2->0->1->NULL
 */
public class RotateRight {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode cur=head;
        if(head==null){
            return null;
        }
        int length=1;
        while(cur.next!=null){
            length++;
            cur=cur.next;
        }
        cur.next=head;
        cur=cur.next;
        int step=length-k%length;
        for(;step>1;step--){
            cur=cur.next;
        }
        ListNode res=cur.next;
        cur.next=null;
        return res;
    }
}
