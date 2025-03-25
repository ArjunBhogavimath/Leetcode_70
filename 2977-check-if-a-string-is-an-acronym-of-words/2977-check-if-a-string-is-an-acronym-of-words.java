class Solution {
    public boolean isAcronym(List<String> words, String s) {
        int i =0;
        if(words.size() != s.length()) return false;
        for(String word : words){
           if(word.charAt(0) != s.charAt(i)){
                return false;
           }
           i++;
        }
        return true;
    }
}