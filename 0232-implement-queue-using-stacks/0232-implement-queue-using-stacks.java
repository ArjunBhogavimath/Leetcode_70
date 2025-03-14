class MyQueue {
    //using 2 stacks to get the 1st element at last
    Stack<Integer> s1;
    Stack<Integer> s2;

    public MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }
    
    public void push(int x) {
       s1.push(x);
    }
    
    public int pop() {
        if(!s2.empty()){
            return s2.pop();
        }
        else{
            while(s1.size() > 0){
                s2.push(s1.pop());
            }
            return s2.pop();
        }
        
    }
    
    public int peek() {
        if(!s2.empty()){
            return s2.peek();
        }
        while(s1.size() > 0){
            s2.push(s1.pop());
        }
        return s2.peek();
    }
    
    public boolean empty() {
       if(s1.size() > 0 || s2.size() > 0) return false;
       return true;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */


 /**
 Naive soultion :
  
 Use 2 stacks
 step  1 : s1 to s2
 step 2 :x -> s1
 step 3  : s2 -> s1
 

 Optimal approach :
 take 2 stacks
 push the elements to s1 
 when the pop comes 
 push all elements from s1 to s2
 now do the s2.pop() 

 push(x)	O(1)
pop()	O(n) (only when s2 is empty, otherwise O(1))
peek()	O(n) (only when s2 is empty, otherwise O(1))
empty()	O(1)

  */