/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        //1.Naive solution
        // if(head == null || head.next == null) return false;
        // Map<ListNode, Integer> map = new HashMap<>();
        // ListNode temp = head;
        // while(temp != null){
        //     if(map.containsKey(temp)) return true;
        //     map.put(temp,1);
        //     temp = temp.next;
        // }
        // return false; 

        //2.Tortoise and hare algorithm
        ListNode slow = head;
        ListNode fast = head;

        //check for null
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) return true; //they collided so cycle exist
        }
        return false;
    }
}


/**
1. Naive solution :
for this we need to use hashing
so take a hashmap and store all the elements in map with node and value
check if the node is already present. if yes, return true.
if reaches null return false
Tc : O(n) SC : O(n)

2.Optimal solution :  Tortoise and hare algorithm
For this start with slow and fast pointer
and start moving, at one place they will colide, 
if they collide it will be cycle, if we find null node first
then its not a loop
TC : O(N) approx. SC: O(1)
 */