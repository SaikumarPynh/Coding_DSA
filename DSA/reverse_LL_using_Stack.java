import java.util.Stack;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    // Method to insert a node at the beginning of the linked list
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    // Method to reverse the linked list using a stack
    public void reverseUsingStack() {
        if (head == null ) {
            return; // Nothing to reverse if list is empty or has only one node
        }
    
        Stack<Integer> stack = new Stack<>();
        Node current = head;
    
        // Push all nodes' data onto the stack
        while (current != null) {
            stack.push(current.data);
            current = current.next;
        }
    
        // Update the linked list with popped data values
        current = head;
        while (!stack.isEmpty()) {
            int data = stack.pop();
            current.data = data; // Update current node's data
                // current.next = new Node(0); // Create a new node for the next data value
                current = current.next; // Move to the next node
            
        }
    }
    
    // Method to display the linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        System.out.println("Original linked list:");
        list.display();

        list.reverseUsingStack();

        System.out.println("Reversed linked list:");
        list.display();
    }
}
