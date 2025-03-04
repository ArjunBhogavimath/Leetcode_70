/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}

/*
1.Naive solution :
traverse through array 
find the length
dive by 2 and later get the middle index
Tc : O(n) SC : O(1)

2. Tortoise and Hare algorithm
take 2 pointers slow and fast
slow moves 1 step where fast moves 2 steps
so stop when fast.next is null when length is odd and fast.next.next is odd when length is even
the slow is the middle element.
takes half the time
TC : O(n/2) SC : O(1)
*/