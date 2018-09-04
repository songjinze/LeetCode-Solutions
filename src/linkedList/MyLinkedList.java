package linkedList;

/**
 * created by IDEA
 *
 * @author: jinze
 * @Date: 18-5-18
 * @Time: 下午9:40
 */
public class MyLinkedList {
    class Node{
        Node next;
        Node pre;
        int val;
        Node(){
            next=null;
            pre=null;
            val=0;
        }
    }
    private int length;
    private Node head;
    private Node tail;

    public void printAll(){
        Node current=head;
        while(current!=null){
            System.out.print(current.val);
            current=current.next;
            if(current!=null){
                System.out.print("->");
            }
        }
        System.out.println();
    }

    /** Initialize your data structure here. */
    public MyLinkedList() {
        head=null;
        tail=null;
        length=0;
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if(index>length-1||index<0){
            return -1;
        }
        Node current=head;
        int count=0;
        while(current!=null){
            if(count==index){
                return current.val;
            }
            count++;
            current=current.next;
        }
        return -1;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        Node newHead=new Node();
        newHead.val=val;
        newHead.next=head;
        if(head!=null){
            head.pre=newHead;
        }
        head=newHead;
        if(length==0){
            tail=head;
        }
        length++;
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        Node newTail=new Node();
        newTail.val=val;
        newTail.pre=tail;
        if(tail!=null){
            tail.next=newTail;
        }
        tail=newTail;
        if(length==0){
            head=tail;
        }
        length++;
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if(index>length||index<0){}
        else{
            if(index==0){
                addAtHead(val);
            }
            else if(index==length){
                addAtTail(val);
            }
            else{
                int count=0;
                Node current=head;
                while(count!=index){
                    count++;
                    current=current.next;
                }
                Node newNode=new Node();
                newNode.val=val;
                newNode.next=current;
                newNode.pre=current.pre;
                current.pre.next=newNode;
                current.pre=newNode;
                length++;
            }
        }
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if(index>length-1||index<0){

        }else{
            int count=0;
            Node current=head;
            while(count!=index){
                count++;
                current=current.next;
            }
            if(current.pre!=null){
                current.pre.next=current.next;
            }else{
                head=current.next;
            }
            if(current.next!=null){
                current.next.pre=current.pre;
            }else{
                tail=current.pre;
            }
            length--;
        }

    }
}
