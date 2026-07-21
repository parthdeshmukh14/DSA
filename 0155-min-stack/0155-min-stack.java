class MinStack {
    Stack<Integer>stack=new Stack<>(); 
    Stack<Integer> minStack = new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int value) {
        stack.push(value);
        if (minStack.isEmpty() || value <= minStack.peek()) {
        minStack.push(value);
    }
    }
    
    public void pop() {
         int removed = stack.pop();

    // If the removed element is the current minimum,
    // remove it from minStack too.
    if (removed == minStack.peek()) {
        minStack.pop();
    }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */