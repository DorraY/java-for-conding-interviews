package basics;



public class SortedArrayToBST {

    public TreeNode createBST(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = (left + right ) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = createBST(nums, left,mid-1);
        root.right = createBST(nums, mid +1,right);
        return  root;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return createBST(nums,0,nums.length-1);
    }
}
