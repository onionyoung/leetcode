
public class leetcode24 {
	public static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	public static void main(String[] args) {
		ListNode listNode = new ListNode(1);
		listNode.next = new ListNode(2);
		listNode.next.next = new ListNode(3);
		listNode.next.next.next = new ListNode(4);
		listNode = swapPairs(listNode);
		System.out.println(listNode.val);
		System.out.println(listNode.next.val);
		System.out.println(listNode.next.next.val);
		System.out.println(listNode.next.next.next.val);
	}
	public static ListNode swapPairs(ListNode head) {
		ListNode listNode = new ListNode(0);
		listNode.next = head;
		ListNode list2, list3 = null;
		if(listNode.next == null || listNode.next.next == null)return head;
		head = listNode;
		while(head.next != null && head.next.next != null){
			list2 = head.next;
			list3 = head.next.next;
			list2.next = list3.next;
			list3.next = list2;
			head.next = list3;
			head = list2;
		}
		return listNode.next;
        
    }
}
