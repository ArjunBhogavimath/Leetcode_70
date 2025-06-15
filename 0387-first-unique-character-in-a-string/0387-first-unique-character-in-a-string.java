class Solution {
    public int firstUniqChar(String s) {
        //use 26 char array
        int[] freq = new int[26];

        //add the frequency to that character's index
        // we will get the index by substracting it with 'a'
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i) - 'a']++;
        }


        //now loop through the string again to check what is the value in that index
        //if it equals to 1 return that index
        //otherwise we can return -1;
        for(int i=0;i<s.length();i++){
            if(freq[s.charAt(i) - 'a'] == 1){
                return i;
            }
        }

        return -1;
    
    }
}