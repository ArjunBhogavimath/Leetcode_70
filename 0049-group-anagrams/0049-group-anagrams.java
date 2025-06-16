class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        /**
        divide each string to a char array
        and sort it
        and  store it as new string
        and add it to a list, if not there
         */

        for(String str : strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            map.computeIfAbsent(sorted, k-> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(map.values());
    }
}