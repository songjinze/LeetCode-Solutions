package linkedList;
/*
Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.

Example:

Input: 1->2->4, 1->3->4
Output: 1->1->2->3->4->4
 */
public class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode res_h;
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
        if(l1.val>=l2.val){
            res_h=l2;
            l2=l2.next;
        }else{
            res_h=l1;
            l1=l1.next;
        }
        ListNode cur=res_h;
        while(l1!=null&&l2!=null){
            if(l1.val>=l2.val){
                cur.next=l2;
                l2=l2.next;
            }else{
                cur.next=l1;
                l1=l1.next;
            }
            cur=cur.next;
        }
        if(l1!=null){
            cur.next=l1;
        }
        else if(l2!=null){
            cur.next=l2;
        }
        return res_h;
    }
}
