import java.util.Arrays;
class Stack {
    private int arr[];
    private int top;
    private int capacity;

    // Creating a stack
    Stack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    // Add elements into stack
    public void push(int x) {
        if (isFull()) {
            System.out.println("Overflow\nProgram Terminated\n");
            System.exit(1);
        }

        System.out.println("Inserting " + x);
        arr[++top] = x;
    }

    // Remove element from stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("STACK EMPTY");
            System.exit(1);
        }

        int poppedValue = arr[top--];
        System.out.println("Popped: " + poppedValue);
        return poppedValue;
    }

    // Utility function to return the size of the stack
    public int size() {
        return top + 1;
    }

    // Check if the stack is empty
    public Boolean isEmpty() {
        return top == -1;
    }

    // Check if the stack is full
    public Boolean isFull() {
        return top == capacity - 1;
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        stack.pop();
        System.out.println("\nAfter popping out");
        System.out.println("Stack: " + Arrays.toString(stack.arr));

        stack.pop();
        System.out.println("\nAfter popping out");
        System.out.println("Stack: " + Arrays.toString(stack.arr));
    }
}
