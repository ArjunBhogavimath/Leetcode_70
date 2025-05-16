class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        //lets use minHeap to store height difference, (size is of laddes)
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int i =0;i<heights.length-1;i++){
            int diff = heights[i+1] - heights[i];

            //only add when diff is positive (which means higher building)
            if(diff > 0){
                minHeap.add(diff);
            }

            //now check if the heap size exceeds the ladders height
            //in that case pole and substract it with the bricks
            if(minHeap.size() > ladders){
                bricks -= minHeap.poll();
            }

            //now check if the bricks are remaing or not, if not return i
            if(bricks < 0) return i;
        }

        //otherwise i need to return the last index
        return heights.length-1;
    }
}