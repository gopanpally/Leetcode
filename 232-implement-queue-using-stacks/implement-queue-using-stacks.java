class MyQueue {
    private Stack<Integer> s1;
    private Stack<Integer> s2;

    public MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>(); 
    }
    
    public void push(int x) {
        s1.push(x);  
    }
    
    public int pop() {
        shiftStacksIfNeeded();
        return s2.pop();   
    }
    
    public int peek() {
        shiftStacksIfNeeded();
        return s2.peek();  
    }
    
    public boolean empty() {
        shiftStacksIfNeeded();
        return s2.isEmpty();
    }
    public void shiftStacksIfNeeded()
    {
        if(s2.isEmpty())
        {
            while(!s1.isEmpty())
            {
                s2.push(s1.pop());
            }
        }
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