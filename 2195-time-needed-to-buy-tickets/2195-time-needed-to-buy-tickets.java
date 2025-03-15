class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int time = 0;

        for(int i=0;i<tickets.length;i++){
            if(i<=k){
                time += Math.min(tickets[k], tickets[i]);
            } else{
                time += Math.min(tickets[k]-1, tickets[i]);
            }
        }
        return time;


        //Brute force using Queue
        // Queue<Integer> que = new LinkedList<>();
        // int n = tickets.length;
        // for(int i=0;i<n;i++){
        //     que.offer(i);
        // }
        // int time = 0;

        // while(!que.isEmpty()){
        //     int person = que.poll();
        //     if(tickets[person] > 0){
        //         tickets[person]--;
        //         time++;
        //         if(tickets[person] > 0){
        //             que.offer(person);
        //         }
        //     }
        //     if(tickets[k] == 0) return time;
        // }
        // return time;
    }
}


/**
1.Naive solution : using queue
i need to add elements inidces to the queue (not elements)
queue -> 1,2,3,4

now run a while loop (will stop when all the tickets completed)
and pop the elements
and get that indices element in array
now decrease it by 1 and add time if the element > 0
and now check agaun after decreasing if it became 0
otherwise add it to the queue
now check again if tickets[k] == 0
if yes return time

 */