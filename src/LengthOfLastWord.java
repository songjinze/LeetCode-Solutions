/**
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
 *
 * If the last word does not exist, return 0.
 *
 * Note: A word is defined as a character sequence consists of non-space characters only.
 *
 * Example:
 *
 * Input: "Hello World"
 * Output: 5
 */
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        if(s.equals("")){
            return 0;
        }
        int lastSpaceIndex=-1;
        int tempSpaceIndex=-1;
        int lastWordIndex=-1;
        int index=-1;
        for(char c:s.toCharArray()){
            index++;
            if(c==' '){
                tempSpaceIndex=index;
            }else{
                lastWordIndex=index;
                lastSpaceIndex=tempSpaceIndex;
            }
        }
        return lastWordIndex-lastSpaceIndex;
    }
}
