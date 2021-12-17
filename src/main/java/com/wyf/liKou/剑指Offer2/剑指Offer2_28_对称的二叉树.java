package com.wyf.liKou.剑指Offer2;

import com.wyf.utils.TreeNode;

/**
 * @Author wangyifei
 * @Date $ $
 * @Param $
 * @return $
 **/
public class 剑指Offer2_28_对称的二叉树 {
    public static void main(final String[] args) {

    }

    /**
     * 请实现一个函数，用来判断一棵二叉树是不是对称的。如果一棵二叉树和它的镜像一样，那么它是对称的。
     * <p>
     * 例如，二叉树[1,2,2,3,4,4,3] 是对称的。
     * 示例 1：
     * <p>
     * 输入：root = [1,2,2,3,4,4,3]
     * 输出：true
     * 示例 2：
     * <p>
     * 输入：root = [1,2,2,null,3,null,3]
     * 输出：false
     * <p>
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/dui-cheng-de-er-cha-shu-lcof
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    public boolean isSymmetric(final TreeNode root) {
        return null == root || helper(root.left, root.right);
    }

    public boolean helper(TreeNode root1, TreeNode root2) {
        if (null == root1 && null == root2) {
            return true;
        }
        if (null == root1 || null == root2) {
            return false;
        }
        return root1.val == root2.val
                && helper(root1.left, root2.right)
                && helper(root1.right, root2.left);
    }

}
