public class mergeTwoLists {
    
}
//Definition for singly-linked list.
   class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode lis1 = list1;
        ListNode lis2 = list2;
        ListNode merge = new ListNode();
        ListNode mer = merge;
        while(lis1 != null && lis2 != null){
            if(lis1.val < lis2.val){
                mer.next = lis1;
                mer = mer.next;
                lis1 = lis1.next;
            }else{
                mer.next = lis2;
                mer = mer.next;
                lis2 = lis2.next;
            }
        }
        while(lis1 != null){
            mer.next = lis1;
            mer = mer.next;
                lis1 = lis1.next;
        }
        while(lis2 != null){
           mer.next = lis2;
           mer = mer.next;
                lis2 = lis2.next;
        }
    return merge.next;
    }
}