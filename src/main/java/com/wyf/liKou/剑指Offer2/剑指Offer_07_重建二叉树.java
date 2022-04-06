package com.wyf.liKou.剑指Offer2;

import com.wyf.utils.TreeNode;
import com.wyf.utils.TreeNodeUtils;

/**
 * @className: com.wyf.liKou.剑指Offer2-> 剑指Offer_07_重建二叉树
 * @author: 王一飞
 * @createDate: 2021-12-06 6:39 下午
 * @description: 剑指 Offer 07. 重建二叉树
 */
public class 剑指Offer_07_重建二叉树 {
    /**
     * 剑指 Offer 07. 重建二叉树
     * 输入某二叉树的前序遍历和中序遍历的结果，请构建该二叉树并返回其根节点。
     * <p>
     * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
     * <p>
     * <p>
     * <p>
     * 示例 1:
     * <p>
     * <p>
     * Input: preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
     * Output: [3,9,20,null,null,15,7]
     * 示例 2:
     * <p>
     * Input: preorder = [-1], inorder = [-1]
     * Output: [-1]
     * <p>
     * <p>
     * 限制：
     * <p>
     * 0 <= 节点个数 <= 5000
     *
     * @param preorder
     * @param inorder
     * @return
     */
    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTree(preorder, inorder, 0, preorder.length - 1, 0, inorder.length - 1);
    }


    public static TreeNode buildTree(int[] preorder, int[] inorder, int left01, int right01, int left02, int right02) {
        if (left01 > right01 || left02 > right02 || left01 >= preorder.length || left02 >= inorder.length) {
            return null;
        }

        //  构建根节点
        int rootValue = preorder[left01];
        TreeNode root = new TreeNode(rootValue);

        //  找到根节点的位置
        int count = left02;
        while (inorder[count] != rootValue) {
            count++;
        }
        count -= left02;

        /**
         * 前序：[1][24895][367]
         * 中序：[84925][1][637]
         */


        //        root.left = buildTree(preorder, inorder,
        //                left01 + 1, left01 + count,
        //                left01, left01 + count - 1);
        root.left = buildTree(preorder, inorder,
                left01 + 1, left01 + count,
                left02, left02 + count - 1);
        root.right = buildTree(preorder, inorder,
                left01 + count + 1, right01,
                left02 + count + 1, right02);
        return root;
    }

    public static void main(String[] args) {
        //        int[] preorder = {3, 9, 20, 15, 7};
        //        int[] inorder = {9, 3, 15, 20, 7};
        int[] preorder = {1, 2, 4, 8, 9, 5, 3, 6, 7};
        int[] inorder = {8, 4, 9, 2, 5, 1, 6, 3, 7};

        TreeNode treeNode = buildTree(preorder, inorder);

        TreeNodeUtils.toString(treeNode);
    }
}
