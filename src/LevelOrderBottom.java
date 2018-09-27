import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Stack;

/**
 * Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).
 *
 * For example:
 * Given binary tree [3,9,20,null,null,15,7],
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * return its bottom-up level order traversal as:
 * [
 *   [15,7],
 *   [9,20],
 *   [3]
 * ]
 */
public class LevelOrderBottom {
    private List<List<Integer>> res;

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        dfs(root,1);
        return res;
    }
    private void dfs(TreeNode node,int depth){
        if(res.size()<depth){
            res.add(0,new ArrayList<>());
        }
        if(node.left!=null){
            dfs(node.left,depth+1);
        }
        if(node.right!=null){
            dfs(node.right,depth+1);
        }
        res.get(res.size()-depth).add(node.val);
    }
}
