public class removeNthFromEndLL {
    
}
class Solution {
    public ListNode removeNthFromEndLL(ListNode head, int n) {
        ListNode t = new ListNode(0);
        t.next = head;
        ListNode temp = t;
        ListNode tem = t;
        int count = 0;
        while(temp.next != null){
            temp = temp.next;
            count++;
        }
        int target = count - n;
        int coun = 0;
        if (target == 0) {
            return head.next;
        }
        while(coun != target){
            tem = tem.next;
            coun++;
        }
        tem.next = tem.next.next;
        return t.next;

    }

}