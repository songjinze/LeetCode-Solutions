/**
 Given two binary strings, return their sum (also a binary string).

 The input strings are both non-empty and contains only characters 1 or 0.

 Example 1:

 Input: a = "11", b = "1"
 Output: "100"
 Example 2:

 Input: a = "1010", b = "1011"
 Output: "10101"
 */

public class AddBinary {
    public String addBinary(String a, String b) {
        String longStr,shortStr;
        if(a.length()<b.length()){
            longStr=b;
            shortStr=a;
        }else{
            longStr=a;
            shortStr=b;
        }
        StringBuilder res=new StringBuilder();
        int tempC=0;
        for(int i=shortStr.length()-1,j=longStr.length()-1;j>=0;i--,j--){
            int c;
            if(i>=0) {
                c = longStr.charAt(j) - '0' + shortStr.charAt(i) - '0' + tempC;
            }else{
                c=longStr.charAt(j)-'0'+tempC;
            }
            if(c==2){
                tempC=1;
                c=0;
            }
            else if(c==3){
                tempC=1;
                c=1;
            }else{
                tempC=0;
            }
            res.append(c);
        }
        if(tempC==1){
            res.append(tempC);
        }
        return res.reverse().toString();
    }
}
