package com.gushi.linkedList;

/**
 * @author Gushi1912 | gushiyang@sheca.com
 * @version 0.0.1
 * 2021/1/26
 */

import com.gushi.linkedList.node.ListNode;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * 给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
 *
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 *
 * 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * 提示：
 *
 * 每个链表中的节点数在范围 [1, 100] 内
 * 0 <= Node.val <= 9
 * 题目数据保证列表表示的数字不含前导零
 */
public class LeetCode002 {
    public static void main(String[] args) {
//        test();
        ListNode l1 = new ListNode(2,null);
        ListNode n1 = new ListNode(5,null);
        ListNode n2 = new ListNode(9,null);
        ListNode n3 = new ListNode(9,null);
        l1.next = n1;
        n1.next = n2;
        n2.next = n3;
        ListNode l2 = new ListNode(4,null);
        ListNode n4 = new ListNode(7, null);
        ListNode n5 = new ListNode(8, null);
        l2.next = n4;
        n4.next = n5;
        print(l1);
        print(l2);
        print(solution(l1,l2));
    }

    /**
     * Myself
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode solution(ListNode l1, ListNode l2) {
        if (l1 != null && l2 != null) {
            //进位
            int carry = 0;
            int len1 = getlen(l1);
            int len2 = getlen(l2);
            ListNode head = len1 > len2 ? l1 : l2;
            ListNode curr = head;
            ListNode prev = curr;
            while (l1 != null || l2 != null) {
                //若节点为空，value设为0
                int value1 = l1 == null ? 0 : l1.value;
                int value2 = l2 == null ? 0 : l2.value;
                int value = value1 + value2 + carry;
                if (value > 9) {
                    carry =  0;
                    carry += value / 10;
                    value = value % 10 ;
                }
                curr.value = value;
                l1 = l1 == null ? null : l1.next;
                l2 = l2 == null ? null : l2.next;
                prev = curr;
                curr = curr.next;
            }
            if (carry != 0) {
                ListNode listNode = new ListNode(carry, null);
                prev.next = listNode;
            }
            return head;

        }
        //l1和l2不是null的时候不会走到下面这一步
        return l1 == null ? (l2 == null ? l1 : l2 ): (l2 == null ? l1 : null);
    }
    private static int getlen(ListNode node ) {
        if (node == null) {
            return 0;
        }
        int len = 0;
        while (node != null) {
            len++;
            node = node.next;
        }
        return len;
     }


    public static void test() {
        byte[] bytes = new byte[12];
        Random random = new Random();
        random.nextBytes(bytes);
        System.out.println(Arrays.toString(bytes));
    }

    public static void print(ListNode node) {
        while (node != null) {
            System.out.print(node.value);
            node = node.next;
        }
        System.out.println();
    }
}
