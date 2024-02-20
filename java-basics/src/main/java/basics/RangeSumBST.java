package basics;


public class RangeSumBST {
    public int rangeSumBST(TreeNode root, int low, int high) {

        if (root==null) {
            return 0;
        }

        int left = root.val>=low ? rangeSumBST(root.left, low, high) : 0;
        int right = root.val<= high ? rangeSumBST(root.left, low, high) : 0;
        int sum = left + right;
        if (root.val <= high && root.val >= low) {
            sum += root.val;
        }
        return sum;



    }
}
