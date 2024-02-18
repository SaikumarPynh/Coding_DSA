
    class Node{
        int data;
        Node next;
    }
    class LinkedList{
        Node head;
        
        public void insertAtStart(int data){
            Node node = new Node();
            node.data = data;
            node.next = head;
            head = node;
        }
        public void insert(int data){
            Node node = new Node();
            node.data = data;
            node.next = null;
            if(head == null){
                head = node;
            }else{
                Node n = head;
                while(n.next != null){
                    n = n.next;
                }
                n.next = node;
            }
        }
        public void show(){
            Node n = head;
            while (n != null) {
                System.out.println(n.data);
                n = n.next;
            }
        }
        
        public void insertAt(int index, int data){
            Node node = new Node();
            node.data = data;
            node.next = null;
            if(index == 0){
                insertAtStart(data);
            }else{
            Node n = head;
            for(int i = 0;i<index -1;i++){
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
        }
        public static void main(String[] args){
            LinkedList list = new LinkedList();
            list.insert(8);
            list.insert(5);
            list.insert(18);
            list.insert(15);
    
            list.insertAt(2,4);
            list.insertAt(0,4);
    
            list.show();
            
        }
    
    }
  