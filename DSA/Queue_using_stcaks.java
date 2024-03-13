import java.util.Scanner;
import java.util.Stack;
class Queue{
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();
    public int enqueue(int item){
        stack1.push(item);
        return item;
    }
    public int dequeue(){
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        if(!stack2.isEmpty()){
            return stack2.pop();
        }else{
            return -1;
        }
    }
    public static void main(String[] args){
        Queue obj = new Queue();
        while(true){
            System.out.println("Enter your choice");
            System.out.println("1.Enqueue\n2.Deqeue\3.exit");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                System.out.println("enter the element to be add");
                int item = sc.nextInt();
                    System.out.println(obj.enqueue(item));
                    break;
                case 2:
                System.out.println(obj.dequeue());
                
                break;
            
                default:
                    break;
            }
        }
    }
 }