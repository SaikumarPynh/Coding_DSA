class ListNode{
    int val;
    ListNode next;
    public ListNode(int val){
        this.val = val;
    }
    public ListNode(int val,ListNode next){
        this.val = val;
        this.next = next;
    }
}
public class Reversing_LL_using_recusrion{
    static ListNode ReverseLinkedList(ListNode current, ListNode previous){
        if(current == null){
            return previous;
        }
        ListNode nextNode = current.next;
        current.next = previous;
        return ReverseLinkedList(nextNode,current);
    }
    public static void main(String[] args){
        ListNode head = new ListNode(10);
        head.next = new ListNode(20);
        head.next.next = new ListNode(30);
        head.next.next.next = new ListNode(40);
        head = ReverseLinkedList(head,null);
        ListNode dummy = head;
        while(dummy != null){
            System.out.print(dummy.val+"->");
            dummy = dummy.next;
        }
        System.out.println("null->Sai");


    }

}