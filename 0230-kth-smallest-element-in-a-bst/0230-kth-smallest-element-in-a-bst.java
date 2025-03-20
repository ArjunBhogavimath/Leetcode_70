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
    int count = 0;
    int result = -1;
    public int kthSmallest(TreeNode root, int k) {
        inOrder(root,k);
        return result;
    }

    public void inOrder(TreeNode root, int k){
        if(root == null) return;

        inOrder(root.left,k);

        count++;
        if(count == k){
            result = root.val;
            //break from the recurssion
            return;
        }

        inOrder(root.right,k);
    }
}

/**
perform inorder
and after roots left
do count++ (As the left would have went to the least value in the tree)
now check if(count == k ) because when recursion is coming back
the counter will increase,
so when counter == k return that value
 */