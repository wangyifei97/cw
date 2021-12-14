package com.wyf.liKou;

import com.wyf.utils.TreeNode;

/**
 * @className: com.wyf.liKou.剑指Offer2-> 力扣_1446_连续字符
 * @author: 王一飞
 * @createDate: 2021-12-13 7:48 下午
 * @description: 101. 力扣_101_对称二叉树
 */
public class 力扣_101_对称二叉树 {
    /**
     * 给定一个二叉树，检查它是否是镜像对称的。
     * <p>
     *  
     * <p>
     * 例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
     * <p>
     * 1
     * / \
     * 2   2
     * / \ / \
     * 3  4 4  3
     *  
     * <p>
     * 但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:
     * <p>
     * 1
     * / \
     * 2   2
     * \   \
     * 3    3
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/symmetric-tree
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        TreeNode left1 = new TreeNode(2);
        TreeNode right1 = new TreeNode(2);
        TreeNode left2_01 = new TreeNode(3);
        TreeNode left2_02 = new TreeNode(4);
        TreeNode right2_01 = new TreeNode(4);
        TreeNode right2_02 = new TreeNode(3);

        treeNode.left = left1;
        treeNode.right = right1;

        left1.left = left2_01;
        left1.right = left2_02;

        right1.left = right2_01;
        right1.right = right2_02;

        System.out.println(isSymmetric(treeNode));
    }

    public static boolean isSymmetric(TreeNode root) {
        if (null == root) {
            return Boolean.FALSE;
        }
        return isSymmetric(root.left, root.right);
    }

    public static boolean isSymmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        if (left.val == right.val) {
            return isSymmetric(left.right, right.left) && isSymmetric(left.left, right.right);
        } else {
            return false;
        }
    }
}
