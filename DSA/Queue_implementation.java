class Queue{
    int SIZE = 5;
    int front,rear;
    int[] queue;

    public Queue(){
        front = -1;
        rear = -1;
        queue = new int[SIZE];
    }

    public void enqueue(int ele){
        if(rear == SIZE -1){
            System.out.println("queue is full");
        }
        else{
        if(front == -1){
            front = 0;
        }
        rear++;
        queue[rear] = ele;
        System.out.println("element inserted");
    }
    }

    public int dequeue(){
        if(front == -1 || front > rear){
            return -1;
        }
        else{
            front++;
            System.out.println("element removed");

        }
        return queue[front];
    }
    public boolean isEmpty(){
        if(front == -1){
            return true;
        }else{
            return false;
        }
    }


public void display(){
    if(isEmpty()){
        System.out.println("queue is empty");
    }else{
        for(int i = front;i<=rear;i++){
            System.out.println(queue[i]);
        }
    }
}

public static void main(String[] args){
    Queue q = new Queue();
    q.enqueue(7);
    q.display();
    q.enqueue(5);
    q.display();
    q.enqueue(9);
    q.display();
    System.out.println("element deleted"+q.dequeue());

    q.display();


}

}