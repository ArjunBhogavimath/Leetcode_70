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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode t1 = list1;
        ListNode t2 = list2;

        ListNode dummyNode = new ListNode(-1);
        ListNode temp = dummyNode;
        
        while(t1 != null && t2 != null){
            if(t1.val < t2.val){
                temp.next = t1;
                temp = t1;
                t1 = t1.next;
            } else{
                temp.next = t2;
                temp = t2;
                t2 = t2.next;
            }
        }
        if(t1 != null){
            temp.next = t1;
        } else{
            temp.next = t2;
        }

        return dummyNode.next;

        // ListNode temp1 = list1;
        // ListNode temp2 = list2;
        // ListNode res = list1;
        // ListNode ans;
        // List<Integer> list = new ArrayList<>();
        // while(temp1 != null){
        //     list.add(temp1.val);
        //     temp1 = temp1.next;
        // }
        //  while(temp2 != null){
        //     list.add(temp2.val);
        //     temp2 = temp2.next;
        // }
        // Collections.sort(list);
        // LinkedList<ListNode> linkedList = convertToLinkedList(list);
        // return linkedList.getFirst();
    }
}

/**
1.Naive solution : 
Traverse through each list and store all the elements in an array or list
and sort the list
and conver that list to linkedlist

TC : O(N1) + O(N2) + O(NlogN) + O(N)
SC : O(2N)

2. Optimal solution : Using two pointers and dummy node
as 2 lists are sorted at first
we can directly change the links of 2 lists. by comparing t1 and t2
in this way, we dont use extra space and we can do this in O(N) time (N = n1+n2)
 */