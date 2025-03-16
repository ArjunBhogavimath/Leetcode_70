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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
         //create a list of list
        List<List<Integer>> levelNodes = new LinkedList<List<Integer>>(); 
        
        if(root == null) return levelNodes;
        queue.offer(root);

        //the while loop will run 1 time for each level, so the output list will contain list of values at that level
        while(!queue.isEmpty()){
            int level = queue.size();
            //create a linkedlist to store value at every level
            List<Integer> subList = new LinkedList<>();
            for(int i =0;i<level;i++){
                if(queue.peek().left != null) {
                    queue.offer(queue.peek().left);
                }
                if(queue.peek().right != null){
                    queue.offer(queue.peek().right);
                }
                subList.add(queue.poll().val);
            }
            levelNodes.add(subList);
        }   
        return levelNodes;
    }
}



/**
for this we need queue
for each level we need to store the right and left elements in queue

steps :
created queue and list of list
1st add the root to queue
and now check if queue is not empty 
then enter the while loop
here create a sublist to store level wise elements
now run a for loop of queue size (initially its one) at the end it will be zero the while loop ends
now check if the element on top has left element, if yes add it to queue
same check for right element , if yes add it queue
at last in for loop poll element and it to the sublist
after the for loop add the value to the ansList.
return ans list
TC : O(N)
SC : O(N) (FOR QUEUE) [ for list of list that is the expectation so it wont be considered as space]
 */