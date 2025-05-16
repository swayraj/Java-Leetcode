/**
 * LeetCode Problem: Reverse a Linked List (Iterative Approach)
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

public class ReverseLinkedList {

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;       // Previous node (starts as null)
        ListNode current = head;    // Current node (starts at head)

        while (current != null) {
            ListNode nextTemp = current.next;  // Save the next node
            current.next = prev;              // Reverse the link
            prev = current;                   // Move prev forward
            current = nextTemp;                // Move current forward
        }

        return prev;  // New head of the reversed list
    }

    // Helper method to print the linked list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Example: 1 -> 2 -> 3 -> 4 -> 5 -> null
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original List:");
        printList(head);

        ListNode reversedHead = reverseList(head);

        System.out.println("\nReversed List:");
        printList(reversedHead);
    }
}