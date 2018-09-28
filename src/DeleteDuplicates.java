import linkedList.ListNode;

/**
 * Given a sorted linked list, delete all duplicates such that each element appear only once.

 Example 1:

 Input: 1->1->2
 Output: 1->2
 Example 2:

 Input: 1->1->2->3->3
 Output: 1->2->3
 */
public class DeleteDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp=head;
        while(temp!=null&&temp.next!=null){
            if(temp.next.val==temp.val){
                temp.next=temp.next.next;
            }
            else{temp=temp.next;}
        }
        return head;
    }
}
