package stack;

import java.util.ArrayList;
import java.util.List;

/*
Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
getMin() -- Retrieve the minimum element in the stack.
Example:
MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin();   --> Returns -3.
minStack.pop();
minStack.top();      --> Returns 0.
minStack.getMin();   --> Returns -2.
 */
class MinStack {

    private List<Integer> numContainer;
    private int minNum;

    /** initialize your data structure here. */
    public MinStack() {
        numContainer=new ArrayList<>();
        minNum=0;
    }

    public void push(int x) {
        numContainer.add(x);
        if(numContainer.size()==1){
            minNum=x;
        }
        else if(minNum>x){
            minNum=x;
        }
    }

    public void pop() {
        if(numContainer.size()==0){
            return;
        }
        int top=numContainer.remove(numContainer.size()-1);
        if(top==minNum&&numContainer.size()!=0){
            minNum=numContainer.get(0);
            for(int n:numContainer){
                if(n<minNum){
                    minNum=n;
                }
            }
        }
    }

    public int top() {
        return numContainer.get(numContainer.size()-1);
    }

    public int getMin() {
        return minNum;
    }
}

