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
        if (root == null) {
            return null; // Base case: key not found
        }

        // Search for the node to delete
        if (key < root.val) {
            root.left = deleteNode(root.left, key); // Recur on the left subtree
        } else if (key > root.val) {
            root.right = deleteNode(root.right, key); // Recur on the right subtree
        } else {
            // Node to delete found

            // Case 1: Node has no children (leaf node)
            if (root.left == null && root.right == null) {
                return null;
            }

            // Case 2: Node has only one child
            if (root.left == null) {
                return root.right; // Replace with right child
            }
            if (root.right == null) {
                return root.left; // Replace with left child
            }

            // Case 3: Node has two children
            // Find the in-order successor (smallest in the right subtree)
            TreeNode successor = findMin(root.right);
            // Copy the successor's value to the current node
            root.val = successor.val;
            // Delete the successor node
            root.right = deleteNode(root.right, successor.val);
        }

        return root;
    }

    // Helper function to find the smallest node in a subtree
    private TreeNode findMin(TreeNode node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    // public TreeNode deleteNode(TreeNode root, int key) {
    //     if(root == null) return null;

    //     if(root.val > key){
    //         root.left = deleteNode(root.left, key);
    //     } else if(root.val > key){
    //         root.right = deleteNode(root.right, key);
    //     } else{
    //         //case 1 : leaf node
    //         if(root.left == null && root.right == null) return null;
    //         //case 2 : 1 child
    //         if(root.left == null) return root.right;
    //         if(root.right == null) return root.left;

    //         //case 3 : in case of more childrens
    //         //we need to cut that whole root and paste it on the opposite side last node
    //         //if we are removing from left node
    //         //then we need to goto last element of the right node's left chil
    //         //and attach it there
    //         // and vice versa

    //         TreeNode successor = findMin(root.right);
    //         root.val = successor.val;
    //         root.right = deleteNode(root.right, successor.val);
    //     }
    //     return root;
    // }

    // public TreeNode findMin(TreeNode node){
    //     while(node.left != null) node = node.left;
    //     return node;
    // }
}