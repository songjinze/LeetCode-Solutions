/*
In a string S of lowercase letters, these letters form consecutive groups of the same character.

For example, a string like S = "abbxxxxzyy" has the groups "a", "bb", "xxxx", "z" and "yy".

Call a group large if it has 3 or more characters.  We would like the starting and ending positions of every large group.

The final answer should be in lexicographic order.



Example 1:

Input: "abbxxxxzzy"
Output: [[3,6]]
Explanation: "xxxx" is the single large group with starting  3 and ending positions 6.
 */

import java.util.ArrayList;
import java.util.List;

/**
In a string S of lowercase letters, these letters form consecutive groups of the same character.

For example, a string like S = "abbxxxxzyy" has the groups "a", "bb", "xxxx", "z" and "yy".

Call a group large if it has 3 or more characters.  We would like the starting and ending positions of every large group.

The final answer should be in lexicographic order.



Example 1:

Input: "abbxxxxzzy"
Output: [[3,6]]
Explanation: "xxxx" is the single large group with starting  3 and ending positions 6.
Example 2:

Input: "abc"
Output: []
Explanation: We have "a","b" and "c" but no large group.
Example 3:

Input: "abcdddeeeeaabbbcd"
Output: [[3,5],[6,9],[12,14]]
 */
public class LargeGroupPositions {


    public List<List<Integer>>largeGroupPositions(String S){
        List<List<Integer>>result=new ArrayList<>();
        int start_ptr=0;
        int end_ptr=0;
        int count;
        int length=S.length();
        while(start_ptr<length){
            count=0;
            while(end_ptr<length&&S.charAt(start_ptr)==S.charAt(end_ptr)){
                count++;
                end_ptr++;
            }
            if(count>=3){
                ArrayList<Integer> oneItem=new ArrayList<>();
                oneItem.add(start_ptr);
                oneItem.add(end_ptr-1);
                result.add(oneItem);
            }
            start_ptr=end_ptr;
        }
        return result;
    }
}
