class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        //max heap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> 
                                        Integer.compare(map.get(a),map.get(b)));

        for(int num : map.keySet()){
            maxHeap.offer(num);
            if(maxHeap.size()>k){
                maxHeap.poll();
            }
        }

        int[] result = new int[k];
        for(int i=0;i<k;i++){
            result[i] = maxHeap.poll();
        }

        return result;
        
    }
}


/**
1 approach :
store it in a map
and after that store that elements to maxHeap 
and later get the top k elements

2. store it in hashmap
do the bucket sort

 */