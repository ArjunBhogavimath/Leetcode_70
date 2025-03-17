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
    public TreeNode invertTree(TreeNode root) {
       if(root == null) return null;

        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        
        root.left = right;
        root.right = left;
        return root;
    }
    // public void invert(TreeNode root){
    //     if(root == null) return;

    //     TreeNode temp = root.left;
    //     root.left = root.right;
    //     root.right = temp;

    //     invert(root.left);
    //     invert(root.right);
    // }
}
/**

to invert a binary tree
i can just swap left with right node recursively
 */