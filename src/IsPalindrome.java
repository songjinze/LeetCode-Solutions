/**
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 *
 * Note: For the purpose of this problem, we define empty string as valid palindrome.
 *
 * Example 1:
 *
 * Input: "A man, a plan, a canal: Panama"
 * Output: true
 * Example 2:
 *
 * Input: "race a car"
 * Output: false
 */

public class IsPalindrome {
    public boolean isPalindrome(String s) {
        if(s.equals("")){
            return true;
        }
        int length=s.length();
        int headIndex=0;
        int tailIndex=length-1;
        char headCur,tailCur;
        while(headIndex<=tailIndex){
            headCur=s.charAt(headIndex);
            tailCur=s.charAt(tailIndex);
            while(!((headCur>='a'&&headCur<='z')||(headCur>='A'&&headCur<='Z')||(headCur>='0'&&headCur<='9'))){
                headIndex++;
                if(headIndex==length){
                    break;
                }
                headCur=s.charAt(headIndex);
            }
            while(!((tailCur>='a'&&tailCur<='z')||(tailCur>='A'&&tailCur<='Z')||(tailCur>='0'&&tailCur<='9'))){
                tailIndex--;
                if(tailIndex<0){
                    break;
                }
                tailCur=s.charAt(tailIndex);
            }
            if(tailIndex<0&&headIndex==length){
                break;
            }
            if(!(tailCur==headCur||((tailCur-headCur=='A'-'a')&&(tailCur>='A'&&tailCur<='Z'&&headCur>='a'&&headCur<='z'))
                    ||((headCur-tailCur=='A'-'a')&&(headCur>='A'&&headCur<='Z'&&tailCur>='a'&&tailCur<='z')))){
                return false;
            }else{
                headIndex++;
                tailIndex--;
            }
        }
        return true;
    }
}
