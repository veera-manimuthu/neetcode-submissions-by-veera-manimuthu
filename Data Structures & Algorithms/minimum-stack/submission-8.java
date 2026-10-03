class MinStack {
    private Stack<Integer> stack = null;
    private Stack<Integer> minStack = null;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty() || minStack.peek() >= val) {
            minStack.push(val);
        }
    }

    public void pop() {
        int elem = stack.pop();
        if (!minStack.isEmpty() && minStack.peek().equals(elem)) {
            minStack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.pop();
    }
}
