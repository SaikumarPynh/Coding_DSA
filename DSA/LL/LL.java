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

        }
    

    }
