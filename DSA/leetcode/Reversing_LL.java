import java.util.Stack;
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

public class Reversing_LL{
    // static Stack<ListNode> s = new Stack<>();
    // static ListNode ReverseLinkedList(ListNode present){
    //     while(present != null){
    //         s.push(present);
    //         present = present.next;
    //     }
    //     ListNode res = s.pop();
    //     ListNode head = res;
    //     while(!s.isEmpty()){
    //         head.next = s.pop();
    //         head = head.next;
    //     }
    //     head.next = null;
    //     return res;
    static Stack<Integer> stack = new Stack<>();
    public static ListNode ReverseLinkedList(ListNode head) {
        ListNode n = head;
        while(n != null){
            stack.push(n.val);
            n = n.next;
        }
        ListNode m = head;
        while(!stack.isEmpty()){
            m.val = stack.pop();
            m = m.next;
        }
        return head;
    }
    public static void main(String[] args){
        ListNode head = new ListNode(10);
        head.next = new ListNode(20);
        head.next.next = new ListNode(30);
        head.next.next.next = new ListNode(40);
        head = ReverseLinkedList(head);
        ListNode dummy = head;
        while(dummy != null){
            System.out.print(dummy.val+"->");
            dummy = dummy.next;
        }
        System.out.println("null");

    }

}