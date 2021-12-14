package com.wyf.dataStructure.BsTree;

import com.wyf.utils.TreeNode;
import com.wyf.utils.TreeNodeUtils;

import java.util.*;

/**
 * @className: com.wyf.dataStructure.BsTree-> DoubleTree
 * @author: 王一飞
 * @createDate: 2021-12-02 4:48 下午
 * @description: 二叉树的前序遍历、中序遍历、后序遍历、层次遍历
 */
public class DoubleTree {

    private static List<Integer> resultList = new ArrayList<>();

    // 建立二叉树
    public static TreeNode create() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        // 初始化list
        List<TreeNode> nodeList = new ArrayList<>();
        for (int i : array) {
            nodeList.add(new TreeNode(i));
        }

        for (int parentIndex = 0; parentIndex < array.length / 2 - 1; parentIndex++) {
            // 左孩子
            nodeList.get(parentIndex).left = nodeList.get(parentIndex * 2 + 1);
            // 右孩子
            nodeList.get(parentIndex).right = nodeList.get(parentIndex * 2 + 2);
        }

        // 最后一个 父节点，可能没有右孩子的情况，单独处理
        int lastParentIndex = array.length / 2 - 1;
        // 左孩子
        nodeList.get(lastParentIndex).left = nodeList.get(lastParentIndex * 2 + 1);
        // 右孩子，如果长度为奇数则建立右孩子
        if (1 == array.length % 2) {
            nodeList.get(lastParentIndex).right = nodeList.get(lastParentIndex * 2 + 2);
        }
        return nodeList.get(0);
    }

    // 递归 前序遍历
    // 访问顺序：先根节点，再左子树，最后右子树
    public static List<Integer> preOderTraverse(TreeNode node) {
        if (null == node) {
            return new ArrayList<>();
        }
        resultList.add(node.val);

        preOderTraverse(node.left);
        preOderTraverse(node.right);

        return resultList;
    }

    // 非递归实现
    // 访问顺序：先根节点，再左子树，最后右子树
    public static List<Integer> preOderStack(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        while (null != node || ! stack.isEmpty()) {
            if (null != node) {
                // 前序遍历
                //                resultList.add(node.key);
                stack.push(node);
                node = node.left;
            } else {
                TreeNode tem = stack.pop();
                // 中序遍历
                resultList.add(tem.val);
                node = tem.right;
            }
        }
        return resultList;
    }

    // 后序遍历：非递归实现
    // 访问顺序：先左子树，再右子树，最后根节点，
    public static List<Integer> postOrderTraverse(TreeNode root) {
        TreeNode cur, pre = null;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (! stack.isEmpty()) {
            cur = stack.peek();
            if ((null == cur.left && null == cur.right) || (null != pre && (pre == cur.left || pre == cur.right))) {
                resultList.add(cur.val);
                stack.pop();
                pre = cur;
            } else {
                if (null != cur.right) {
                    stack.push(cur.right);
                }
                if (null != cur.left) {
                    stack.push(cur.left);
                }
            }
        }
        return resultList;
    }

    // 二叉树深度 递归
    public static int getMaxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int left = getMaxDepth(root.left);
            int right = getMaxDepth(root.right);
            return 1 + Math.max(left, right);
        }
    }

    // 二叉树广度 队列
    public static int getMaxWidth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Queue<TreeNode> queue = new ArrayDeque<TreeNode>();
        int maxWitdth = 1; // 最大宽度
        queue.add(root); // 入队

        while (true) {
            int len = queue.size(); // 当前层的节点个数
            if (0 == len) {
                break;
            }
            while (0 < len) {                // 如果当前层，还有节点
                TreeNode t = queue.poll();
                len--;
                // 下一层节点入队
                if (null != t.left) {
                    queue.add(t.left);
                }
                // 下一层节点入队
                if (null != t.right) {
                    queue.add(t.right);
                }
            }
            maxWitdth = Math.max(maxWitdth, queue.size());
        }
        return maxWitdth;
    }

    public static void main(String[] args) {
        TreeNode treeNode = create();

        //        TreeNode node1 = new TreeNode(1);
        //        TreeNode node2 = new TreeNode(2);
        //        TreeNode node3 = new TreeNode(3);
        //        TreeNode node4 = new TreeNode(4);
        //        TreeNode node5 = new TreeNode(5);
        //        TreeNode node6 = new TreeNode(6);
        //        TreeNode node7 = new TreeNode(7);
        //        TreeNode node8 = new TreeNode(8);
        //        TreeNode node9 = new TreeNode(9);
        //        node1.left = node2;
        //        node1.right = node3;
        //        node2.left = node4;
        //        node2.right = node5;
        //        node4.left = node7;
        //        node5.left = node6;
        //        node3.left = node8;
        //        node3.right = node9;


        // 打印二叉树
        TreeNodeUtils.toString(treeNode);

        System.err.println(getMaxWidth(treeNode));
        //        List<Integer> list;
        //
        //        //        list = preOderTraverse(treeNode);
        //        list = postOrderTraverse(treeNode);
        //
        //
        //        System.out.println(Arrays.toString(list.toArray()));
    }
}
