class Solution {
    public int[] sumZero(int n) {
        //usually pairs (1,-1) cancels out
        //if odd, add 0 as well
        int result[] =  new int[n];

        for(int i = 1;i<n;i+=2){
            result[i-1] = i;
            result[i] = -i;
        }

        if(n % 2 != 0){
            result[n-1] = 0; 
        }
        return result;

    }
}