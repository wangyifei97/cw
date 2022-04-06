package com.wyf.liKou.剑指Offer2;

import com.wyf.utils.TreeNode;

/**
 * @className: com.wyf.liKou.剑指Offer2-> 剑指Offer_37_序列化二叉树
 * @author: 王一飞
 * @createDate: 2021-12-16 2:47 下午
 * @description: 剑指 Offer 37. 序列化二叉树
 */
public class 剑指Offer_37_序列化二叉树 {
    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);

        TreeNode root_left = new TreeNode(2);
        TreeNode root_right = new TreeNode(3);

        TreeNode root_right_left = new TreeNode(4);
        TreeNode root_right_right = new TreeNode(5);

        root.left = root_left;
        root.right = root_right;
        root.right.left = root_right_left;
        root_right.right = root_right_right;

        剑指Offer_37_序列化二叉树 剑指Offer_37_序列化二叉树 = new 剑指Offer_37_序列化二叉树();
        String serialize = 剑指Offer_37_序列化二叉树.serialize(root);
        System.out.println(serialize);
    }

    /**
     * 请实现两个函数，分别用来序列化和反序列化二叉树。
     * <p>
     * 你需要设计一个算法来实现二叉树的序列化与反序列化。这里不限定你的序列 / 反序列化算法执行逻辑，你只需要保证一个二叉树可以被序列化为一个字符串并且将这个字符串反序列化为原始的树结构。
     * <p>
     * 提示：输入输出格式与 LeetCode 目前使用的方式一致，详情请参阅https://support.leetcode-cn.com/hc/kb/article/1194353/序列化二叉树的格式。
     * 你并非必须采取这种方式，你也可以采用其他的方法解决这个问题。
     * <p>
     *  
     * <p>
     * 示例：
     * <p>
     * <p>
     * 输入：root = [1,2,3,null,null,4,5]
     * 输出：[1,2,3,null,null,4,5]
     *  
     * <p>
     * 注意：本题与主站 297 题相同：https://leetcode-cn.com/problems/serialize-and-deserialize-binary-tree/
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/xu-lie-hua-er-cha-shu-lcof
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {

        return "";
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        return null;
    }

}
