package com.wyf.剑指Offer2;

import com.wyf.utils.ListNode;
import com.wyf.utils.NodeUtils;

/**
 * @className: com.wyf.剑指Offer2-> 剑指Offer_25_合并两个排序的链表
 * @author: 王一飞
 * @createDate: 2021-11-29 5:20 下午
 * @description: 剑指 Offer 25. 合并两个排序的链表
 */
public class 剑指Offer_25_合并两个排序的链表 {
    /**
     * 输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的。
     * <p>
     * 示例1：
     * <p>
     * 输入：1->2->4, 1->3->4
     * 输出：1->1->2->3->4->4
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/he-bing-liang-ge-pai-xu-de-lian-biao-lcof
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    public static void main(String[] args) {
        ListNode listNode1_01 = new ListNode(1);
        ListNode listNode1_02 = new ListNode(2);
        ListNode listNode1_03 = new ListNode(4);
        listNode1_01.next = listNode1_02;
        listNode1_02.next = listNode1_03;

        ListNode listNode2_01 = new ListNode(1);
        ListNode listNode2_02 = new ListNode(3);
        ListNode listNode2_03 = new ListNode(4);
        listNode2_01.next = listNode2_02;
        listNode2_02.next = listNode2_03;

        System.out.println(NodeUtils.toString(recursive(listNode1_01, listNode2_01)));
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // 非空判断
        if (null == l1) {
            return l2;
        }
        if (null == l2) {
            return l1;
        }

        // 初始化赋值
        ListNode tempListNode = new ListNode(0), resultListNode = new ListNode(0);
        resultListNode.next = tempListNode;

        // 比较，并追加
        while (null != l1 && l2 != null) {
            Integer tempInt;
            if (l1 == null) {
                tempInt = l2.val;
            }
            if (l2 == null) {
                tempInt = l1.val;
            }
            if (l1.val >= l2.val) {
                tempInt = l2.val;
                l2 = l2.next;
            } else {
                tempInt = l1.val;
                l1 = l1.next;
            }
            tempListNode.next = new ListNode(tempInt);
            tempListNode = tempListNode.next;
        }

        // 判断 l1 是否还有剩余
        while (l1 != null) {
            int tempInt = l1.val;
            l1 = l1.next;

            tempListNode.next = new ListNode(tempInt);
            tempListNode = tempListNode.next;
        }

        // 判断 l2 是否还有剩余
        while (l2 != null) {
            int tempInt = l2.val;
            l2 = l2.next;

            tempListNode.next = new ListNode(tempInt);
            tempListNode = tempListNode.next;
        }

        return resultListNode.next.next;
    }

    /**
     * @createAuthor: 王一飞
     * @createDate: 2021/11/29 10:26 下午
     * @description: 递归版本
     */
    public static ListNode recursive(ListNode l1, ListNode l2) {
        // 非空判断
        if (l1 == null && l2 == null) {
            return null;
        }
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }

        ListNode result;
        if (l1.val <= l2.val) {
            result = l1;
            l1.next = recursive(l1.next, l2);
        } else {
            result = l2;
            l2.next = recursive(l1, l2.next);
        }
        return result;
    }
}
