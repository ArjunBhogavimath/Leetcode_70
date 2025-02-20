class Solution {
    public int longestMountain(int[] arr) {
        /**
        find peek
        take 2 pointers l and r
        go left and right 
        get start and end points 
        return end-start+1
         */

        int longest_mountain = 0;


        //we can ignore 1st and last index as they cant be peek
        for(int i=1;i<arr.length-1;i++){
            int peek = 0;
            if(arr[i-1]<arr[i] && arr[i]>arr[i+1]){
                peek = arr[i];

                //2 pointer
                int left = i;
                int right = i;

                while(left>0 && arr[left] > arr[left-1]) left--;
                while(right<arr.length-1 && arr[right] > arr[right+1]) right++;

                int mountain = right - left +1;
                longest_mountain = Math.max(longest_mountain, mountain);
            }
        }
        return longest_mountain;
        
    }
}

/**
this solution done in 1 pass
and O(1) SPACE
 */