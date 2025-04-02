class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int l = 0, r = 0, max_length = 0;

        //step 1: create an hash array of size 256 (to store all alhpaebtical order)
        int[] hash_arr = new int[256];
        Arrays.fill(hash_arr,-1);

        //step 2 : now run a while loop with 2 pointer with sliding window approach
        while(r<n){ // till r reaches last element
            //check if that character exists already
            if(hash_arr[s.charAt(r)] != -1){
                if(hash_arr[s.charAt(r)] >= l){
                    l = hash_arr[s.charAt(r)] + 1;
                }
            }
            int len = r-l +1;
            max_length = Math.max(len, max_length);
            hash_arr[s.charAt(r)] = r;
            r++;
        }
        return max_length;


        // int n = s.length();
        // int l = 0;
        // int r = 0;
        // int max_length = 0;

        // int hash_arr[] = new int[256];
        // Arrays.fill(hash_arr, -1);

        // while(r<n){
        //     if(hash_arr[s.charAt(r)] != -1){
        //         if(hash_arr[s.charAt(r)] >= l){ //if the element found is not in the window range and present before that, now you need to move your l to r+1 index
        //             l = hash_arr[s.charAt(r)]+1; 
        //         }
        //     }
        //     int len = r-l+1;
        //     max_length = Math.max(len, max_length);
        //     //now add the char index to array
        //     hash_arr[s.charAt(r)] = r;
        //     r++;  
        // }
        // return max_length;



        //Brute Force
        // int max_length = 0;

        // for(int i=0; i<s.length();i++){
        //     int hash_arr[] = new int[255];
        //     for(int j=i;j<s.length();j++){
        //         if(hash_arr[s.charAt(j)] == 1) break;
        //         int len = j-i+1;
        //         max_length = Math.max(len,max_length);
        //         hash_arr[s.charAt(j)] = 1;
        //     }
        // }
        // return max_length;     
    }
}

/*
1. Brute Force solution
 Need 2 for loops, 1 will start from 0 and another starts from i
 so it will help in getting all possible substrings
 and to avoid repeating characters
 use hashing, 
 create hash array with 255 length and initialize it to 0
 and after that check if that place in array is 1 if yes break
 otherwise remember the length of the substring which is max
 and after that remember the character present by adding it hash array
 and after that print the max length
TC : O(N2)   SC : O(256)

2. Optimal solution: Using Sliding window and 2 pointer approach

1st l and r should also start from 0
create 1 hash array/hash map of length 256 to store characters presence index
so now run a while loop util r crosses string
and inisde that check if that element in the hash array is not equal to -1
if yes then we can assume the element is already present, so we need to store the length and compare for max_length and keep max one
and before that we need to check if the has value of that character (index) is greater than 
or equal to l
in else part add the character index to array
and return max length.
TC : O(N) SC: O(256)

*/