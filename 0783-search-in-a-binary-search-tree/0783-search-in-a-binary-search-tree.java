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
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null || root.val == val) return root;

        return root.val < val ? searchBST(root.right, val) : searchBST(root.left, val);
        

        // if(root.val < val){
        //     return searchBST(root.right, val);
        // } else{
        //     return searchBST(root.left, val);
        // }
    }
}

/**

the main advantage we get here
earlier in binary tree we need to check both sides
but here based on the value we can restict to that side
so we can get the data  in O(logN) time
 */