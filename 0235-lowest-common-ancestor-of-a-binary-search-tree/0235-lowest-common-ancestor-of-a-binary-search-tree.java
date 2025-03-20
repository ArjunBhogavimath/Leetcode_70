/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
       if(root == null || p==root || q==root) return root;
       if((root.val > p.val && root.val < q.val) || (root.val < p.val && root.val >q.val)) return root;
       
       if(root.val > p.val && root.val > q.val){
            return lowestCommonAncestor(root.left, p, q);
       } else if(root.val < p.val && root.val < q.val){
            return lowestCommonAncestor(root.right, p, q);
       }

       return null;
    }
}

/**
as we have an option to check for root value
we can easily send recursion to go left or right of the node
and based on that we can easily get the anser node
 */