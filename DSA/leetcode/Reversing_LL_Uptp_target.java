import java.util.Scanner;
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
public class Reversing_LL_Uptp_target{
    static Stack<Integer> stack = new Stack<>(); 
    static ListNode ReverseLinkedList(ListNode head, int target){
        int count = 0;
        ListNode current = head;
        while(count < target){
            stack.push(current.val);
            current = current.next;
            count++;
        }
        ListNode curr = head;

        while(!stack.isEmpty()){
            curr.val = stack.pop();
            curr = curr.next;
        }
        return head;
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the target index");
        int target = sc.nextInt();

        ListNode head1 = new ListNode(10);
        ListNode head2 = new ListNode(20);
        ListNode head3 = new ListNode(30);
        ListNode head4 = new ListNode(40);
        ListNode head5 = new ListNode(50);
        ListNode head6 = new ListNode(60);
        ListNode head7 = new ListNode(70);


        head1.next = head2;
        head2.next = head3;
        head3.next = head4;
        head4.next = head5;
        head5.next = head6;
        head6.next = head7;
        head7.next = null;
        head1 = ReverseLinkedList(head1,target);
        ListNode dummy = head1;
        while(dummy != null){
            System.out.print(dummy.val+"->");
            dummy = dummy.next;
        }
        System.out.println("null");


    }

}