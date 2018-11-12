/**
 * Implement an iterator over a binary search tree (BST). Your iterator will be initialized with the root node of a BST.

Calling next() will return the next smallest number in the BST.

Note: next() and hasNext() should run in average O(1) time and uses O(h) memory, where h is the height of the tree.
 */
import java.util.LinkedList;
import java.util.List;
public class BSTIterator {

    private TreeNode current;
    private List<TreeNode> sortedNodes;
    private int listLength;
    private int currentIndex;
    public BSTIterator(TreeNode root) {
        current=root;
        sortedNodes=initSortedNodes(root);
        currentIndex=0;
        listLength=sortedNodes.size();
    }

    /**
     * 从小到大排列
     */
    private List<TreeNode> initSortedNodes(TreeNode root){
        List<TreeNode>currentList=new LinkedList<>();
        currentList.add(root);
        if(root.left!=null){
            currentList.addAll(0, initSortedNodes(root.left));
        }
        if(root.right!=null){
            currentList.addAll(initSortedNodes(root.right));
        }
        return currentList;
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        if(currentIndex<listLength){
            return true;
        }else{
            return false;
        }
    }

    /** @return the next smallest number */
    public int next() {
        int res= sortedNodes.get(currentIndex).val;
        currentIndex++;
        return res;
    }
}

class TreeNode
{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){val=x;}
}
