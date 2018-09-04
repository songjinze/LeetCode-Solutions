package linkedList;
/*
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example:

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res=l1;
        int temp=0;
        while(l1.next!=null&&l2.next!=null){
            int sum=l1.val+l2.val+temp;
            l1.val=sum%10;
            temp=sum/10;
            l1=l1.next;
            l2=l2.next;
        }
        int sum=l1.val+l2.val+temp;
        l1.val=sum%10;
        temp=sum/10;
        if(l2.next==null){
            while(temp!=0){
                if(l1.next==null){
                    l1.next=new ListNode(temp%10);
                    temp=temp/10;
                }else{
                    sum=l1.next.val+temp;
                    l1.next.val=sum%10;
                    temp=sum/10;
                    l1=l1.next;
                }

            }
        }
        else if(l1.next==null){
            while(l2.next!=null){
                l2=l2.next;
                sum=l2.val+temp;
                l1.next=new ListNode(sum%10);
                temp=sum/10;
                l1=l1.next;
            }
            if(temp!=0){
                l1.next=new ListNode(temp);
            }
        }
        return res;
    }
}
