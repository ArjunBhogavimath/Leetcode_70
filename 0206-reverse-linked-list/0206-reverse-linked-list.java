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
    public ListNode reverseList(ListNode head) {
        //  ListNode temp = head;
        // Stack<Integer> stack_data = new Stack<>();

        // while(temp != null){
        //     stack_data.push(temp.val);
        //     temp = temp.next;
        // }

        // temp = head;

        // while(temp!=null){
        //     temp.val = stack_data.pop();
        //     temp = temp.next;
        // }
        // return head;

        // ListNode temp = head;
        // ListNode prev = null;

        // while(temp!=null){
        //     ListNode front = temp.next; //store the next element
        //     temp.next = prev; //reversing next to previous elemennt
        //     prev = temp; // now making temp as previous element
        //     temp = front; //now temp will be at last // at end it will be at null
        // }
        // return prev;

        //Recursive approach
        if(head == null || head.next == null) return head;
        ListNode newHead = reverseList(head.next);
        ListNode front = head.next;
        front.next = head; //it will indicate 2nd element from 1st head
        head.next = null; //now we can make the last element points to null

        return newHead;
    }
}


/*

1. Naive solution (Use stack)
loop through LL and put data to stack
now again start looping and over write the data with stack data
TC : O(2n) SC : O(n)

2. Without extra space (Optimal soluton)
the easiest in place solution will be to just reversing the links
for this we have to take prev as null
and make it as head's next and move prev to the head
and save the front as temp.next
run it through the loop
Tc : O(n) SC : O(1)


3. Recursiev approach 
base case will be head is null or head.next is null
and after that call the function with head.next
and try doing the logic of chaging links.
TC : 0(N) SC : 0(N) {However we didnt take any space the recursive stack will takes place to run the code}
*/