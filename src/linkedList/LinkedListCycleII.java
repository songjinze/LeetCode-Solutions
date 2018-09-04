package linkedList;

import java.util.HashSet;
import java.util.Set;

/*
 Given a linked list, return the node where the cycle begins. If there is no cycle, return null.

Note: Do not modify the linked list.

Follow up:
Can you solve it without using extra space?
 */
public class LinkedListCycleII {
    public ListNode detectCycle(ListNode head){
        Set<ListNode> listNodeSet=new HashSet<>();
        ListNode tmpListNode=head;
        while(tmpListNode!=null){
            if(listNodeSet.contains(tmpListNode)){
                return tmpListNode;
            }
            else{
                listNodeSet.add(tmpListNode);
                tmpListNode=tmpListNode.next;
            }
        }
        return null;
    }
}
