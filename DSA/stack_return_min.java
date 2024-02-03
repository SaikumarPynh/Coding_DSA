import java.util.Stack;
public class stack_return_min{
    Stack<Integer> stack;
    Stack<Integer> minstack;
    public stack_return_min(){
        stack= new Stack<>();
        minstack = new Stack<>();
    }

    public void push(int ele){
        stack.push(ele);
        if(minstack.isEmpty()){
            minstack.push(ele);
        }else if(minstack.peek() > ele){
            minstack.push(ele);
        }
    }
    public void pop(){
        if(stack.isEmpty()){
            System.out.println("stack is empty");
        }else{
           int top = stack.pop();
            if(minstack.peek() == top){
                minstack.pop();
            }
            System.out.println("element removed is"+top);
        }
    }
    public void min(){
        if(!minstack.isEmpty()){
            System.out.println("min ele is"+minstack.peek());
        }
    }

    public static void main(String[] args) {
        stack_return_min s = new stack_return_min();
        s.push(10);
        s.push(5);
        s.min();
        s.push(1);
        s.min();
        s.pop();
        s.min();

    }
}