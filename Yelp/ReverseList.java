public class ReverseList(ListNode head) {
	public ListNode solution(ListNode head) {
		if (head == null || head.next == null) return head;
		ListNode p = head;
		ListNode q = p.next;
		ListNode r = null;
		head.next = null;
		while (q != null) {
			r = q.next;
			q.next = p;
			p = q;
			q = r;
		}
		head = p;
		return head;
	}
}