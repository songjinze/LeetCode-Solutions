package stack;

import java.util.LinkedList;
import java.util.Queue;

/*
Implement the following operations of a stack using queues.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
empty() -- Return whether the stack is empty.
Example:

MyStack stack = new MyStack();

stack.push(1);
stack.push(2);
stack.top();   // returns 2
stack.pop();   // returns 2
stack.empty(); // returns false
Notes:

You must use only standard operations of a queue -- which means only push to back, peek/pop from front, size, and is empty operations are valid.
Depending on your language, queue may not be supported natively. You may simulate a queue by using a list or deque (double-ended queue), as long as you use only standard operations of a queue.
You may assume that all operations are valid (for example, no pop or top operations will be called on an empty stack).
 */
public class MyStack {
    private Queue<Integer>queue1;
    private Queue<Integer>queue2;
    /** Initialize your data structure here. */
    public MyStack() {
        queue1=new LinkedList<>();
        queue2=new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        if(queue1.isEmpty()){
            queue1.add(x);
            for(int i=0;i<queue2.size();i++){
                queue1.add(queue2.poll());
            }
        }else{
            queue2.add(x);
            for(int i=0;i<queue1.size();i++){
                queue2.add(queue1.poll());
            }
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        if(!queue1.isEmpty()){
            return queue1.poll();
        }else if(!queue2.isEmpty()){
            return queue2.poll();
        }
        return -1;
    }

    /** Get the top element. */
    public int top() {
        if(!queue1.isEmpty()){
            return queue1.peek();
        }else if(!queue2.isEmpty()){
            return queue2.peek();
        }
        return -1;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue1.isEmpty()&&queue2.isEmpty();
    }
}
