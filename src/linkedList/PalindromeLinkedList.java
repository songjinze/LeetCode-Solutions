package linkedList;
/*
Given a singly linked list, determine if it is a palindrome(回文的).

Example 1:

Input: 1->2
Output: false
Example 2:

Input: 1->2->2->1
Output: true
Follow up:
Could you do it in O(n) time and O(1) space?
 */
public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        if(head==null){
            return true;
        }
        ListNode middleNode=getMiddleNode(head);
        ListNode reversedList=reverseListNode(middleNode);
        middleNode.next=null;
        while(reversedList!=null){
            if(head.val!=reversedList.val){
                return false;
            }else{
                head=head.next;
                reversedList=reversedList.next;
            }
        }
        return true;
    }
    public ListNode getMiddleNode(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(slow!=null&&fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode reverseListNode(ListNode head){
        ListNode result=head;
        ListNode current=head;
        if(head==null){
            return null;
        }
        while(current.next!=null){
            ListNode temp=current.next.next;
            current.next.next=result;
            result=current.next;
            current.next=temp;
        }
        return result;
    }
}
