public class LinkedCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false; // cannot change the order if head == null then head.next won't exist
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) return true;
        }
        return false;
    }
}