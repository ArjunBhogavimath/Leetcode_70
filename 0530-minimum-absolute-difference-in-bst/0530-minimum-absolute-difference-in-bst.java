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
    int ans = Integer.MAX_VALUE;
    TreeNode prev = null;
    public int getMinimumDifference(TreeNode root) {
        inOrder(root);
        return ans;
    }
    public void inOrder(TreeNode root){
        if(root == null) return;

         inOrder(root.left);
         if(prev != null){
            int temp = Math.abs(prev.val - root.val);
            ans = Math.min(ans, temp);
        }
        prev = root;
    
        inOrder(root.right);
    }
}