class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));

        List<int[]> result = new ArrayList<>();

        int[] currentInterval = intervals[0];
        result.add(currentInterval);

        for(int[] interval : intervals){
            if(interval[0] <= currentInterval[1]){
                //only replace the end time
                currentInterval[1] = Math.max(interval[1],currentInterval[1]);
            } else {
                currentInterval = interval;
                result.add(currentInterval);
            }
        }

        return result.toArray(new int[result.size()][]);
    }
}

//sort by start 