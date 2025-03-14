class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        
         for(String str : tokens){
            //when we get the signs we should assume that minimum 2 number are already present in stack
            if(str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")){
                int b = stack.pop(); //the last added will be 2nd element so it is b
                int a = stack.pop(); //before last element will be the 1st element a
                int result = 0;

                switch(str){
                    case "+" : 
                        result = a+b;
                        break;
                    case "-" :
                        result = a-b;
                        break;

                    case "*" :
                        result = a*b;
                        break;

                    case "/" :
                        result = a/b;
                }
                stack.push(result);
            } else{
                stack.push(Integer.parseInt(str));
            }
        }
        return stack.pop();

    }
}

/**
only i need to take 2 numbers before the sign
so when we get the sign we will pop 2 elements and perform arithmetic operation
and put it agian in stack
at last pop the last element and return
 */