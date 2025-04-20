class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int ans = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0, j = 0;

        while(i<g.length && j < s.length){
            if(s[j] >= g[i]) { //greed satisifed
                ans++;
                i++;
                j++;
            } else if(g[i] > s[j]){
                j++;
            }
        }
        return ans;
    }
}

/**
sort both arrays
now take 2 pointers
1 at greed array and 1 at s array
now start checking if s[j] >= g[i], {
    counter++;
    i++;
    j++;
} else if greed[i] > s[j]{
    j++;
}
 */