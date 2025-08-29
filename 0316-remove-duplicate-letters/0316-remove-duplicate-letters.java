class Solution {
    public String removeDuplicateLetters(String s) {
        
        //Step 1 : create a frequency array
        int[] freq = new int[26];
        for(char ch : s.toCharArray()){
            freq[ch - 'a']++; 
        }

        //step 2 : create a boolean array to check if the element is in stack or not
        boolean[] inStack = new boolean[26];

        //step 3 : create a stack to store the elements
        Deque<Character> stack = new ArrayDeque<>();

        //step 4: iterate through characters
        for(char ch : s.toCharArray()){
            int index = ch - 'a';

            //step 5 : remove the occurence from frequecy array'
            freq[index]--;

            //step 6 : if already present in stack skip it
            if(inStack[index]) continue;

            //step 7: greedy way to decide to remove the last element in stack
            while(!stack.isEmpty() && stack.peekLast() > ch 
                && freq[stack.peekLast() - 'a'] > 0){
                //pop last element
                char removed = stack.removeLast();

                inStack[removed - 'a'] = false;
            }

            //now add the current element to stack
            stack.addLast(ch);
            //and mark it as in stack true
            inStack[index] = true;
        }

        StringBuilder ans = new StringBuilder();
        //as I'm using deque and not a stack, i can directly iterate through it and create a string
        for(char c : stack){
            ans.append(c);
        }

        return ans.toString();

    }
}