class Solution {
    // Definition for singly-linked list
    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode mergeKLists(ListNode[] lists) {
        ListNode finalList = new ListNode();
        if (lists.length < 1) {
            return new ListNode();
        } else if (lists.length > 1) {
            ListNode main = lists[0];
            for (int i = 1; i < lists.length; i++) {
                while (main != null && lists[i] != null) {
                    if (main.val < lists[i].val) {
                        finalList.next = main;
                        finalList = finalList.next;
                        main = main.next;
                    } else {
                        finalList.next = lists[i];
                        finalList = finalList.next;
                        lists[i] = lists[i].next;
                    }
                }
                while (main != null) {
                    finalList.next = main;
                    finalList = finalList.next;
                    main = main.next;
                }
                while (lists[i] != null) {
                    finalList.next = lists[i];
                    finalList = finalList.next;
                    lists[i] = lists[i].next;
                }
                main = finalList;
            }
        }
        return finalList.next;
    }

    // Main method
    public static void main(String[] args) {
        // Example lists
        ListNode list1 = new ListNode(1, new ListNode(4, new ListNode(5)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode list3 = new ListNode(2, new ListNode(6));

        // Create an array of ListNode
        ListNode[] lists = { list1, list2, list3 };

        // Create an instance of Solution
        Solution solution = new Solution();

        // Call mergeKLists method
        ListNode mergedList = solution.mergeKLists(lists);

        // Print the merged list
        printList(mergedList);
    }

    // Helper method to print the list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}

