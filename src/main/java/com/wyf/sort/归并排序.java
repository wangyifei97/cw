package com.wyf.sort;

import java.util.Arrays;

/**
 * @className: com.wyf.sort-> 归并排序
 * @author: 王一飞
 * @createDate: 2021-12-02 11:18 上午
 * @description: 归并排序(MERGE - SORT)
 */
public class 归并排序 {
    /**
     * 利用归并的思想实现的排序方法
     * 该算法采用经典的分治（divide-and-conquer）策略（分治法将问题分(divide)
     * 成一些小的问题然后递归求解
     * 而治(conquer)的阶段则将分的阶段得到的各答案"修补"在一起，即分而治之)。
     */
    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};

        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr) {
        // 在排序前，先建好一个长度等于原数组长度的临时数组，避免递归中频繁开辟空间
        int[] temp = new int[arr.length];

    }
}
