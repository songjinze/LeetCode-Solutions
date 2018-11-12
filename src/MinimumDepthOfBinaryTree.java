/**
 * Given a binary tree, find its minimum depth.
The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
Note: A leaf is a node with no children.
Example:
Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
return its minimum depth = 2.
 */

public class MinimumDepthOfBinaryTree{
    public int minDepth(TreeNode root){
        if(root==null){
            return 0;
        }
        Queue<TreeNode> bfs=new LinkedList<TreeNode>();
        int res=1;
        int count=1;
        int tempCount=1;
        bfs.add(root);
        while(true){
            tempCount=count;
            count=0;
            while(tempCount!=0){
                TreeNode current=bfs.poll();
                if(current.left==null&&current.right==null){
                    return res;
                }
                if(current.left!=null){
                    count++;
                    bfs.add(current.left);
                }
                if(current.right!=null){
                    count++;
                    bfs.add(current.right);
                }
                tempCount--;
            }
            res++;
        }
    }
}
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){val=x;}
}