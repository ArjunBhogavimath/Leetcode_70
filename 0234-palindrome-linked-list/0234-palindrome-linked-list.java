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
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        //after this while loop the slow pointer will be at middle
        ListNode newHead = reverseList(slow.next);
        ListNode first = head; //1st half head
        ListNode second = newHead; //2nd half head
        //start comparing
        while(second!=null){
            if(first.val != second.val) {
                reverseList(newHead); //need to correct the given array
                return false;
            }
            first = first.next;
            second = second.next;
        }
        reverseList(newHead);
        return true;  
    }
    public ListNode reverseList(ListNode head) {
       ListNode temp = head;
        ListNode prev = null;

        while(temp!=null){
            ListNode front = temp.next; //store the next element
            temp.next = prev; //reversing next to previous elemennt
            prev = temp; // now making temp as previous element
            temp = front; //now temp will be at last // at end it will be at null
        }
        return prev;
    }
}

/*
1.Naive solution : 
Traversing ll once and storing all values in stack
and traverse again and compare with stack pop. 
if it matches it should work, if any elements are left are not matching
then its not palidorme
Tc : O(2n) SC : O(n)

2. Optimal solution (Using tortoise and haire approach) (slow and fast pointer):
a. need to find the middle element O(n/2)
b. reverse the 2nd half of the list O(n/2)
c. compare 1st half with 2nd half O(n/2)
d. reverse back the 2nd half of the ll O(n/2)

TC : O(2n) SC: O(1)
*/