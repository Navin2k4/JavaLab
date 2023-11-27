abstract class stackclass {
    protected static final int MAX_SIZE = 5;
    protected int top;
    protected int[] stack;

    stackclass() {
        stack = new int[MAX_SIZE];
        top = -1;
    }

    abstract void push(int value);

    abstract int pop();

    abstract int peek();

    boolean isFull() {
        return top == MAX_SIZE - 1;
    }

    boolean isEmpty() {
        return top == -1;
    }
}

class executestack extends stackclass {
    executestack() {
        super();
    }
    public void push(int value) {
        if (!isFull()) {
            stack[++top] = value;
            System.out.println("Pushed: " + value);
        } else {
            System.out.println("Stack overflow. Cannot push " + value);
        }
    }
    public int pop() {
        if (!isEmpty()) {
            System.out.println("Popped: " + stack[top]);
            return stack[top--];
        } else {
            System.out.println("Stack underflow. Cannot pop.");
            return -1; 
        }
    }
    public int peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack is empty. Cannot peek.");
            return -1; 
        }
    }
}

public class StackMain {
    public static void main(String[] args) {
        executestack stack = new executestack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        stack.push(60); 

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop(); 

        stack.peek(); 
    }
}
