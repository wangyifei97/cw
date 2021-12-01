package com.wyf.liKou.剑指Offer2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @className: com.wyf.剑指Offer2-> 剑指Offer_40_最小的k个数
 * @author: 王一飞
 * @createDate: 2021-11-30 5:28 下午
 * @description: 剑指 Offer 40. 最小的k个数
 */
public class 剑指Offer_40_最小的k个数 {
    /**
     * 输入整数数组 arr ，找出其中最小的 k 个数。例如，输入4、5、1、6、2、7、3、8这8个数字，则最小的4个数字是1、2、3、4。
     * <p>
     *  
     * <p>
     * 示例 1：
     * <p>
     * 输入：arr = [3,2,1], k = 2
     * 输出：[1,2] 或者 [2,1]
     * 示例 2：
     * <p>
     * 输入：arr = [0,1,2,1], k = 1
     * 输出：[0]
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/zui-xiao-de-kge-shu-lcof
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 6, 2, 7, 3, 8};
        int k = 4;
        int[] result = getLeastNumbers(arr, k);

        System.out.println(Arrays.toString(result));
    }

    public static int[] getLeastNumbers(int[] arr, int k) {
        Arrays.sort(arr);
        int j = 0;
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length && j < k; i++) {
            j++;
            result.add(arr[i]);
        }
        return result.stream().mapToInt(Integer :: valueOf).toArray();
    }
}
