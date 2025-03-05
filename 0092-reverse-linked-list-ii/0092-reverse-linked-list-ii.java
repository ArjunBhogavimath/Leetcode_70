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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || head.next == null) return head;
        if(left == right) return head;

        //create dummy node
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode leftPre = dummy;
        ListNode currNode = head;

        for(int i=0;i<left-1;i++){
            leftPre = leftPre.next; // moves till left-1
            currNode = currNode.next; //moves till left
        }

        //make marker to show we are reversing
        ListNode subListHead = currNode; //2 we need this at end

        ListNode preNode = null;
        for(int i=0;i<= right-left;i++){
            ListNode nextNode = currNode.next;
            currNode.next = preNode; //make the sub list head point to null 
            preNode = currNode;
            currNode = nextNode;
        }
        leftPre.next = preNode;
        subListHead.next = currNode;

        return dummy.next;

        // ListNode temp = head;
        // int counter = 1;
        // while(temp.next != null){
        //     if(temp.next.val == counter+1){
        //         ListNode prev = temp; //1
        //         temp = temp.next;
        //         ListNode subListHead = temp; //save the sub list head 2 
        //         int len = (right-left)+1; //3
        //         ListNode currNode = temp;
        //         ListNode preNode = null;
        //         for(int i=0;i<len && currNode.next != null;i++){
        //             ListNode nextNode = currNode.next;
        //             currNode.next = preNode;
        //             preNode = currNode;
        //             currNode = nextNode;
        //         }
        //         prev.next = preNode;
        //         subListHead.next = currNode;//right+1
        //         break;
        //     }
        //     counter++;
        // }
        // return head;
    }
}