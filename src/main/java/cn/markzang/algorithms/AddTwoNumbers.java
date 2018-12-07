package cn.markzang.algorithms;

import java.math.BigDecimal;
import java.math.BigInteger;
import org.junit.Test;

/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * Example:
 *
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 *
 * @author BowenZang
 * @since 2018年12月07日
 */
public class AddTwoNumbers {
	
	@Test
	public void ListNodeTest() {
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(6);
		l1.next.next = new ListNode(4);
		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(4);
		l2.next.next = new ListNode(3);
		
		System.out.println(addTwoNumbers(l1, l2));
	}
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();;
		while(null != l1) {
			sb1.append(l1.val);
			l1 = l1.next;
		}
		while(null != l2) {
			sb2.append(l2.val);
			l2 = l2.next;
		}
		sb1 = sb1.reverse();
		sb2 = sb2.reverse();
		
		BigDecimal b1 = sb1.toString() == "" ? new BigDecimal(BigInteger.ZERO) : new BigDecimal(sb1.toString());
		BigDecimal b2 = sb2.toString() == "" ? new BigDecimal(BigInteger.ZERO) : new BigDecimal(sb2.toString());
		
		String sum = b1.add(b2).toString();
		char[] chs = sum.toCharArray();
		
		ListNode node = new ListNode(-1);
		ListNode cur = node;
		for (int i = chs.length - 1 ; i >= 0; i--) {
			cur.next = new ListNode(Integer.valueOf(chs[i] + ""));
			cur = cur.next;
		}
		
		return node.next;
	}
	
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
			val = x;
		}
		
		@Override
		public String toString() {
			return "ListNode{" + "val=" + val + ", next=" + next + '}';
		}
	}
	
}
