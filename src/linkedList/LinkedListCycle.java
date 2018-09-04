package linkedList;/*
*Given a linked list, determine if it has a cycle in it.
*
*Follow up:
*Can you solve it without using extra space?
*
*
*/

import java.util.HashSet;
import java.util.Set;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
         Set<ListNode> hashset=new HashSet<>();
         ListNode current=head;
         while(current!=null){
             if(hashset.contains(current)){
                return true;
             }else{
                hashset.add(current);
            }
             current=current.next;
         }
         return false;
    }
}