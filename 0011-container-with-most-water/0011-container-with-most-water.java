class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n-1;
        int max_area = 0;

        while(left<=right){
                                    // height                      width
            int area = Math.min(height[left], height[right]) * (right-left);
            max_area = Math.max(area, max_area);

            if(height[left] < height[right]){
                left++;
            } else{
                right--;
            }
        }
        return max_area;
    }
}

/**
2 pointers:
take 2 pointers left and right at each end
now calculate the current area, 
and check with max area
and based on which height is lesser move that pointer
return max_area
 */