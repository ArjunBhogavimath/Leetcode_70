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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;

        targetSum -= root.val;

        //i need to check in somecase if the targetsum == 0 at leaf
        if(root.left == null && root.right == null && targetSum == 0) return true;

        return hasPathSum(root.left,targetSum) || hasPathSum(root.right,targetSum);
        //it will go down left and right node at each level
        //and in some place if the targetSum becomes 0
        //then returns true;
    }
}

/**
i need to go down the tree in recursive approach
how will i get the sum?
i can stat substracting targetsum with current node value
so that when we reach the leaf
the targetsum will be 0
when 0 comes we found the path sum and return true
otherwise return false
 */