class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        //double array {value, numIndex, denIndex}
        PriorityQueue<double[]> pq = new PriorityQueue<>((a,b) -> Double.compare(a[0],b[0]));
        int n = arr.length;

        //we will not go to the last element, because j>i
        for(int i=0;i<n-1;i++){
            double fraction = (double) arr[i] /arr[n-1];
            pq.offer(new double [] {
                fraction,i, n-1
            });
        }
        //by end of this loop we will only have a list of fraction from 1st and last element
        //while the rest will happen below

        while(--k > 0){
            double[] cur = pq.poll();
            int numIndex = (int) cur[1];
            int denIndex = (int) cur[2] - 1; //now taking the next element from right as denominator

            //now we keep on checking till numindex havent reached last index
            //we keep on polling current top and adding the next element by reducing 1 from den.
            if(denIndex > numIndex){
                double fraction = (double) arr[numIndex] /arr[denIndex];
                pq.offer(new double []{
                    fraction,numIndex, denIndex
                });
            }
        }

        //now retrieve the kth smallest fraction from top of the queue
        double[] result = pq.poll();
        return new int[]{arr[(int) result[1]], arr[(int) result[2]]};
    }
}