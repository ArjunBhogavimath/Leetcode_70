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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> avgOnLevels = new LinkedList<>();
        if(root == null) return avgOnLevels;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            List<Double> subList = new LinkedList<>();
            int level = queue.size();
            Double sum = 0d;
            for(int i =0;i<level;i++){
                if(queue.peek().left != null) queue.offer(queue.peek().left);
                if(queue.peek().right != null) queue.offer(queue.peek().right);
                sum+=(double)queue.peek().val;
                subList.add((double)queue.poll().val);  
            }
            Double avg = 0d;
            // for(Double d : subList){
            //     sum+=d;
            // }
            avg = sum/subList.size();
            avgOnLevels.add(avg);
        }
        return avgOnLevels;
    }
}
/**
similar to level order traversal
but instead of storing list of list
I'm just storing avg in list
 */