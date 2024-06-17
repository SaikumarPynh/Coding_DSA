import java.util.Stack;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderLList(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode fast = head, slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        while(slow != null){
            stack.push(slow);
            slow = slow.next;
        }
        ListNode n = head;
        while(!stack.isEmpty()){
            ListNode temp = n.next;
            ListNode top = stack.pop();
            if(n == top){
                n.next = null;
                break;
            } 
            n.next = top;
            top.next = temp;
            n = temp;
             if (n != null && n.next == top) {
                n.next = null;
                break;
            }


        }
    }
}