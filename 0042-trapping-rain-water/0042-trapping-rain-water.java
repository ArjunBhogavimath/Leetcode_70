class Solution {
    public int trap(int[] height) {
        int total_water =0;
        int n = height.length;
        int prefix_max[] =  new int[n];
        int suffix_max[] =  new int[n];

        prefix_max[0] = height[0];
        for(int i = 1; i < n-1; i++){
            prefix_max[i] = Math.max(prefix_max[i-1], height[i]);
        }
        suffix_max[n-1] = height[n-1];
        for(int i = n-2; i >=0; i--){
            suffix_max[i] = Math.max(suffix_max[i+1], height[i]);
        }

        for(int i=0;i<n;i++){
            if(height[i] < prefix_max[i] && height[i] < suffix_max[i]){
                total_water += Math.min(prefix_max[i], suffix_max[i]) - height[i];
            }
        }
        return total_water;
    }
}

/**
1. Using prefix max and suffi max:
so we will get a prefix max in new array
and suffix max in another array
this will help us to get what quantity of water that block can hold
for that we will use a formula
1st : get the min of suffix or prefix
and then subtract it with a[i] //so that we will remove block space
 */