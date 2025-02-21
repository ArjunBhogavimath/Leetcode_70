class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> ans_list = new ArrayList<>();
        int n = arr.length;

        Arrays.sort(arr);

        //take as max value
        int min_difference = Integer.MAX_VALUE;

        //get the min_difference
        for(int i=1;i<n;i++){
            int temp = arr[i]-arr[i-1];
            min_difference = Math.min(temp, min_difference);
        }
         System.out.println(min_difference);

        //now start a new sliding window to get the pairs whose differece is min_dif
        for(int i=1;i<n;i++){
             System.out.println(arr[i]+" "+arr[i-1]);
             //check if arr[i] and arr[i-1] equals to min_dif. if yes then put it in list
            if(arr[i]-arr[i-1] == min_difference){
                System.out.println(arr[i]+" "+arr[i-1]);
                List<Integer> list = Arrays.asList(arr[i-1],arr[i]);
                ans_list.add(list);
            }
        }
        return ans_list;
    }
}

/**
sort the array
get the 1st difference
now run a for loop

TC : O(NlogN) [Sorting] + O(N) [min_dif] + O(N) [find pairs] = O(Nlogn)+O(N)
SC : O(N)
 */