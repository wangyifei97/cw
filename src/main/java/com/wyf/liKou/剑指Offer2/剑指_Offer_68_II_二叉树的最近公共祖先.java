package com.wyf.liKou.剑指Offer2;

import com.wyf.utils.TreeNode;

import java.util.*;

/**
 * @className: com.wyf.liKou.剑指Offer2-> 剑指_Offer_68_II_二叉树的最近公共祖先
 * @author: 王一飞
 * @createDate: 2021-12-14 8:26 下午
 * @description: 剑指 Offer_68_II_二叉树的最近公共祖先
 */
public class 剑指_Offer_68_II_二叉树的最近公共祖先 {
    /**
     * 方法三：存储父节点
     * 思路
     * <p>
     * 我们可以用哈希表存储所有节点的父节点，然后我们就可以利用节点的父节点信息从 p 结点开始不断往上跳，并记录已经访问过的节点，再从 q 节点开始不断往上跳，如果碰到已经访问过的节点，那么这个节点就是我们要找的最近公共祖先。
     * <p>
     * 算法
     * <p>
     * 从根节点开始遍历整棵二叉树，用哈希表记录每个节点的父节点指针。
     * 从 p 节点开始不断往它的祖先移动，并用数据结构记录已经访问过的祖先节点。
     * 同样，我们再从 q 节点开始不断往它的祖先移动，如果有祖先已经被访问过，即意味着这是 p 和 q 的深度最深的公共祖先，即 LCA 节点。
     * <p>
     * 作者：LeetCode-Solution
     * 链接：https://leetcode-cn.com/problems/er-cha-shu-de-zui-jin-gong-gong-zu-xian-lcof/solution/er-cha-shu-de-zui-jin-gong-gong-zu-xian-6fdt7/
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     */
    Map<Integer, TreeNode> parent = new HashMap<>();
    /**
     * 二叉树的最近公共祖先
     * * 思路：
     * * 三种情况：
     * * 1、p q 一个在左子树 一个在右子树 那么当前节点即是最近公共祖先
     * * 2、p q 都在左子树
     * * 3、p q 都在右子树
     */
    Set<Integer> visited = new HashSet<>();
    private TreeNode ans;

    /**
     * 方法二
     * 说明左子树和右子树均包含 pp 节点或 qq 节点，如果左子树包含的是 pp 节点，那么右子树只能包含 qq 节点，反之亦然，因为 pp 节点和 qq 节点都是不同且唯一的节点，因此如果满足这个判断条件即可说明 xx 就是我们要找的最近公共祖先。
     * 再来看第二条判断条件，这个判断条件即是考虑了 xx 恰好是 pp 节点或 qq 节点且它的左子树或右子树有一个包含了另一个节点的情况，因此如果满足这个判断条件亦可说明 xx 就是我们要找的最近公共祖先。
     * <p>
     * 你可能会疑惑这样找出来的公共祖先深度是否是最大的。其实是最大的，因为我们是自底向上从叶子节点开始更新的，所以在所有满足条件的公共祖先中一定是深度最大的祖先先被访问到。
     * <p>
     * 作者：LeetCode-Solution
     * 链接：https://leetcode-cn.com/problems/er-cha-shu-de-zui-jin-gong-gong-zu-xian-lcof/solution/er-cha-shu-de-zui-jin-gong-gong-zu-xian-6fdt7/
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     */
    public 剑指_Offer_68_II_二叉树的最近公共祖先() {
        this.ans = null;
    }

