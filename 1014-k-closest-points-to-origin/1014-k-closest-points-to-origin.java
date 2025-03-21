class Solution {
    public int[][] kClosest(int[][] points, int k) {
        //for reverse order of priorityqueue, we used this comparator
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a,b) -> 
                            Integer.compare(distance(b), distance(a)));//reverse order for maxheap
                            //generally it is a min heap
        
        for(int[] point : points){
            maxHeap.offer(point);
            if(maxHeap.size() > k){
                maxHeap.poll();
            }
        }

        int[][] result = new int[k][2];
        for(int i=0;i<k;i++){
            result[i] = maxHeap.poll();
        }
        return result;
    }

    public int distance(int[] point){
        return point[0]*point[0] + point[1]*point[1];
    }
}