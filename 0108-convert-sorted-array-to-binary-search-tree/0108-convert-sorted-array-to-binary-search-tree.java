/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return reccursiveHelperBST(nums, 0, nums.length-1);
    }

    public TreeNode reccursiveHelperBST(int[] nums, int left, int right){
        //edge case
        if(left> right) return null;

        //get the middle
        int mid = (left+right)/2;

        //create root
        TreeNode root = new TreeNode(nums[mid]);

        //now start assigning left and right nodes, reccursively.
        root.left = reccursiveHelperBST(nums, left, mid-1);
        root.right = reccursiveHelperBST(nums, mid+1, right);
        
        //at last return root
        return root;
    }
}

/**
need to solve this reccursively
so we can follow the same approach as binary search
call recursive function
get the mid
and now start assigning left and right by calling recursive function
and at last return root;

 */