

public class leetcode19 {
	 public static class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int x) { val = x; }
	 }
	public static void main(String[] args) {
		ListNode a = new ListNode(5);
		a.next = new ListNode(2);
		a.next.next = new ListNode(3);//523
		System.out.println(removeNthFromEnd(a,1).val);
	}
    public static ListNode removeNthFromEnd(ListNode head, int n) {
    	ListNode copy = head;
    	ListNode listNode = copy;
    	int i = n;
    	if(n == 0)return head;
    	if( n == 1 && head.next == null)return null;
    	if(head == null)return null;
    	while(head != null){
    		if(n == -1){
    			copy = copy.next;
    		}else n--;
    		head = head.next;
    	}
    	if(i == 1) copy.next = null;
    	else if(n == 0)return copy.next;
    	else copy.next = copy.next.next;
    	System.out.println(copy.val);
		return listNode;
    }
}
