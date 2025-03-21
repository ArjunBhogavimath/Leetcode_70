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
    int maxSum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        dfs(root);
        return maxSum;
    }

    //postOrder traversal
    public int dfs(TreeNode root){
        if(root == null) return 0;

        //this is just taking left and right whenever it is below 0 as well
        //this avoids in getting max of path
        //so we need to take only leftmax and rightmax when it is greater than 0
        // int left = dfs(root.left);
        // int right = dfs(root.right);

        int leftMax = Math.max(0, dfs(root.left));
        int rightMax = Math.max(0, dfs(root.right));
    
        int sum = root.val + leftMax + rightMax;
        maxSum = Math.max(maxSum, sum);

        return root.val+ Math.max(leftMax,rightMax);
    }
}

/**
run a postorder
check for leftmax and right max of the root with 0
so only we get positive max path
now calulcate sum that is root.val + left + right
now check if this sum is greater than maxsum, if yes replace otherwise ignore
now return root.val + i need to send whichever has max either left or right
 */