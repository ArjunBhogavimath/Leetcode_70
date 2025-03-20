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
class BSTIterator {

    Stack<TreeNode> stack;

    public BSTIterator(TreeNode root) {
        stack = new Stack<>(); //iniailised satck
        pushLeft(root);
    } 
    
    public int next() {
        TreeNode poppedNode = stack.pop();
        if(poppedNode.right != null){
            pushLeft(poppedNode.right);
        }
        return poppedNode.val;
    }
    
    public boolean hasNext() {
        if(stack.isEmpty()) return false;
        return true;
    }

    public void pushLeft(TreeNode root){
        while(root != null){
            stack.push(root);
            root = root.left;
        }
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */


 /**
 we can achieve O(h) space by storing only tree height of elements (i.e., only left)
 after that if next pop the element
 and check if that root has any right child, 
 if exists then add all those right childs to the stack
 now peorform hasnext and next operations
 
  */