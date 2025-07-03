class Solution {
    public List<String> partitionString(String s) {
        List<String> partitions = new ArrayList<>();

        Set<String> seenSegments = new HashSet<>();

        StringBuilder newSegment = new StringBuilder(); 

        for(int i =0 ;i<s.length();i++){
            newSegment.append(s.charAt(i));
            String temp = newSegment.toString();
            if(!seenSegments.contains(temp)){
                newSegment.setLength(0);
                seenSegments.add(temp);
                partitions.add(temp);   
            }
        }
        return partitions;
    }
}