package basics;

import com.sun.source.tree.Tree;


public class TrimABinarySearchTree {
    public TreeNode trimBST(TreeNode root, int low, int high) {
        if (root==null) {
            return  root;
        }
        root.left = root.val >=low ? trimBST(root.left, low,high) : null;
        root.right = root.val <= high ? trimBST(root.right, low,high) : null;

        if (root.val <= high && root.val >= low) {
            return root;
        }

        if (root.val < low) {
            return root.right;
        }
        return root.left;


    }
}
