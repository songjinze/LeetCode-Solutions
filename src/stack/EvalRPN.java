package stack;

import java.util.Stack;

/*
Evaluate the value of an arithmetic expression in Reverse Polish Notation.

Valid operators are +, -, *, /. Each operand may be an integer or another expression.

Note:

Division between two integers should truncate toward zero.
The given RPN expression is always valid. That means the expression would always evaluate to a result and there won't be any divide by zero operation.
Example 1:

Input: ["2", "1", "+", "3", "*"]
Output: 9
Explanation: ((2 + 1) * 3) = 9
Example 2:

Input: ["4", "13", "5", "/", "+"]
Output: 6
Explanation: (4 + (13 / 5)) = 6
Example 3:

Input: ["10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"]
Output: 22
Explanation:
  ((10 * (6 / ((9 + 3) * -11))) + 17) + 5
= ((10 * (6 / (12 * -11))) + 17) + 5
= ((10 * (6 / -132)) + 17) + 5
= ((10 * 0) + 17) + 5
= (0 + 17) + 5
= 17 + 5
= 22
 */
public class EvalRPN {
    public int evalRPN(String[] tokens) {
        Stack<Integer> numContainer=new Stack<>();
        for(String str:tokens){
            int num1;
            int num2;
            switch (str){
                case "+":
                    num1=numContainer.pop();
                    num2=numContainer.pop();
                    numContainer.push(num1+num2);
                    break;
                case "-":
                    num1=numContainer.pop();
                    num2=numContainer.pop();
                    numContainer.push(num2-num1);
                    break;
                case "*":
                    num1=numContainer.pop();
                    num2=numContainer.pop();
                    numContainer.push(num2*num1);
                    break;
                case "/":
                    num1=numContainer.pop();
                    num2=numContainer.pop();
                    numContainer.push(num2/num1);
                    break;
                    default:
                        numContainer.push(Integer.parseInt(str));
            }
        }
        return numContainer.pop();
    }
}
