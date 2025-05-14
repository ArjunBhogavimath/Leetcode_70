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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0) return head;

        ListNode temp = head;
        int n = 1;

         // Step 1: Count the length
        while(temp.next != null){
            temp = temp.next;
            n++;
        }

        // Step 2: Optimize k
        k %= n; //avoid rotating multiple times
        if( k == 0) return head;

        //link the tail element to the head
        // Step 3: Connect tail to head to form a circular list
        temp.next = head;

        
        // Step 4: Find new tail (at position n - k - 1)
       ListNode newTail = head;
        for (int i = 0; i < n - k - 1; i++) {
            newTail = newTail.next;
        }

         // Step 5: Set new head and break the loop
        head = newTail.next;
        newTail.next = null;


        return head;
    }
}

/**
 store the head
iterate through the list till it reaches final element
after that run a while loop till k%n (dont need to run loop for k times)
k = k%n
and point the last element next to head
now run a loop again to find n-k-1 element
and connect that element next to head, and make its next element as head before that
and return head
 */