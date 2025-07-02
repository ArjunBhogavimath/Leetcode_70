class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans = strs[0];

        for(int i = 1;i<strs.length;i++){
            for(int j= 0;j<strs[i].length() && j<ans.length();j++){
                if(strs[i].charAt(j) != ans.charAt(j)){
                    ans = strs[i].substring(0,j);
                   // break;
                }
            }
        }
        return ans;
    }
}