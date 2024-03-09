    public class LL{
        private Node head;
        private Node tail;
        private int size = 0;


        class Node{
            private int data;
            private Node next;
            public Node(int data){
                this.data = data;
            }
            public Node(int data,Node next){
                this.data = data;
                this.next = next;
            }
        }
        public int insertAtFirst(int data){
            Node node = new Node(data);
            node.next = head;
            head = node;
            size++;
            if(tail == null){
                tail = head;
            }
            return node.data;
    }   

        public void display(){
            if(head == null){
                System.out.println("Linked List is Empty");
            }
            else{
                Node temp = head;
                while(temp != null){
                    System.out.println(temp.data +" -->");
                    temp = temp.next;
                }
            }

        }
        public Node find(int val){
            if(isEmpty()){
                return null;
            }
            else{
                Node temp = head;
                while(temp != null){
                    if(temp.data == val){
                        return temp;
                    }
                    temp = temp.next;
                }
                return null;
            }
        }

        public int insertAtLast(int data){
            if(tail == null){
                Node node = new Node(data);
                int val = insertAtFirst(data);
                return val;
            }
            else{
                Node node = new Node(data);
                tail.next = node;
                tail = node;
                size++;
                return tail.data;
            }

        }
        public boolean isEmpty(){
            if(head == null){
                return true;
            }else{
                return false;
            }
        }
        public Node getNode(int index){
            Node temp =  head;
            if(!isEmpty()){
                for(int i = 1;i<index;i++){
                    temp = temp.next;
                }
                System.out.println(temp.data);
                return temp;
            }else{
                System.out.println("LL is empty");
                return temp;
            }
        }
        public int deleteFirst(){
            if(!isEmpty()){
            int val = head.data;
            head = head.next;
            size --;
            
            return val;
            }
            return -1;
        }
        public int deleteLast() {
            if (size <= 1) {
                int val = tail.data;
                head = null;
                tail = null;
                return val;
            } else {
                Node prev = getNode(size - 2);
                int val = tail.data;
                tail = prev;
                prev.next = null;
                size--;
                return val;
            }
        }
        public void insert(int data,int index){
            if(size == 0){
                insertAtFirst(data);
            }else if(index == size - 1){
                insertAtLast(data);
            }else{
                Node prev = getNode(index);

                Node node = new Node(data,prev.next);
                prev.next = node;
                size ++;   

            }
        }
        public void delete(int index){
            if(!isEmpty()){
                if(head == tail){
                    head = null;
                    tail = null;
                    size--;
                }
                Node prev = getNode(index - 1);
                prev.next = prev.next.next;

            }
        }

        
        public static void main(String[] args) {
            LL obj  = new LL();
            obj.insertAtFirst(300);
            obj.insertAtFirst(200);
            obj.insertAtLast(400);
            obj.insertAtFirst(100);

            obj.display();
            //  System.out.println("--------");
            // obj.deleteLast();
            // System.out.println("--------");

            // obj.display();
            // System.out.println("--------");

            // obj.delete(1);
            // System.out.println("--------");

            // obj.display();
            System.out.println("--------");

            obj.insert(1100,1);
            System.out.println("--------");

            obj.display();
            System.out.println("--------");
            System.out.println(obj.find(200));


        }
    

    }
