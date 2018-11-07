/**
 * Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.
 *
 * The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2.
 *
 * Note:
 *
 * Your returned answers (both index1 and index2) are not zero-based.
 * You may assume that each input would have exactly one solution and you may not use the same element twice.
 * Example:
 *
 * Input: numbers = [2,7,11,15], target = 9
 * Output: [1,2]
 * Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.
 */
public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        int midNum=target/2;
        int index1=0;
        int index2=0;
        for(int i=0;i<numbers.length-1;i++){
            if(numbers[i]<=midNum&&numbers[i+1]>=midNum){
                index1=i;
                index2=i+1;
            }
            if(numbers[i]>midNum){
                break;
            }
        }
        if(index1!=0&&numbers[index1-1]==numbers[index2-1]){
            index1--;
            index2--;
        }
        while(numbers[index1]+numbers[index2]!=target){
            if(numbers[index1]+numbers[index2]>target){
                index1--;
            }
            else if(numbers[index1]+numbers[index2]<target){
                index2++;
            }
        }
        int[]result=new int[2];
        result[0]=index1+1;
        result[1]=index2+1;
        return result;
    }
}
