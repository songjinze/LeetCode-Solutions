/**
 * Implement strStr().
 *
 * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 *
 * Example 1:
 *
 * Input: haystack = "hello", needle = "ll"
 * Output: 2
 * Example 2:
 *
 * Input: haystack = "aaaaa", needle = "bba"
 * Output: -1
 * Clarification:
 *
 * What should we return when needle is an empty string? This is a great question to ask during an interview.
 *
 * For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().
 */
public class ImplementStrStr {
    public int strStr(String haystack, String needle) {
        int i=0;
        if(haystack==null||haystack.length()<needle.length()){
            return -1;
        }
        if(haystack.equals("")&&haystack.equals("")){
            return 0;
        }
        int j;
        boolean isMatch;
        while(i<haystack.length()){
            isMatch=true;
            for(j=0;j<needle.length();j++){
                if(i+j>=haystack.length()||needle.charAt(j)!=haystack.charAt(i+j)){
                    isMatch=false;
                    break;
                }
            }
            if(isMatch){
                return i;
            }else{
                i++;
            }
        }
        return -1;
    }
}
