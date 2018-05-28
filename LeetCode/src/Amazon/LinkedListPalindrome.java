package Amazon;

public class LinkedListPalindrome {
	
	public static class ListNode {
		char val;
		ListNode next;
		ListNode(char x) { val = x;}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "abcddcba";
		ListNode node = new ListNode('a');
		ListNode cur = node.next;
		for (char c : s.toCharArray()) {
			cur = new ListNode(c);
			System.out.println(cur.val);
			cur = cur.next;
		}
		
		node = node.next;
		
		ListNode slow = node;
		ListNode fast = node;
		ListNode right = null;
		
		System.out.println(node.val);
		
		
	}
	

}