    /**
     * 剑指 Offer 68 - II. 二叉树的最近公共祖先
     * 给定一个二叉树, 找到该树中两个指定节点的最近公共祖先。
     * <p>
     * 百度百科中最近公共祖先的定义为：“对于有根树 T 的两个结点 p、q，最近公共祖先表示为一个结点 x，满足 x 是 p、q 的祖先且 x 的深度尽可能大（一个节点也可以是它自己的祖先）。”
     * <p>
     * 例如，给定如下二叉树:  root = [3,5,1,6,2,0,8,null,null,7,4]
     * <p>
     * 示例 1:
     * <p>
     * 输入: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1
     * 输出: 3
     * 解释: 节点 5 和节点 1 的最近公共祖先是节点 3。
     * 示例 2:
     * <p>
     * 输入: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 4
     * 输出: 5
     * 解释: 节点 5 和节点 4 的最近公共祖先是节点 5。因为根据定义最近公共祖先节点可以为节点本身。
     * <p>
     * <p>
     * 说明:
     * <p>
     * 所有节点的值都是唯一的。
     * p、q 为不同节点且均存在于给定的二叉树中。
     */
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);

        TreeNode root_left = new TreeNode(5);
        TreeNode root_right = new TreeNode(1);

        TreeNode root_left_left = new TreeNode(6);
        TreeNode root_left_right = new TreeNode(2);

        TreeNode root_right_left = new TreeNode(0);
        TreeNode root_right_right = new TreeNode(8);

        TreeNode root_left_right_left = new TreeNode(7);
        TreeNode root_left_right_right = new TreeNode(4);


        root.left = root_left;
        root.right = root_right;
        root_left.left = root_left_left;
        root_left.right = root_left_right;
        root.right.left = root_right_left;
        root_right.right = root_right_right;
        root_left_right.left = root_left_right_left;
        root_left_right.right = root_left_right_right;

        剑指_Offer_68_II_二叉树的最近公共祖先 剑指_offer_68_ii_二叉树的最近公共祖先 = new 剑指_Offer_68_II_二叉树的最近公共祖先();
        TreeNode treeNode = 剑指_offer_68_ii_二叉树的最近公共祖先.lowestCommonAncestor4(root, root_left_right_left, root_right_left);
        System.out.println(treeNode.val);
    }

    /**
     * 方法一
     *
     * @param root
     * @param p
     * @param q
     * @return
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // 如果树为空，直接返回null
        // 如果 p和q中有等于 root的，那么它们的最近公共祖先即为root（一个节点也可以是它自己的祖先）
        if (null == root || p == root || q == root) {
            return root;
        }

        // 递归遍历左子树，只要在左子树中找到了p或q，则先找到谁就返回谁
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        // 递归遍历右子树，只要在右子树中找到了p或q，则先找到谁就返回谁
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        // 如果在左子树中 p和 q都找不到，则 p和 q一定都在右子树中，右子树中先遍历到的那个就是最近公共祖先（一个节点也可以是它自己的祖先）
        // 否则，如果 left不为空，在左子树中有找到节点（p或q），这时候要再判断一下右子树中的情况，如果在右子树中，p和q都找不到，则 p和q一定都在左子树中，左子树中先遍历到的那个就是最近公共祖先（一个节点也可以是它自己的祖先）
        // 否则，当 left和 right均不为空时，说明 p、q节点分别在 root异侧, 最近公共祖先即为 root
        return null == left ? right : (null == right ? left : root);
    }

    private boolean dfs(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return false;
        }
        boolean lson = dfs(root.left, p, q);
        boolean rson = dfs(root.right, p, q);
        if ((lson && rson) || ((root.val == p.val || root.val == q.val) && (lson || rson))) {
            ans = root;
        }
        return lson || rson || (root.val == p.val || root.val == q.val);
    }

    public TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q) {
        this.dfs(root, p, q);
        return this.ans;
    }

    public void dfs(TreeNode root) {
        if (null != root.left) {
            parent.put(root.left.val, root);
            dfs(root.left);
        }
        if (null != root.right) {
            parent.put(root.right.val, root);
            dfs(root.right);
        }
    }

    public TreeNode lowestCommonAncestor3(TreeNode root, TreeNode p, TreeNode q) {
        dfs(root);

        while (null != p) {
            visited.add(p.val);
            p = parent.get(p.val);
        }

        while (null != q) {
            if (visited.contains(q.val)) {
                return q;
            }
            q = parent.get(q.val);
        }
        return null;
    }


    /**
     * 方法四：剑指offer书上的题解思路
     * 前序遍历根节点到p和到q的两个路径（注意剪枝） 然后两个路径逐个比对，最后一个相同的节点即为公共节点。
     */
    public TreeNode lowestCommonAncestor4(TreeNode root, TreeNode p, TreeNode q) {
        Stack<TreeNode> leftPaths = new Stack<>();
        Stack<TreeNode> rightPaths = new Stack<>();

        getPath(root, p, leftPaths);
        getPath(root, q, rightPaths);

        TreeNode result = null;
        // 保留最后一个相等的节点即为公共节点
        for (int i = 0; i < Math.min(leftPaths.size(), rightPaths.size()); i++) {
            if (leftPaths.get(i) == rightPaths.get(i)) {
                result = leftPaths.get(i);
            }
        }
        return result;
    }

    // 前序遍历搜索节点
    public void getPath(TreeNode root, TreeNode p, Stack<TreeNode> paths) {
        if (null == root) {
            return;
        }
        paths.push(root);
        if (p != paths.peek()) {
            getPath(root.left, p, paths);
        }
        if (p != paths.peek()) {
            getPath(root.right, p, paths);
        }
        if (p != paths.peek()) {
            paths.remove(root);
        }
    }
}
