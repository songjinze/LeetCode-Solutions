package stack;

import java.util.Stack;

/*
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Note that an empty string is also considered valid.

Example 1:

Input: "()"
Output: true
Example 2:

Input: "()[]{}"
Output: true
Example 3:

Input: "(]"
Output: false
Example 4:

Input: "([)]"
Output: false
Example 5:

Input: "{[]}"
Output: true
 */
public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> symbolContainer=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='('||c=='['||c=='{')
                symbolContainer.push(c);
            else{
                if(symbolContainer.isEmpty()){
                    return false;
                }
                char temp=symbolContainer.pop();
                if(c-temp==1||c-temp==2){
                }else{
                    return false;
                }
            }
        }
        return symbolContainer.isEmpty();
    }
}
