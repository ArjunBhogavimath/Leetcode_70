class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack =  new ArrayDeque<>();
        for(char ch : s.toCharArray()){
            if(!stack.isEmpty()){
                if(ch == ')'){
                    if(stack.peekLast() == '('){
                        stack.removeLast();
                    }else{
                        return false;
                    }
                }
                else if(ch == '}'){
                    if(stack.peekLast() == '{'){
                        stack.removeLast();
                    }else{
                        return false;
                    }
                }
                else if(ch == ']'){
                    if(stack.peekLast() == '['){
                        stack.removeLast();
                    }else{
                        return false;
                    }
                }
                else{
                    stack.addLast(ch);
                }
            } else{
                stack.addLast(ch);
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
}