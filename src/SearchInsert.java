/**
 * Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 *
 * You may assume no duplicates in the array.
 *
 * Example 1:
 *
 * Input: [1,3,5,6], 5
 * Output: 2
 * Example 2:
 *
 * Input: [1,3,5,6], 2
 * Output: 1
 * Example 3:
 *
 * Input: [1,3,5,6], 7
 * Output: 4
 * Example 4:
 *
 * Input: [1,3,5,6], 0
 * Output: 0
 */
public class SearchInsert {
    public int searchInsert(int[] nums, int target) {
        if(nums==null||nums.length==0){
            return 0;
        }
        int start=0,end=nums.length,middle;
        while(start<end){
            middle=(end+start)/2;
            if(nums[middle]==target){
                return middle;
            }
            if(nums[middle]>target){
                end=middle-1;
            }else{
                start=middle+1;
            }
        }
        if(start==nums.length){
            return nums.length;
        }
        else if(nums[start]<target){
            return start+1;
        }
        return start;
    }
    public static void main(String[] args){
        new SearchInsert().searchInsert(new int[]{1,3},2);
    }
}
