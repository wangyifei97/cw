package com.wyf.liKou;

/**
 * @className: com.wyf.liKou.剑指Offer2-> 力扣_1446_连续字符
 * @author: 王一飞
 * @createDate: 2021-12-01 4:20 下午
 * @description: 1446. 连续字符
 */
public class 力扣_1446_连续字符 {
    /**
     * 给你一个字符串 s ，字符串的「能量」定义为：只包含一种字符的最长非空子字符串的长度。
     * <p>
     * 请你返回字符串的能量。
     * <p>
     *  
     * <p>
     * 示例 1：
     * <p>
     * 输入：s = "leetcode"
     * 输出：2
     * 解释：子字符串 "ee" 长度为 2 ，只包含字符 'e' 。
     * 示例 2：
     * <p>
     * 输入：s = "abbcccddddeeeeedcba"
     * 输出：5
     * 解释：子字符串 "eeeee" 长度为 5 ，只包含字符 'e' 。
     * 示例 3：
     * <p>
     * 输入：s = "triplepillooooow"
     * 输出：5
     * 示例 4：
     * <p>
     * 输入：s = "hooraaaaaaaaaaay"
     * 输出：11
     * 示例 5：
     * <p>
     * 输入：s = "tourist"
     * 输出：1
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/consecutive-characters
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    public static void main(String[] args) {
        String s = "triplepillooooow";
        int max = maxPower2(s);
        System.out.println(max);

    }

    public static int maxPower(String s) {
        char[] chars = s.toCharArray();
        Integer result = 0, tempSize = 0;

        for (int i = 0; i < chars.length; i++) {
            if (i < chars.length - 1 && chars[i] == chars[i + 1]) {
                tempSize++;
            } else {
                tempSize = 0;
            }
            result = Integer.max(result, tempSize);
        }
        return result + 1;
    }


    public static int maxPower2(String s) {
        int n = s.toCharArray().length, ans = 1, result = 0;
        for (int i = 0; i < n; ) {
            int j;
            while ((j = i) < n && s.charAt(i) == s.charAt(j)) {
                j++;
                ans++;
            }
            result = Integer.max(ans, result);
            i = j;
        }
        return ans;
    }
}
