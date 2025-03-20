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
    int minNode;
    long secondMinNode = Long.MAX_VALUE;
    public int findSecondMinimumValue(TreeNode root) {
        minNode = root.val;
        dfs(root);
        return secondMinNode == Long.MAX_VALUE ? -1 : (int)secondMinNode;
    }
    public void dfs(TreeNode root){
        if(root == null) return;
        
        //follow the pre order traversal
        if(root.val > minNode && root.val < secondMinNode){
            secondMinNode = root.val;
        }
        dfs(root.left);
        dfs(root.right);
    }
}