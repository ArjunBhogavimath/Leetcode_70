class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        //get the lenght of m and n
        int n = matrix.length;
        int m = matrix[0].length;

        //get the left right top bottom points
        int left = 0;
        int top = 0;
        int right = m-1;
        int bottom = n-1;

        /**
        we need to start towards right
        and do top ++;
        then go towards bottom
        and do right --;
        then go towards left
        and do bottom--;
        then go towards top
        and do left++;
         */

            System.out.println(matrix[top][0]);
        //the loop will run till all the inner loops completed
        while (top <= bottom && left <= right) {
             System.out.println("inisde while loop");
            for(int i=left;i<=right;i++){
                list.add(matrix[top][i]);
                System.out.println(matrix[top][i]);
            }
            top++;
            

            for(int i=top;i<=bottom;i++){
                list.add(matrix[i][right]);
            }
            right--;

            if(top<=bottom){
                for(int i=right;i>=left;i--){
                list.add(matrix[bottom][i]);
            }
            bottom--;
            }
            
            if(left<=right){
            for(int i=bottom;i>=top;i--){
                list.add(matrix[i][left]);
            }
            left++;
            }
        }
        return list;
    }
}

//make proper diagram to understand better
//TC : O(M*N) SC: O(1)