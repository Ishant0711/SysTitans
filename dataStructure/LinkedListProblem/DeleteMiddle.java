package dataStructure.LinkedListProblem;

public class DeleteMiddle {
    public ListNode deleteMiddle(ListNode head) {

        if(head == null || head.next ==null){
            return null;
        }

        ListNode prevSlow = null;
        ListNode slow     = head;
        ListNode fast     = head;

        while(fast != null && fast.next != null){
            prevSlow = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prevSlow.next = slow.next;
        return head;
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
    // Driver code to test
    public static void main(String[] args) {
        // Build sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        DeleteMiddle dm = new DeleteMiddle();

        System.out.println("Original List:");
        dm.printList(head);

        head = dm.deleteMiddle(head);

        System.out.println("List after deleting middle node:");
        dm.printList(head);
    }
}
