class Solution {
    public int findKthLargest(int[] nums, int k) {  
        Queue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
            if(pq.size() > k){
                pq.poll();
            }
        }
        return pq.peek(); 
    }
}

/**
1. Brute force:
sort the array and return k-1th element.
TC:O(NlogN) SC: O(1)

2. Using max_heap:
use priority queue, add elements to the queue
if the size is greater than k
start ppping element(which will pop largest element)
so at last we will have our kth smallest at top of the queue.
TC: O(N) SC:O(K)
 */