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
    ArrayList<Integer> sortedValues = new ArrayList<>();
    public TreeNode balanceBST(TreeNode root) {
        inOrder(root);
        return constructBST(0, sortedValues.size()-1);
    }

    public void inOrder(TreeNode root){
        if(root == null) return;

        inOrder(root.left);
        sortedValues.add(root.val);
        inOrder(root.right);
    }

    public TreeNode constructBST(int left, int right){
        if(left>right) return null;
        int mid =  (left+right)/2;

        TreeNode newNode = new TreeNode(sortedValues.get(mid));
        newNode.left = constructBST(left, mid-1);
        newNode.right = constructBST(mid+1, right);

        return newNode;
    }
}

/**
1st i need to traverse in inOrder way
and store the elements in list.
now perform a binary search opertaion on this list
that is make the middle element as root node
and recursively add left and right value
 */