public class DLL {
    public Node head;
    public Node last;

    public void insertFirst(int data){
        Node node = new Node(data);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        if(head  == null){
            last  = node;
        }
        head = node;
    }
    public void insertLast(int data){
        Node node = new Node(data);
        node.next = null;
        node.prev = last;
        if(last != null){
            last.next = node;
        }
        if(last  == null){
            head  = node;
        }
        last  = node;
    }
    public void insertAfterAValue(int after,int val){
        Node temp = head;
        Node node = new Node(val);
        if(head == null){
            System.out.println("LL is empty");
            insertFirst(val);
        }
        else{
            while(temp != null){
                if(temp.val == after){
                    node.prev = temp;
                    node.next = temp.next;
                    if(temp.next != null){
                    temp.next.prev = node;
                    }else{
                        last = node;
                    }
                    temp.next = node;
                    break;
                }
                temp = temp.next;
            }
        }
    }
    public int deleteFirst(){
        if(head == null){
            return -1;
        }else{
            int data = head.val;
            head = head.next;
            head.prev = null;
            return data;
        }
    }
    public int deleteLast(){
        if(head == null){
            return -1;
        }else{
            int data = last.val;
            last = last.prev;
            last.next = null;
            return data;
        }
    }
    public Node find(int val){
        Node temp = head;
        if(head == null){
            return null;
        }else{
            while(temp !=null){
                if(temp.val == val){
                    return temp;
                }
                temp = temp.next;
            }
            return null;
        }

    }
    public void delete(int val){
        Node node = find(val);
        if(node.prev != null){
            node.prev.next = node.next;
        }
        if(node.next != null){
            node.next.prev = node.prev;
        }
    }
    public void display(){
        Node temp = head;
        if(head == null){
            System.out.println("DLL is empty");
        }else{
        while(temp.next != null){
            System.out.print(temp.val + "->");
            temp = temp.next;
        }}
        System.out.println("END");
        System.out.println("reverse of a DLL");
        Node demo = last;
        while(demo.prev != null){
            System.out.print(demo.val + "->");
            demo = demo.prev;
        }
        System.out.println("START");

    }
    

    private class Node{
        private int val;
        private Node prev;
        private Node next;
        public Node(int val){
            this.val = val;
        }
        public Node(int val,Node next,Node prev){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
    public static void main(String[] args) {
        DLL obj = new DLL();
        obj.insertFirst(500);
        obj.insertFirst(400);
        obj.insertFirst(300);
        obj.insertFirst(200);
        obj.insertFirst(100);
        obj.insertLast(600);

        obj.display();
        System.out.println("=======");
        System.out.println(obj.deleteFirst());
        System.out.println("=======");
        obj.display();
        // System.out.println("=======");
        // System.out.println(obj.deleteLast());
        // System.out.println("=======");
        // obj.display();
        // obj.insertAfterAValue(300, 310);
        // System.out.println("=======");
        // obj.display();
        // System.out.println("=======");
        // obj.delete(300);
        // System.out.println("=======");
        // obj.display();


    }
}
