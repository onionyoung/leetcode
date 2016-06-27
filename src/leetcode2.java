
public class leetcode2 {
	public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
	public static void main(String[] args) {
		ListNode a = new ListNode(5);
		//a.next = new ListNode(2);
		ListNode b = new ListNode(5);
		a= addTwoNumbers(a,b);
		System.out.println(a.val+ "" +a.next.val);
    }
    
	// 1.2.3   1.1.1   
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode sumL = new ListNode(0);
		ListNode head = new ListNode(0);
		ListNode beforeSuml = new ListNode(0);
		int l1num = 0, l2num = 0, num = 0;
		head = sumL;
		while(l1 != null || l2 != null){
			l1num = l1 == null ? 0 : l1.val;
			l2num = l2 == null ? 0 : l2.val;
			sumL.val = 0;
			num = l1num + l2num + num / 10;
			sumL.val = sumL.val + num % 10;
			sumL.next = new ListNode(0);
			beforeSuml =sumL;
			sumL = sumL.next;
			if(l1 != null)l1 = l1.next;
			if(l2 != null)l2 = l2.next;
			//System.out.println(num/10);
		}
		if(num / 10 == 1)beforeSuml.next.val=1;
		else beforeSuml.next = null;
	    return head;
	}
	
}
