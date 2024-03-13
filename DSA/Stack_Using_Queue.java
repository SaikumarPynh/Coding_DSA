import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;

public class Stack_Using_Queue {
    Queue<Integer> queue1 = new LinkedList<>();
    Queue<Integer> queue2 = new LinkedList<>();

public int push(int item){
    queue2.add(item);
    while(!queue1.isEmpty()){
        queue2.add(queue1.remove());
    }
    while(!queue2.isEmpty()){
        queue1.add(queue2.remove());
    }
    return item;
}
public int pop(){
    if(queue1.isEmpty()){
        System.out.println("stack is empty");
        return -1;
    }else{
        return queue1.remove();
    }
}
public static void main(String[] args) {
    Stack_Using_Queue obj = new Stack_Using_Queue();
    while(true){
            System.out.println("Enter your choice");
            System.out.println("1.push\n2.pop\3.exit");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                System.out.println("enter the element to be add");
                int item = sc.nextInt();
                    System.out.println(obj.push(item));
                    break;
                case 2:
                System.out.println(obj.pop());
                
                break;
            
                default:
                    break;
            }
        }
    }
}
