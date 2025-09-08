class Solution {
    public int[] getNoZeroIntegers(int n) {
        int a = 0, b= 0;

        for(int i=0;i<n;i++){
            a = i;
            b = n-i;
            if(!containsZero(a) && !containsZero(b)){
                break;
            }
        }
        return new int[]{a,b};
    }
    
    private boolean containsZero(int n){
        String numStr = String.valueOf(n);
        if(numStr.contains("0")) return true;
        return false;
    }
}