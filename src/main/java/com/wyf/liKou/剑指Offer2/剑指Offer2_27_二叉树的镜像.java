package com.wyf.liKou.剑指Offer2;

import com.wyf.utils.TreeNode;

import java.util.Stack;

/**
 * @Author wangyifei
 * @Date $ $
 * @Param $
 * @return $
 **/
public class 剑指Offer2_27_二叉树的镜像 {
    /**
     * 请完成一个函数，输入一个二叉树，该函数输出它的镜像。
     * <p>
     * 例如输入：
     * 示例 1：
     * <p>
     * 输入：root = [4,2,7,1,3,6,9]
     * 输出：[4,7,2,9,6,3,1]
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/er-cha-shu-de-jing-xiang-lcof
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    public static TreeNode mirrorTree(TreeNode root) {
        if (null == root) {
            return root;
        }
        TreeNode tempNode = root.left;
        root.left = mirrorTree(root.right);
        root.right = mirrorTree(tempNode);
        return root;
    }

    public static TreeNode mirrorTree2(TreeNode root) {
        if (null == root) {
            return root;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>() {{
            add(root);
        }};
        while (! stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (null != node.left) {
                stack.add(node.left);
            }
            if (null != node.right) {
                stack.add(node.right);
            }
            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;
        }
        return root;
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(4);
        TreeNode left1 = new TreeNode(2);
        TreeNode left1_1 = new TreeNode(1);
        TreeNode left1_2 = new TreeNode(3);
        TreeNode right1 = new TreeNode(7);
        TreeNode right1_1 = new TreeNode(6);
        TreeNode right1_2 = new TreeNode(9);

        treeNode.left = left1;
        treeNode.right = right1;

        left1.left = left1_1;
        left1.right = left1_2;

        right1.left = right1_1;
        right1.right = right1_2;

        TreeNode result = mirrorTree2(treeNode);
        System.out.println();
    }

}
