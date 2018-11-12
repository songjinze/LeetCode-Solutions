/**
 * Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
 *
 * For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
 *
 * Example:
 *
 * Given the sorted array: [-10,-3,0,5,9],
 *
 * One possible answer is: [0,-3,9,-10,null,5], which represents the following height balanced BST:
 *
 *       0
 *      / \
 *    -3   9
 *    /   /
 *  -10  5
 */
public class SortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0){
            return null;
        }
        TreeNode res=builder(nums,0,nums.length-1);

        return res;
    }
    private TreeNode builder(int[] nums,int start,int end){
        if(start>end){
            return null;
        }
        int mid=(start+end)/2;
        TreeNode res=new TreeNode(nums[mid]);
        res.left=builder(nums,start,mid-1);
        res.right=builder(nums,mid+1,end);
        return res;
    }
}
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){val=x;}
}