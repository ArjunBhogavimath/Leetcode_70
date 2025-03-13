class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        stack.push(s.charAt(0));
            
        for(int i=1;i<s.length();i++){
           
             if(s.charAt(i) == ')'){
                if(!stack.empty() && stack.peek() == '('){
                    stack.pop();
                } else{
                    return false;
                }
            }

            else if(s.charAt(i) == '}'){
                if(!stack.empty() && stack.peek() == '{'){
                    stack.pop();
                } else{
                    return false;
                }
            }

            else if(s.charAt(i) == ']'){
                if(!stack.empty() && stack.peek() == '['){
                    stack.pop();
                } else{
                    return false;
                }
            }
            else{
                stack.push(s.charAt(i));
            }
        }
        if(stack.empty()){
            return true;
        }
        return false;
    }
}