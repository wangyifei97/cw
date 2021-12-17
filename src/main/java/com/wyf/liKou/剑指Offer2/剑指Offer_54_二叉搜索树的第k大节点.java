package com.wyf.liKou.剑指Offer2;

import com.wyf.utils.TreeNode;

/**
 * @className: com.wyf.剑指Offer2-> 剑指Offer_54_二叉搜索树的第k大节点
 * @author: 王一飞
 * @createDate: 2021-11-24 3:51 下午
 * @description: 剑指 Offer 54. 二叉搜索树的第k大节点
 */
public class 剑指Offer_54_二叉搜索树的第k大节点 {
    /**
     * 给定一棵二叉搜索树，请找出其中第k大的节点。
     * <p>
     *  
     * <p>
     * 示例 1:
     * <p>
     * 输入: root = [3,1,4,null,2], k = 1
     * 3
     * / \
     * 1   4
     * \
     *    2
     * 输出: 4
     * 示例 2:
     * <p>
     * 输入: root = [5,3,6,2,4,null,null,1], k = 3
     * 5
     * / \
     * 3   6
     * / \
     * 2   4
     * /
     * 1
     * 输出: 4
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/er-cha-sou-suo-shu-de-di-kda-jie-dian-lcof
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    public static int kthLargest(TreeNode root, int k) {
        return 0;
    }

    public static void largest(TreeNode leftNode, TreeNode rightNode) {
    }

    public static void main(String[] args) {

        TreeNode treeNode = new TreeNode(5);
        TreeNode left1 = new TreeNode(3);
        TreeNode left1_1 = new TreeNode(2);
        TreeNode left1_2 = new TreeNode(4);
        TreeNode left1_1_1 = new TreeNode(1);
        TreeNode right1 = new TreeNode(6);

        treeNode.left = left1;
        treeNode.right = right1;

        left1.left = left1_1;
        left1.right = left1_2;

        left1_1.left = left1_1_1;

        int resultInt = kthLargest(new TreeNode(1), 3);
        System.err.println(resultInt);
    }

}