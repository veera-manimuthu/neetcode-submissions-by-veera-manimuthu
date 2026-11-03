class MinStack {
    Stack<Integer> stack = null;
    Stack<Integer> minStack = null;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        minStack.push(val);
    }

    public void pop() {
        int pop = stack.pop();
        if (!minStack.isEmpty()) {
            minStack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        if (!minStack.isEmpty())
            return minStack.pop();
        else
            return -1;
    }
}
