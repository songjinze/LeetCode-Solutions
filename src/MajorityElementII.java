import java.util.ArrayList;
import java.util.List;

/**
 * Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.
 *
 * Note: The algorithm should run in linear time and in O(1) space.
 *
 * Example 1:
 *
 * Input: [3,2,3]
 * Output: [3]
 * Example 2:
 *
 * Input: [1,1,1,3,3,2,2,2]
 * Output: [1,2]
 */
public class MajorityElementII {
    public List<Integer> majorityElement(int[] nums) {
        int candidate1=0;
        int candidate2=0;
        int count1=0;
        int count2=0;
        for(int num:nums){
            if(num==candidate1){
                count1++;
            }else if(num==candidate2){
                count2++;
            }else if(count1==0){
                candidate1=num;
                count1=1;
            }else if(count2==0){
                candidate2=num;
                count2=1;
            }else{
                count1--;
                count2--;
            }
        }
        List<Integer> res=new ArrayList<>();
        count1=0;
        count2=0;
        for(int num:nums){
            if(num==candidate1){
                count1++;
            }
            if(num==candidate2){
                count2++;
            }
        }
        int length=nums.length;
        if(count1>length/3.0){
            res.add(candidate1);
        }
        if(count2>length/3.0){
            if(candidate1!=candidate2){
                res.add(candidate2);
            }
        }
        return res;
    }
}
