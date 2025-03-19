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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return null;

        if(root.val > key){
            root.left = deleteNode(root.left, key);
        } else if(root.val < key){
            root.right = deleteNode(root.right, key);
        } else{
            //case 1 : leaf node
            if(root.left == null && root.right == null) return null;
            //case 2 : 1 child
            if(root.left == null) return root.right;
            if(root.right == null) return root.left;

            //case 3 : in case of more childrens
            //we need to cut that whole root and paste it on the opposite side last node
            //if we are removing from left node
            //then we need to goto last element of the right node's left chil
            //and attach it there
            // and vice versa

            TreeNode successor = findMin(root.right);
            root.val = successor.val;
            root.right = deleteNode(root.right, successor.val);
        }
        return root;
    }

    public TreeNode findMin(TreeNode node){
        while(node.left != null) node = node.left;
        return node;
    }
}