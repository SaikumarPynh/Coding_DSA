import java.util.ArrayList;
import java.util.List;
import java.unitl.Scanner;
 class Main{
    List<Integer> stack;
    int top;
    public  Main(){
        stack = new ArrayList<>();
        top = -1;
    }
    public void push(int val){
        top += 1;
        stack.add(val);
        System.out.println("Pushed elements to the stack.");
        System.out.println(stack);

    }
    public int pop(){
        if(!isEmpty()){
        int ele = stack.remove(top);
        top--;
        System.out.println(stack);

        return ele;
    }else{
        return -1;
    }}
    public boolean isEmpty(){
            return top == -1;
        }
    
    public int peek(){
        if(!isEmpty()) {
            return stack.get(top);
        } return -1;
    }   
    
}
public class Stack_using_ArrayList{
    public static void main(String[] args) {
        Main m = new Main();
        m.push(22);
        m.push(4);
        m.push(3);

        int poppedValue = m.pop();
        System.out.println("Popped element: " + poppedValue);

        int peekedValue = m.peek();
        System.out.println("Peeked element: " + peekedValue);
    }
}