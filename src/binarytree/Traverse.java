package binarytree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * created by IDEA
 *
 * @author: jinze
 * @Date: 18-5-8
 * @Time: 下午2:19
 */
public class Traverse {
    public List<Integer> preOrderTraversal(TreeNode root){
        List<Integer> traversalResult=new ArrayList<>();
        TreeNode current=root;
        Stack<TreeNode>treeNodeStack=new Stack<>();
        while(current!=null||!treeNodeStack.empty()){
            while(current!=null){
                traversalResult.add(current.val);
                treeNodeStack.push(current);
                current=current.left;
            }
            if(!treeNodeStack.empty()){
                current=treeNodeStack.pop();
                current=current.right;
            }
    }
        return traversalResult;
    }
    public List<Integer> inOrderTraversal(TreeNode root){
        List<Integer> traversalResult=new ArrayList<>();
        TreeNode current=root;
        Stack<TreeNode>treeNodeStack=new Stack<>();
        while(current!=null||!treeNodeStack.empty()){
            while(current!=null){
                treeNodeStack.push(current);
                current=current.left;
            }
            if(!treeNodeStack.empty()){
                current=treeNodeStack.pop();
                traversalResult.add(current.val);
                current=current.right;
            }
        }
        return traversalResult;
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer>result=new ArrayList<>();
        TreeNode current=root;
        Stack<TreeNode> traversal_stack=new Stack<>();
        TreeNode pre_ptr=null;
        if(current!=null){
            traversal_stack.push(current);
        }
        while(!traversal_stack.empty()){
            current=traversal_stack.pop();
            traversal_stack.push(current);
            if((current.left==null&&current.right==null)||(pre_ptr!=null&&(pre_ptr.equals(current.left)||(pre_ptr.equals(current.right))))){
                result.add(current.val);
                traversal_stack.pop();
                pre_ptr=current;
            }else{
                if(current.right!=null){
                    traversal_stack.push(current.right);
                }
                if(current.left!=null){
                    traversal_stack.push(current.left);
                }
            }
        }


        return result;
    }
}
