package com.wyf.liKou.剑指Offer2;

import java.util.HashSet;

/**
 * @className: com.wyf.liKou.剑指Offer2-> 剑指Offer_51_数组中的逆序对
 * @author: 王一飞
 * @createDate: 2021-12-01 6:18 下午
 * @description: 剑指 Offer 51. 数组中的逆序对
 */
public class 剑指Offer_51_数组中的逆序对 {
    /**
     * 剑指 Offer 51. 数组中的逆序对
     * 在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。输入一个数组，求出这个数组中的逆序对的总数。
     * <p>
     * 示例 1:
     * <p>
     * 输入: [7,5,6,4]
     * 输出: 5
     */
    public static void main(String[] args) {
        int[] nums = {7, 5, 6, 4};
        int pairs = reversePairs2(nums);
        System.out.println(pairs);
    }

    //XXXXXXXXXXXXXXXXXXXXXXXX
    // 超出 力扣 时间限制
    public static int reversePairs(int[] nums) {
        long startTime = System.currentTimeMillis();

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int j = i, temp = nums[j];
            while (j != nums.length - 1) {
                if (temp > nums[j + 1]) {
                    count++;
                    j++;
                } else {
                    j++;
                    continue;
                }
            }
        }

        long endTime = System.currentTimeMillis();
        System.out.println("项目开始时间: " + startTime + ",项目结束时间：" + endTime + ",项目运行时间: " + (endTime - startTime));
        return count;
    }


    //XXXXXXXXXXXXXXXXXXXXXXXX
    // 超出 力扣 时间限制
    public static int reversePairs2(int[] nums) {
        // 结果
        int result = 0;
        // 循环判断
        int i = 0, j = nums.length - 1;
        // 数组分开，左右两边各判断
        int middle = j / 2;
        // 放入符合条件的值
        HashSet<String> hashSet = new HashSet<>(nums.length);

        //        while (i < middle && middle < j) {
        //
        //            int tempI = nums[i], i1 = i;
        //            while (i < middle && i1 < nums.length-1) {
        //                // 判断是否大于后面的值 与 hashset不存在
        //                int num = nums[i1 + 1];
        //                String max = String.valueOf(Integer.max(tempI, num));
        //                String min = String.valueOf(Integer.min(tempI, num));
        //                if (! hashSet.contains(max + min) && (tempI > num)) {
        //                    // 添加hashset
        //                    hashSet.add(max + min);
        //                    // 判断取值 向后移动
        //                    i1++;
        //                } else {
        //                    i1++;
        //                }
        //                i++;
        //            }
        //        }

        int now;
        int next;
        int end;
        while (i < nums.length - 1) {
            now = nums[i];
            next = nums[i + 1];
            end = nums[nums.length - 1 - i];

            String nowTemp = String.valueOf(Integer.max(now, next)) + Integer.min(now, next);
            if (now > next && ! hashSet.contains(nowTemp)) {
                hashSet.add(nowTemp);
            }
            String nextTemp = String.valueOf(Integer.max(now, end)) + Integer.min(now, end);
            if (now > end && ! hashSet.contains(nextTemp)) {
                hashSet.add(nextTemp);
            }
            String endTemp = String.valueOf(Integer.max(next, end)) + Integer.min(next, end);
            if (next > end && hashSet.contains(endTemp)) {
                hashSet.add(endTemp);
            }
            i++;
        }
        return hashSet.size();
    }


    //XXXXXXXXXXXXXXXXXXXXXXXX
    // 超出 力扣 时间限制
    public static int reversePairs3(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    sum++;
                }
            }
        }
        return sum;
    }
}
