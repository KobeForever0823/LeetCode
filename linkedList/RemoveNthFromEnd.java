class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return null;
        if (n == 0) return head;
        ListNode before = head;
        int i = 0;
        for (i = 0; i < n + 1 && before != null; i++) {
            before = before.next;
        }

        if (i == n + 1) {
            ListNode after = head;
            while (before != null) {
                before = before.next;
                after = after.next;
            }
            ListNode tmp = after.next;
            after.next = tmp.next;
            tmp = null;

        } else if (i == n) {
            ListNode tmp = head;
            head = head.next;
            tmp = null;
        }
        return head;
    }
}