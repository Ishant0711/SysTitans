package dataStructure.LinkedListProblem;

class DeleteNodeInLinkedList {
    // Function to delete the given node
    public void deleteNode(ListNode node) {
        if (node == null || node.next == null) {
            return; // cannot delete if it's the last node
        }
        node.val = node.next.val;       // copy next node's value
        node.next = node.next.next;     // bypass next node
    }

    // Utility function to print the list
    public void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Driver code
    public static void main(String[] args) {
        DeleteNodeInLinkedList obj = new DeleteNodeInLinkedList();

        // Create linked list: 4 -> 5 -> 1 -> 9
        ListNode head = new ListNode(4);
        head.next = new ListNode(5);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(9);

        System.out.println("Original List:");
        obj.printList(head);

        // Delete node with value 5 (we pass reference to node 5)
        obj.deleteNode(head.next);

        System.out.println("After Deleting Node 5:");
        obj.printList(head);
    }
}

// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
