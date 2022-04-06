package com.wyf.liKou;

import cn.hutool.json.JSONUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @className: com.wyf.liKou-> 力扣_练习
 * @author: 王一飞
 * @createDate: 2022-01-12 5:56 下午
 * @description:
 */
public class 力扣_练习 {
    public static void main(String[] args) {

        int[] ints = {- 497, - 480, - 477, - 470, - 452, - 448, - 440, - 412, - 390, - 381, - 372, - 372, - 369, - 366, - 355, - 346, - 340, - 337, - 322, - 321, - 311, - 296, - 258, - 249, - 248, - 232, - 215, - 199, - 174, - 154, - 128, - 122, - 122, - 117, - 115, - 113, - 110, - 89, - 86, - 84, - 78, - 71, - 69, - 53, - 49, - 35, - 25, - 21, - 7, 3, 7, 21, 25, 30, 47, 52, 81, 84, 87, 91, 96, 157, 161, 167, 178, 184, 210, 217, 228, 236, 274, 277, 283, 286, 290, 301, 302, 341, 352, 354, 361, 367, 384, 390, 412, 421, 458, 468, 483, 484, 486, 487, 490, 491};

        List<List<Integer>> listList;

        listList = fourSum(ints, 8377);
        listList.forEach(list -> System.out.println(JSONUtil.parse(list)));
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if (4 > nums.length) {
            return result;
        }

        List<String> isExitList = new ArrayList<>();
        nums = Arrays.stream(nums).sorted().toArray();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                int temp = nums[j], L = j + 1, R = nums.length - 1;
                if (i == j) {
                    continue;
                }
                while (L < R) {
                    if (i == R) {
                        R--;
                        continue;
                    }
                    if (i == L) {
                        L++;
                        continue;
                    }

                    List<Integer> tempList = new ArrayList<>();
                    tempList.add(nums[i]);
                    tempList.add(temp);
                    tempList.add(nums[L]);
                    tempList.add(nums[R]);
                    tempList = tempList.stream().sorted().collect(Collectors.toList());

                    //  判断结果是否存在
                    StringBuilder stringBuilder = new StringBuilder();
                    tempList.stream().peek(stringBuilder :: append).collect(Collectors.toList());

                    final int sum = nums[i] + temp + nums[L] + nums[R];
                    if (sum == target && ! isExitList.contains(stringBuilder.toString())) {
                        result.add(tempList);
                        isExitList.add(stringBuilder.toString());
                    }
                    if (sum < target) {
                        L++;
                    } else {
                        R--;
                    }
                }
            }
        }
        return result;
    }
}
