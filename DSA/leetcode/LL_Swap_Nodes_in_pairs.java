 class Solution {
    //https://leetcode.com/problems/swap-nodes-in-pairs/description/
    public static void main(String[] args) {
        // Creating a sample linked list: 1 -> 2 -> 3 -> 4
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        // Printing the original linked list
        System.out.println("Original Linked List:");
        printList(head);

        // Swapping pairs in the linked list
        Solution solution = new Solution();
        ListNode swappedHead = solution.swapPairs(head);

        // Printing the swapped linked list
        System.out.println("\nSwapped Linked List:");
        printList(swappedHead);
    }

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        while (head != null && head.next != null) {
            ListNode firstNode = head;
            ListNode secondNode = head.next;

            prev.next = secondNode;
            firstNode.next = secondNode.next;
            secondNode.next = firstNode;

            prev = firstNode;
            head = firstNode.next;
        }
        return dummy.next;
    }

    // Helper method to print the linked list
    private static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
}
