/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * If there is no common prefix, return an empty string "".
 *
 * Example 1:
 *
 * Input: ["flower","flow","flight"]
 * Output: "fl"
 * Example 2:
 *
 * Input: ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 * Note:
 *
 * All given inputs are in lowercase letters a-z.
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String res="";
        if(strs==null||strs.length==0){
            return res;
        }
        res=strs[0];
        for(int i=1;i<strs.length;i++){
            String tempStr=strs[i];
            for(int j=0;j<res.length();j++){
                if(tempStr.length()-1<j||res.charAt(j)!=tempStr.charAt(j)){
                    res=res.substring(0,j);
                    break;
                }
            }
        }
        return res;
    }
}
