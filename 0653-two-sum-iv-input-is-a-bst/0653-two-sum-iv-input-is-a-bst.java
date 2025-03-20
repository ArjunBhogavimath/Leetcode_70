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
    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> set = new HashSet<>();
        return inOrder(root, set, k);
    }

    public boolean inOrder(TreeNode root, HashSet<Integer> set, int k){
        if(root == null) return false;
        
        int compliment =  k - root.val ;

        if(set.contains(compliment)) return true;
        //need to add data to set
        //if not contains then add that node val to set
        set.add(root.val);

        return inOrder(root.left, set, k) || inOrder(root.right,set,k);
    }
}

/**
Note :  Inorder traversal always return the sorted array for bst (LNR)
if we done the inorder traversal we will get sorted array
then we can perform 2 pointrs on that array
TC : O(N) traverse + O(N) 2 Pointer
SC : O(N)
 */