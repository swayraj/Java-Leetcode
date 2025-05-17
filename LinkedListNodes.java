/**
 * LinkedList Node Operations - Insert, Delete, Print
 */
class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { 
        this.val = val; 
        this.next = null;
    }
}

public class LinkedListNodes {
    ListNode head;  // Head of the linked list

    // Insert at end
    public void insert(int val) {
        ListNode newNode = new ListNode(val);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Delete by value (first occurrence)
    public void delete(int val) {
        if (head == null) return;
        
        if (head.val == val) {
            head = head.next;
            return;
        }

        ListNode current = head;
        while (current.next != null && current.next.val != val) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    // Print the list
    public void printList() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedListNodes list = new LinkedListNodes();
        
        // Insert nodes
        list.insert(1);
        list.insert(2);
        list.insert(3);
        System.out.println("After Insertion:");
        list.printList();  // 1 -> 2 -> 3 -> null

        // Delete node
        list.delete(2);
        System.out.println("\nAfter Deleting 2:");
        list.printList();  // 1 -> 3 -> null
    }
}