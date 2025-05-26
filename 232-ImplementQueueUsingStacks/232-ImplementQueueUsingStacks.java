// Last updated: 5/27/2025, 12:46:34 AM
import java.util.Stack;

class MyQueue {

    private Stack<Integer> enqueueStack;
    private Stack<Integer> dequeueStack;

    public MyQueue() {
        enqueueStack = new Stack<>();
        dequeueStack = new Stack<>();
    }

    public void push(int x) {
        enqueueStack.push(x);
    }

    public int pop() {
        if (dequeueStack.isEmpty()) {
            transferStacks();
        }
        return dequeueStack.pop();
    }

    public int peek() {
        if (dequeueStack.isEmpty()) {
            transferStacks();
        }
        return dequeueStack.peek();
    }

    public boolean empty() {
        return enqueueStack.isEmpty() && dequeueStack.isEmpty();
    }

    private void transferStacks() {
        while (!enqueueStack.isEmpty()) {
            dequeueStack.push(enqueueStack.pop());
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