class MyStack {
    Queue<Integer> que;

    public MyStack() {
        que = new LinkedList<>();
    }
    
    public void push(int x) {
        que.add(x);
        int swap_len = que.size()-1;
        while(swap_len > 0){
            que.add(que.poll());
            swap_len--;
        }
    }
    
    public int pop() {
        return que.remove();
    }
    
    public int top() {
        return que.peek();
    }
    
    public boolean empty() {
        if(que.isEmpty()) return true;
        return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */