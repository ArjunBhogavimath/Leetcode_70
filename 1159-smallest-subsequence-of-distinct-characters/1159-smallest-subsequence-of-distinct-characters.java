class Solution {
    public String smallestSubsequence(String s) {
        
        //store the frequency in a array
        //create a boolean array to check if the element is in stack already or not
        //create a stack to store final elements

        int[] freq = new int[26];
        for(char ch : s.toCharArray()){
            freq[ch - 'a']++;
        }

        boolean[] inStack = new boolean[26];

        Deque<Character> stack = new ArrayDeque<>();

        for(char ch : s.toCharArray()){
            int index = ch - 'a';
            //reduce the occurence
            freq[index]--;

            if(inStack[index]) continue;

            while(!stack.isEmpty() && stack.peekLast() > ch && freq[stack.peekLast() - 'a'] > 0){
                char removed = stack.removeLast();

                inStack[removed - 'a'] = false;
            }

            
            stack.addLast(ch);
            inStack[index] = true;
            
        }

        StringBuilder result = new StringBuilder();
        for(char c : stack){
            result.append(c);
        }

        return result.toString();
    }
}