class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i =0;i<stones.length();i++){
            map.put(stones.charAt(i), map.getOrDefault(stones.charAt(i), 0) + 1);
        }
        int counter = 0;
        for(int i = 0;i<jewels.length();i++){
            counter += map.getOrDefault(jewels.charAt(i),0);
        }
        return counter;
    }
}

/**
1. add stones to map with frequency
2. now check if jewels exists in map
3. if exists add the frequency to the counter
4. return the counter

 */