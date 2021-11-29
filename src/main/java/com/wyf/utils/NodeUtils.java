package com.wyf.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @className: com.wyf.utils-> NodeUtils
 * @author: 王一飞
 * @createDate: 2021-11-29 5:34 下午
 * @description: 链表工具类
 */
public class NodeUtils {

    /**
     * @createAuthor: 王一飞
     * @createDate: 2021/11/29 5:42 下午
     * @description: 链表打印
     * @return: String
     */
    public static String toString(ListNode listNode) {
        List<String> resultString = new ArrayList<>();
        while (listNode != null) {
            resultString.add(String.valueOf(listNode.val));
            listNode = listNode.next;
        }
        return Arrays.toString(resultString.toArray());
    }
}
