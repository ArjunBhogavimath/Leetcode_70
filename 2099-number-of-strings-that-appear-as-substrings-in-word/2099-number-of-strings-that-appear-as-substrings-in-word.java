class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int result = 0;
        for(String pattern : patterns){
            if(word.contains(pattern)) result++;
        }
        return result;
    }
}

/**
java has in built function called contains("substring")
we can easily check the substring by using this method
 */