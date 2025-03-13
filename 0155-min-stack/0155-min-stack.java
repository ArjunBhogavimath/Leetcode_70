class MinStack {
    private Stack<Long> stack;
    private Long min = Long.MAX_VALUE;

    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int val) {
        if(stack.empty()){
            min = Long.valueOf(val);
            stack.push(Long.valueOf(val));
        }
        else{
            if(Long.valueOf(val) > min){
                stack.push(Long.valueOf(val));
            }
            else{
                stack.push(2*Long.valueOf(val)-min);
                min = Long.valueOf(val);
            }
        }
    }

    public void pop() {
        if(stack.empty()) return;
        Long x = stack.peek();
        stack.pop();
        if(x<min){
            min = 2*min-x;
        }
    }

    
    public Long top() {
        if(stack.empty()) return -1l;
        Long x = stack.peek();
        if(min < x) return x;
        return min;
    }
     
    public Long getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */