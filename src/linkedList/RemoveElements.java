package linkedList;
/*
Remove all elements from a linked list of integers that have value val.

Example:

Input:  1->2->6->3->4->5->6, val = 6
Output: 1->2->3->4->5
 */
public class RemoveElements {
    public ListNode removeElements(ListNode head,int val){
        ListNode result=head;
        while(result!=null&&result.val==val){
            result=result.next;
        }
        ListNode current=result;
        while(current!=null&&current.next!=null){
            if(current.next.val==val){
                current.next=current.next.next;
            }else{
                current=current.next;
            }
        }
        return result;
    }
}
