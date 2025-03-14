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

 /**
 easiest way
 only applies while pushing
 step 1 : add an element to queue
 step 2: get the length of the que and substrcat it by 1
 3 : if the length is above 0 then there will be multiple elements in queue
 4 : so now run a while loop till length becomes 0 
 5 : inside that pop the first queue element (1st one removes) and add it back(so it will reach top)
 6 : thats how we will make proper stack using queue
  */