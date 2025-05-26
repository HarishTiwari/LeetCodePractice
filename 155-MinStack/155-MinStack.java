// Last updated: 5/27/2025, 12:46:49 AM
class MinStack {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public MinStack() {}

    public void push(int val) {
        stack1.push(val);
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        } else {
            minStack.push(minStack.peek());
        }
    }

    public void pop() {
        stack1.pop();
        minStack.pop();
    }

    public int top() {
        return stack1.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
