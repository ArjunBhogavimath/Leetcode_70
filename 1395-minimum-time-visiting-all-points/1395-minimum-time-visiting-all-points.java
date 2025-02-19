class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int time = 0;
        int len = points.length;

        for(int i=1;i<len;i++){
            time += Math.max(Math.abs(points[i][0] - points[i-1][0]),
                            Math.abs(points[i][1] - points[i-1][1]));
        }
        return time;
    }
}

/**
the solution for this needs to be calculated based on co ordinates
we need to do x1-x2 and y1-y2, and get max of it
and add it to time 
and run this loop till the end of the length
TC : O(N) SC: O(1)
 */