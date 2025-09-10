class Solution {
    public String largestOddNumber(String num) {
        int n = num.length();
        if(Integer.parseInt(""+num.charAt(n-1)) % 2 != 0){
            return num;
        }

        for(int i = n-1;i>=0;i--){
            if(Integer.parseInt(""+num.charAt(i)) % 2 != 0){
                return num.substring(0,i+1);
            }
        }
        return "";
    }
}