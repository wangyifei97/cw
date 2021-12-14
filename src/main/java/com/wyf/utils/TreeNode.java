package com.wyf.utils;

/**
 * @className: com.wyf.utils-> TreeNode
 * @author: 王一飞
 * @createDate: 2021-12-06 11:20 上午
 * @description: 二叉树
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    // nodeList.get(parentIndex).left=nodeList.get(parentIndex*2+1);
    public TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}
