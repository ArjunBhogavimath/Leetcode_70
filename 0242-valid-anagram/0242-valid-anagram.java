class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        int[] freq = new int[26];

        /**
        create freq array
        and loop through the string and start incrementing counter for s
        and similarly decrement for t
        in this way if there are equal characters only 0 will be left
         */

        for(int i=0;i<s.length();i++){
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        //check for array if there is any non zero element,
        //if not return true;

        for(int c : freq){
            if( c!=0 ){
                return false;
            }
        }

        return true;
    }
}