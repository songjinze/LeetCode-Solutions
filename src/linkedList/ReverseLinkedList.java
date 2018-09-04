package linkedList;
/**
翻转链表，例如输入[5,4,3,2,1],return[1,2,3,4,5]
**/
public class ReverseLinkedList{
    public ListNode reverseList(ListNode head) {
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