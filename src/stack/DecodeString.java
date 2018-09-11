package stack;

import java.util.Stack;

/*
Given an encoded string, return it's decoded string.

The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.

You may assume that the input string is always valid; No extra white spaces, square brackets are well-formed, etc.

Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k. For example, there won't be input like 3a or 2[4].

Examples:

s = "3[a]2[bc]", return "aaabcbc".
s = "3[a2[c]]", return "accaccacc".
s = "2[abc]3[cd]ef", return "abcabccdcdcdef".
 */
public class DecodeString {
    public String decodeString(String s) {
        Stack<String> stringStack=new Stack<>();
        Stack<Integer> countStack=new Stack<>();
        Stack<Integer> kStack=new Stack<>();
        StringBuilder res= new StringBuilder();
        StringBuilder tempStr= new StringBuilder();
        int i;
        for(int j=0;j<s.toCharArray().length;j++){
            char tempC=s.charAt(j);
            if(tempC>='0'&&tempC<='9'){
                kStack.add(tempC-'0');
            }
            else if(tempC=='['){
                int tempCount=0;
                int tempD=1;
                while(!kStack.isEmpty()){
                    tempCount+=tempD*kStack.pop();
                    tempD*=10;
                }
                if(!countStack.isEmpty()){
                    stringStack.push(tempStr.toString());
                }
                countStack.push(tempCount);
                tempStr = new StringBuilder();
            }
            else if(tempC==']'){
                String tempFullStr=tempStr.toString();
                int tempCount=countStack.pop();
                if(!stringStack.isEmpty()){
                    StringBuilder outTempStr= new StringBuilder(stringStack.pop());
                    for(i=0;i<tempCount;i++){
                        outTempStr.append(tempFullStr);
                    }
                    tempStr=outTempStr;

                }else{
                    for(i=0;i<tempCount;i++){
                        res.append(tempFullStr);
                    }
                    tempStr=new StringBuilder();
                }
            }
            else{
                if(countStack.isEmpty()){
                    res.append(tempC);
                }else{
                    tempStr.append(tempC);
                }
            }
        }
        return res.toString();
    }
}

