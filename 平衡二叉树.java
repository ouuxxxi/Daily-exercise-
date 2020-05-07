package March;

import javax.swing.tree.TreeNode;
//平衡二叉树
public class Day23 {
    class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
        public TreeNode(int val) {
            this.val = val;
        }
    }
    public boolean isBalance(TreeNode root) {
        if(root==null){
            return true;
        }

        int a = maxLen(root.left);
        int b = maxLen(root.right);
        if(Math.abs(a-b)>1){
            return false;
        }

        return isBalance(root.left) && isBalance(root.right);

    }


    public int maxLen(TreeNode root){
        if(root==null){
            return 0;
        }
        int len1 = maxLen(root.left);
        int len2 = maxLen(root.right);
        return Math.max(len1,len2)+1;
    }
}
